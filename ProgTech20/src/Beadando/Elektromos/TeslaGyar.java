package Beadando.Elektromos;

import Beadando.Car;
import Beadando.Factory;


public class TeslaGyar extends Factory{

    @Override
    public Car Make() {
        return new Tesla();
    }
    
}
