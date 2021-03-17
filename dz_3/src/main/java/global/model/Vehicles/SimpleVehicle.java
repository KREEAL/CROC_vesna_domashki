package global.model.Vehicles;

/**
 * Транспорт по типу велосипедов и самокатов
 */
public abstract class SimpleVehicle extends Vehicle {
    /**
     * Специфическая характеристика - количество колес
     */
    private int numberOfWheels;

    public SimpleVehicle(Enum vehicleType, int id, String name, int numberOfWheels) {
        super(vehicleType, id, name);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
