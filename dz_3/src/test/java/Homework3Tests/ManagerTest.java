package Homework3Tests;

import global.Manager.Manager;
import global.model.AutoVehicles.Car;
import global.model.FlyingVehicles.Helicopter;
import global.model.FlyingVehicles.Plane;
import global.model.SimpleVehicles.Bicycle;
import global.model.Vehicles.VehicleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    private Manager manager;

    @BeforeEach
    private void setup()
    {
        manager = new Manager();
    }

    @Test
    @DisplayName("Тест аренды транспортных средств")
    public void testArrendSomeVehicles()
    {
        Bicycle bicycle = new Bicycle(VehicleType.SIMPLE,0,"Velik",2,10);

        Assertions.assertEquals("Транспорт Velik успешно арендован",manager.arrendVehicle(bicycle));
        Assertions.assertEquals("Невозможно арендовать Velik",manager.arrendVehicle(bicycle));
    }
    @Test
    @DisplayName("Тест повторной аренды транспортных средств")
    public void testCantArrendSomeVehicles()
    {
        Helicopter helicopter = new Helicopter(VehicleType.FLYING,1000,"Cobra",4,1024,6);
        //Арендуем
        manager.arrendVehicle(helicopter);
        //Хотим арендовать во второй раз
        Assertions.assertEquals("Невозможно арендовать Cobra",manager.arrendVehicle(helicopter));
    }
    @Test
    @DisplayName("Тест ремонта поломанных транспортных средств")
    public void testFixSomeBrokenVehicles()
    {
        Car car = new Car(VehicleType.AUTO,100,"Elantra",105,"Бензиновый",true);
        manager.newBreak(car,"заднее колесо");

        Assertions.assertEquals("В транспорте Elantra проблема с заднее колесо",manager.newBreak(car,"заднее колесо"));
    }
    @Test
    @DisplayName("Тест ремонта не поломанных транспортных средств")
    public void testFixSomeRepairedVehicles()
    {
        Plane plane = new Plane(VehicleType.FLYING,1001,"Boeing",660,988);
        Assertions.assertEquals("Транспорт Boeing не нуждается в ремонте",manager.fixBreak(plane));
    }

}
