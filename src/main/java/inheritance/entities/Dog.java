package inheritance.entities;

import inheritance.abstract_classes.Animal;

public class Dog extends Animal {



    public Dog(String name, String collarColor){
        super(name);
        collarColor = "";
    }



    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
