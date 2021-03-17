package global.model.FlyingVehicles;

import global.model.Vehicles.FlyingVehicle;

/**
 * Самолет
 */
public class Plane extends FlyingVehicle {

    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер(1000-1999)
     * @param name имя транспорта
     * @param peopleAmount вместимость людей
     * @param enginePower мощность двигателя
     */
    public Plane(Enum vehicleType, int id, String name, int peopleAmount, int enginePower) {
        super(vehicleType, id, name, peopleAmount, enginePower);
    }
}
