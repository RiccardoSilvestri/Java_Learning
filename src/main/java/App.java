import inheritance.entities.Car;
import inheritance.entities.Dog;
import inheritance.entities.Plane;

public class App
{
    public static void main( String[] args ) {
        Dog dog = new Dog("Bobby","red");
        Car car = new Car("Panda");
        Plane plane = new Plane("Boeing 747");
        doSomething(dog,car,plane);

    }
    public static void doSomething(Dog dog, Car car, Plane plane) {
        System.out.println("This is my dog, " + dog.getName());
        dog.makeSound();

        System.out.println("This is my car, " + car.getModel());
        car.move();

        System.out.println("I flew on a " + plane.getModel());
        plane.move();
        plane.fly();

    }
}
