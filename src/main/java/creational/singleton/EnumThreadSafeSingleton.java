package creational.singleton;


import creational.abstractfactory.GasolineVechicleFactory;
import creational.abstractfactory.LpgVechicleFactory;

public enum EnumThreadSafeSingleton {
    INSTANCE(new GasolineVechicleFactory(), new LpgVechicleFactory());

    private GasolineVechicleFactory gasolineVechicleFactory;
    private LpgVechicleFactory lpgVechicleFactory;

    EnumThreadSafeSingleton(GasolineVechicleFactory gasolineVechicleFactory, LpgVechicleFactory lpgVechicleFactory) {
        this.gasolineVechicleFactory = gasolineVechicleFactory;
        this.lpgVechicleFactory = lpgVechicleFactory;
    }
}
