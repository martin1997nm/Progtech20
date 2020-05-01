package Beadando.Elektromos;

import Beadando.Car;
import Beadando.Factory;
import Beadando.Decorator.Suv;


public class TeslaModel3Gyar extends Factory{

    @Override
    public Car Make() {
        return new Suv(new Tesla());
    }
    
}
