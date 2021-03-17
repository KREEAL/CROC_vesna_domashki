package global.model.AutoVehicles;

import global.model.Vehicles.AutoVehicle;

/**
 * Кабриолет
 */
public class Cabriolet extends AutoVehicle {
    //скорость закрытия крыши
    private int roofClosingSpeed;

    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер (100-999)
     * @param name название машины
     * @param horsePower кол-во лошадиных сил в двигателе
     * @param engineType тип двигателя
     * @param roofClosingSpeed скорость закрытия крыши(с)
     */
    public Cabriolet(Enum vehicleType, int id, String name, int horsePower, String engineType, int roofClosingSpeed) {
        super(vehicleType, id, name, horsePower, engineType);
        this.roofClosingSpeed = roofClosingSpeed;
    }

    public int getRoofClosingSpeed() {
        return roofClosingSpeed;
    }

    public void setRoofClosingSpeed(int roofClosingSpeed) {
        this.roofClosingSpeed = roofClosingSpeed;
    }
}
