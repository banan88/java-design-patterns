package common.model;

public class MediumCar extends Car {
    private final FuelType fuelType;

    public MediumCar(String name, FuelType fuelType) {
        super(name);
        this.fuelType = fuelType;
    }

    @Override
    public FuelType getFuel() {
        return fuelType;
    }
}
