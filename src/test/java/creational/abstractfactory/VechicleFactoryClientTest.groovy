package creational.abstractfactory

import common.model.Car
import common.model.FuelType
import common.model.MotorBoat
import spock.lang.Specification

class VechicleFactoryClientTest extends Specification {
    def "Creates gasoline car and gasoline motorboat"() {
        given:
        VechicleFactoryClient client = new VechicleFactoryClient(new GasolineVechicleFactory())

        when:
        MotorBoat motorBoat = client.createaMotorBoat()
        Car car = client.createCar()

        then:
        motorBoat.getFuel() == FuelType.GASOLINE
        car.getFuel() == FuelType.GASOLINE
    }

    def "Creates lpg car and lpg motorboat"() {
        given:
        VechicleFactoryClient client = new VechicleFactoryClient(new LpgVechicleFactory())

        when:
        MotorBoat motorBoat = client.createaMotorBoat()
        Car car = client.createCar()

        then:
        motorBoat.getFuel() == FuelType.LPG
        car.getFuel() == FuelType.LPG
    }
}
