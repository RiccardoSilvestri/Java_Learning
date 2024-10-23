package inheritance.abstract_classes;

public abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void move();
}
