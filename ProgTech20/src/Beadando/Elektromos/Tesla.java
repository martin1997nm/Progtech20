package Beadando.Elektromos;

import Beadando.Car;


public class Tesla extends Car {

    @Override
    public String GetMake() {
        return "Tesla";
    }

    @Override
    public String GetModel() {
        return "Modell S";
    }

    @Override
    public int GetSeats() {
        return 4;
    }

    @Override
    public int GetHorsePower() {
        return 700;
    }
    
}
