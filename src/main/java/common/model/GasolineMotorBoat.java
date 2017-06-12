package common.model;


public class GasolineMotorBoat extends MotorBoat {

    public GasolineMotorBoat(String name) {
        super(name);
    }

    @Override
    public FuelType getFuel() {
        return FuelType.GASOLINE;
    }
}
