package Beadando.BelsoEgesu;

import Beadando.Car;
import Beadando.Factory;


public class ToyotaGyar extends Factory{

    @Override
    public Car Make() {
        return new ToyotaCelica();
    }
    
}
