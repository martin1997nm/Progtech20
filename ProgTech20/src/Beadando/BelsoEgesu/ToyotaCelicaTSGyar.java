package Beadando.BelsoEgesu;

import Beadando.Car;
import Beadando.Factory;
import Beadando.Decorator.TS;


public class ToyotaCelicaTSGyar extends Factory{

    @Override
    public Car Make() {
        return new TS(new ToyotaCelica());
    }
    
}
