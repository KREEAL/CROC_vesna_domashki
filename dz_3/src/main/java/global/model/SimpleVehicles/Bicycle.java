package global.model.SimpleVehicles;

import global.model.Vehicles.SimpleVehicle;

/**
 * Велосипед
 */
public class Bicycle extends SimpleVehicle {

    private int speedsCount;

    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер (0-99)
     * @param name имя транспорта
     * @param numberOfWheels кол-во колес
     * @param speedsCount кол-во скоростей
     */
    public Bicycle(Enum vehicleType, int id, String name, int numberOfWheels, int speedsCount) {
        super(vehicleType, id, name, numberOfWheels);
        this.speedsCount = speedsCount;
    }

    public int getSpeedsCount() {
        return speedsCount;
    }

    public void setSpeedsCount(int speedsCount) {
        this.speedsCount = speedsCount;
    }
}
