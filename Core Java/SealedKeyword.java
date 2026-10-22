/*
 * WHAT:
 * A sealed class or interface restricts which classes can directly extend
 * or implement it. The permitted types are listed with the permits clause.
 *
 * WHY:
 * Sealed types let you control a class hierarchy. This is useful when a
 * program should support a known set of subtypes without allowing any
 * unrelated class to extend the parent.
 *
 * Every permitted direct subclass must choose one of these modifiers:
 *   final     - cannot be extended further
 *   sealed    - restricts its own permitted subclasses
 *   non-sealed - allows any class to extend it
 *
 * Sealed classes and interfaces were finalized in Java 17.
 */
sealed abstract class Vehicle permits Car, Bike { // sealed class here vehicle only permit to the Car Bike to cess or extends vehicle clas
//permits classes myust be declare with the final or the non-sealed keyword
//you can declare with any one of that keyword and if the keyword is final that next that calss canot be extended to another calss but if if that class is a non-sealed this class can accepts extensd
 
    abstract void move();
}

// final closes this branch of the Vehicle hierarchy.
final class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is driving");
    }
}

// non-sealed reopens this branch so other classes can extend Bike.
non-sealed class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}

// This is allowed because Bike is non-sealed.
class MountainBike extends Bike {
    @Override
    void move() {
        System.out.println("Mountain bike is riding on a trail");
    }
}

public class SealedKeyword {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle mountainBike = new MountainBike();

        car.move();
        bike.move();
        mountainBike.move();
    }
}
