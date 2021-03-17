package global.model.SimpleVehicles;

import global.model.Vehicles.SimpleVehicle;

/**
 * Самокат
 */
public class KickScooter extends SimpleVehicle {


    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер (0-99)
     * @param name имя транспорта
     * @param numberOfWheels кол-во колес
     */
    public KickScooter(Enum vehicleType, int id, String name, int numberOfWheels) {
        super(vehicleType, id, name,numberOfWheels);
    }
}
