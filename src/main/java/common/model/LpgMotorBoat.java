package common.model;


public class LpgMotorBoat extends MotorBoat {
    public LpgMotorBoat(String name) {
        super(name);
    }

    @Override
    public FuelType getFuel() {
        return FuelType.LPG;
    }
}
