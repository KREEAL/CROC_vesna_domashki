package global.model.AutoVehicles;

import global.model.Vehicles.AutoVehicle;

/**
 * Обычная машина
 */
public class Car extends AutoVehicle {
    //крепежи на крыше
    private boolean roofMounts;
    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер (100-999)
     * @param name название машины
     * @param horsePower кол-во лошадиных сил в двигателе
     * @param engineType тип двигателя
     * @param roofMounts есть ли крепежи на крыше
     */

    public Car(Enum vehicleType, int id, String name, int horsePower, String engineType, boolean roofMounts) {
        super(vehicleType, id, name, horsePower, engineType);
        this.roofMounts = roofMounts;
    }



    public boolean isRoofMounts() {
        return roofMounts;
    }

    public void setRoofMounts(boolean roofMounts) {
        this.roofMounts = roofMounts;
    }
}
