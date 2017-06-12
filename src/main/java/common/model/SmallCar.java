package common.model;


public class SmallCar extends Car {

    private final FuelType fuelType;

    public SmallCar(String name, FuelType fuelType) {
        super(name);
        this.fuelType = fuelType;
    }


    @Override
    public FuelType getFuel() {
        return fuelType;
    }
}
