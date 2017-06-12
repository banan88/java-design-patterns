package creational;

import com.google.common.collect.ImmutableMap;
import common.exception.CarCreationException;
import common.model.*;

import java.util.Map;

public class SimpleCarFactory {
    private static final Map<VechicleSize, Car> CAR_SIZE_MAPPING = ImmutableMap.of(
            VechicleSize.SMALL, new SmallCar("Matiz", FuelType.DIESEL),
            VechicleSize.MEDIUM, new MediumCar("Golf", FuelType.GASOLINE)
    );

    private SimpleCarFactory() {
    }

    public static Car createCar(VechicleSize size) {
        Car car = CAR_SIZE_MAPPING.get(size);
        if (car == null) {
            throw new CarCreationException();
        }
        return car;
    }
}
