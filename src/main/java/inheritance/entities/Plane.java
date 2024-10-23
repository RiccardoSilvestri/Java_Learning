package inheritance.entities;

import inheritance.abstract_classes.Vehicle;
import inheritance.interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {
    public Plane(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("the plane is about to take off.");
    }

    @Override
    public void fly() {
        System.out.println("the plane is flying");
    }
}
