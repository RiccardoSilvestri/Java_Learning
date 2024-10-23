package inheritance.entities;

import inheritance.abstract_classes.Vehicle;
import inheritance.interfaces.Movable;

public class Car extends Vehicle implements Movable {
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}
