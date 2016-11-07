package StacksAndQueues;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.jar.Pack200;

/**
 * Created by radha on 11/6/16.
 */
public class ThreeSix {
    class Animal {
        String name;
        int age;
        Date timeOfArrival;
        Animal(String name) {
            this.name = name;
        }
    }
    class Dog extends Animal {
        Dog(String name) { super(name); }
    }
    class Cat extends Animal {
        Cat(String name) { super( name); }
    }
    LinkedList<Dog> dogs = new LinkedList();
    LinkedList<Cat> cats = new LinkedList();

    public void enqueue(Animal animal) {
        animal.timeOfArrival =  new Date();
        if (animal instanceof Dog) {
            dogs.addLast((Dog)animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        } else {
            System.out.println("Animal is not accepted here.");
        }
    }

    public Animal dequeueAny() {
        Cat firstCat = cats.peekFirst();
        Dog firstDog = dogs.peekFirst();
        if (firstCat == null && firstDog == null) {
            return null;
        } else if (firstCat == null) {
            return dequeueDog();
        } else if (firstDog == null) {
            return dequeueCat();
        } else {
            if (firstCat.timeOfArrival.before(firstDog.timeOfArrival)) {
                return dequeueCat();
            } else {
                return dequeueDog();
            }
        }

    }

    public Dog dequeueDog() {
        return dogs.removeFirst();

    }

    public Cat dequeueCat() {
        return cats.removeFirst();
    }

}
