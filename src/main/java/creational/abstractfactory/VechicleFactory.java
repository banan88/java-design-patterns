package creational.abstractfactory;

import common.model.Car;
import common.model.MotorBoat;

public interface VechicleFactory {
    Car createCar();

    MotorBoat createMotorBoat();
}
