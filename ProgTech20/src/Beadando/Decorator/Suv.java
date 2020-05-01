package Beadando.Decorator;

import Beadando.Car;


public class Suv extends CarDecorator {
 
    @Override
    public String GetMake() {
        return super.GetMake()+" Toyota";
    }
    
    @Override
    public String GetModel() {
        return " CH-R";
    }
    
    @Override
    public int GetHorsePower() {
        return 130;
    }
    
    public Suv(Car car) {
        super(car);
    }
}
