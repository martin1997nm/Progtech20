package Beadando.BelsoEgesu;

import Beadando.Car;
import Beadando.Factory;
import Beadando.Decorator.Coupe;


public class ToyotaCelicaGyar extends Factory{

    @Override
    public Car Make() {
        return new Coupe(new Toyota());
    }
    
}
