package creational.abstractfactory;


import common.model.Car;
import common.model.MotorBoat;

public class VechicleFactoryClient {
    private final VechicleFactory vechicleFactory;

    public VechicleFactoryClient(VechicleFactory vechicleFactory) {
        this.vechicleFactory = vechicleFactory;
    }

    public Car createCar() {
        return vechicleFactory.createCar();
    }

    public MotorBoat createaMotorBoat() {
        return vechicleFactory.createMotorBoat();
    }
}
