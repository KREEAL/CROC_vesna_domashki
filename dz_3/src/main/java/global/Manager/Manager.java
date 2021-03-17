package global.Manager;

import global.model.Vehicles.Vehicle;

/**
 * Менеджер транспорта
 */
public class Manager {


    /**
     *арендовать транспорт
     *
     * @param vehicle
     * @return результат аренды
     */
    public String arrendVehicle(Vehicle vehicle)
    {
        if(!vehicle.isArrended()&&!vehicle.isBroken()) {
            vehicle.setArrended(true);
            return "Транспорт "+vehicle.getName()+" успешно арендован";
            }
        else{
            return "Невозможно арендовать "+vehicle.getName();
            }
    }

    /**
     * вернуть транспорт из аренды
     *
     * @param vehicle
     * @return результат возвращения транспорта в фирму
     */
    public String returnVehicle(Vehicle vehicle)
    {
        if(vehicle.isArrended()) {
            vehicle.setArrended(false);
            return "Транспорт "+vehicle.getName()+" успешно сдан обратно";
        }
        else{
            return "Транспорт "+vehicle.getName()+" уже сдан";
        }
    }

    /**
     * добавить поломку
     *
     * @param vehicle
     * @param detail имя детали, которая поломалась
     * @return сообщение о поломке детали
     */
    public String newBreak(Vehicle vehicle,String detail)
    {
        vehicle.setBroken(true);
        return "В транспорте "+vehicle.getName()+" проблема с "+detail;
    }

    /**
     * починить транспорт
     *
     * @param vehicle
     * @return сообщение о починке транспорта
     */
    public String fixBreak(Vehicle vehicle)
    {
        if(vehicle.isBroken()) {
            vehicle.setBroken(false);
            return "Транспорт " + vehicle.getName() + " успешно отремонтирован";
        }
        else{
            return "Транспорт "+vehicle.getName()+" не нуждается в ремонте";
        }
    }
}
