package global.model.FlyingVehicles;

import global.model.Vehicles.FlyingVehicle;

/**
 * Вертолет
 */
public class Helicopter extends FlyingVehicle {

    private int bladeCount;


    /**
     *
     * @param vehicleType тип транспорта
     * @param id уникальный номер (1000-1999)
     * @param name имя транспорта
     * @param peopleAmount вместимость людей
     * @param enginePower мощность двигателя
     * @param bladeCount общее кол-во лопастей
     */
    public Helicopter(Enum vehicleType, int id, String name, int peopleAmount, int enginePower, int bladeCount) {
        super(vehicleType, id, name, peopleAmount, enginePower);
        this.bladeCount = bladeCount;
    }

    public int getBladeCount() {
        return bladeCount;
    }

    public void setBladeCount(int bladeCount) {
        this.bladeCount = bladeCount;
    }
}
