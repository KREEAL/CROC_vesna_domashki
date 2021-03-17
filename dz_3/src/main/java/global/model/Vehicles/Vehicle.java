package global.model.Vehicles;

/**
 * Транспорт
 */
public abstract class Vehicle {
    //Общие аттрибуты
    private Enum VehicleType;
    private int id;
    private String name;
    private boolean isArrended;
    private boolean isBroken;

    public Vehicle(Enum vehicleType, int id, String name) {

        isBroken = false;
        isArrended = false;
        this.VehicleType = vehicleType;
        this.id = id;
        this.name = name;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isArrended() {
        return isArrended;
    }

    public void setArrended(boolean arrended) {
        isArrended = arrended;
    }

    public Enum getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(Enum vehicleType) {
        VehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
