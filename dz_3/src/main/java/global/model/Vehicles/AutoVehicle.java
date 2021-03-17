package global.model.Vehicles;

/**
 * Транспорт по типу автомобилей
 */
public abstract class AutoVehicle extends Vehicle {
    /*Спецэффические характеристики:
    * кол-во лошадиных сил двигателя
    * тип двигателя
    * */
    private int horsePower;
    private String engineType;


    public AutoVehicle(Enum vehicleType, int id, String name, int horsePower, String engineType) {
        super(vehicleType, id, name);
        this.horsePower = horsePower;
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
