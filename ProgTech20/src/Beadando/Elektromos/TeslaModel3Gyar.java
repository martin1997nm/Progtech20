package Beadando.Elektromos;

import Beadando.Car;
import Beadando.Factory;
import Beadando.Decorator.Performance;


public class TeslaModel3Gyar extends Factory{

    @Override
    public Car Make() {
        return new Performance(new TeslaModel3());
    }
    
}
