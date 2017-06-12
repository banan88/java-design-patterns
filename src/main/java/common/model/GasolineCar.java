package common.model;


public class GasolineCar extends Car {

    public GasolineCar(String name) {
        super(name);
    }

    @Override
    public FuelType getFuel() {
        return FuelType.GASOLINE;
    }
}
