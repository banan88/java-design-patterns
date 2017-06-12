package creational.abstractfactory;


import common.model.Car;
import common.model.LpgCar;
import common.model.LpgMotorBoat;
import common.model.MotorBoat;

public class LpgVechicleFactory implements VechicleFactory {
    @Override
    public Car createCar() {
        return new LpgCar("Some lpg car");
    }

    @Override
    public MotorBoat createMotorBoat() {
        return new LpgMotorBoat("Some lpg motorboat");
    }
}
