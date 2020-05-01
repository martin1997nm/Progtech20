package Beadando.Decorator;

import Beadando.Car;


public class Coupe extends CarDecorator {
 
    @Override
    public String GetMake() {
        return super.GetMake()+" Toyota";
    }
    
    @Override
    public String GetModel() {
        return " Celica";
    }
    
    @Override
    public int GetSeats() {
        return 4;
    }
    
    @Override
    public int GetHorsePower() {
        return 192;
    }
    
    public Coupe(Car car) {
        super(car);
    }
}
