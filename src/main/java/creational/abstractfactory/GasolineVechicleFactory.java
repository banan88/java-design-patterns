package creational.abstractfactory;


import common.model.Car;
import common.model.GasolineCar;
import common.model.GasolineMotorBoat;
import common.model.MotorBoat;

public class GasolineVechicleFactory implements VechicleFactory {
    @Override
    public Car createCar() {
        return new GasolineCar("Some gasoline car");
    }

    @Override
    public MotorBoat createMotorBoat() {
        return new GasolineMotorBoat("Some gasoline boat");
    }
}
