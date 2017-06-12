package creational

import common.exception.CarCreationException
import common.model.Car
import common.model.VechicleSize
import common.model.SmallCar
import spock.lang.Specification

class SimpleCarFactoryTest extends Specification {

    def "creates a Car"() {
        when:
        Car smallCar = SimpleCarFactory.createCar(VechicleSize.SMALL)

        then:
        smallCar instanceof SmallCar == true
    }

    def "throws exception for unhandled CarSize"() {
        when:
        SimpleCarFactory.createCar(VechicleSize.LARGE)

        then:
        thrown CarCreationException
    }
}
