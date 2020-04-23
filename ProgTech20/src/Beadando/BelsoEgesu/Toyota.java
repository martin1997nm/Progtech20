package Beadando.BelsoEgesu;

import Beadando.Car;


public class Toyota extends Car {

    @Override
    public String GetMake() {
        return "Toyota";
    }

    @Override
    public String GetModel() {
        return "CH-R";
    }

    @Override
    public int GetSeats() {
        return 5;
    }

    @Override
    public int GetHorsePower() {
        return 130;
    }
    
}
