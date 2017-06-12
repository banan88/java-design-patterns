package common.model;


public class LpgCar extends Car {
    public LpgCar(String name) {
        super(name);
    }

    @Override
    public FuelType getFuel() {
        return FuelType.LPG;
    }
}
