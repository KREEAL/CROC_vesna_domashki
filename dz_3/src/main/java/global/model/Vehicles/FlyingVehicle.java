package global.model.Vehicles;

/**
 * Летающий транспорт
 */
public abstract class FlyingVehicle extends Vehicle {
    /*
    * Спецэфические характеристики:
    * вместимость(чел.)
    * мощность двигателя
    * */
    int peopleAmount;
    int enginePower;

    public FlyingVehicle(Enum vehicleType, int id, String name, int peopleAmount, int enginePower) {
        super(vehicleType, id, name);
        this.peopleAmount = peopleAmount;
        this.enginePower = enginePower;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
