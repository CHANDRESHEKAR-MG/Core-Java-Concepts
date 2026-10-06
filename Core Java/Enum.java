// enum is a special class that represents a group of constants (unchangeable variables, like final variables).
// enum can have methods and variables like a class and can be used to define a set of named constants.
// Enum in Java

// Enum stands for Enumeration.


// | Enum                                  | Class                                       |
// | ------------------------------------- | ------------------------------------------- |
// | Used for fixed set of values          | Used for general objects                    |
// | Constants are predefined              | Objects can normally be created using `new` |
// | Cannot extend another class           | Can extend a class                          |
// | Can implement interfaces              | Can implement interfaces                    |
// | Constructor cannot be called directly | Constructor can be called normally          |
// | Type-safe fixed values                | Flexible object creation                    |

// An enum is a special type in Java used when you have a fixed set of constant values.

// Simple example

// Suppose a day can only be:

// MONDAY
// TUESDAY
// WEDNESDAY
// THURSDAY
// FRIDAY
// SATURDAY
// SUNDAY

// Instead of using strings:

// String day = "Monday";

// we can create an enum:
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
enum Laptops {
    LAPTOP,
    DESKTOP,
    TABLET
}

enum Status {

    PENDING("Waiting"),
    APPROVED("Accepted"),
    REJECTED("Denied");

    private String message;

    Status(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

//      Enum can have variables and methods

// This is where enum becomes more powerful.


enum Laptops1{

    LAPTOP(50000),
    DESKTOP(70000),
    TABLET(30000);

    private int price;

    // Laptops1(int price1) {
    //   price = price1;
    // }
    //or
    Laptops1(int price) {// its like setter method to set the value of price variable for each enum constant
      this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
//     Output:50000 70000

// Here:LAPTOP(50000)
// calls the enum constructor:

//Laptop(int price)
}


//Enum can implement an interface

// An enum can also implement an interface:
interface Vehicle {
    void move();
}

enum Transport implements Vehicle {

    CAR,
    BUS;

    public void move() {
        System.out.println("Vehicle is moving");
    }
}
enum TypeOfVehicle implements Vehicle {   // enum can implement an interface, not extend a class
    TwoWheeler,
    ThreeWheeler,
    FourWheeler,
    MoreThanFourWheeler;

    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Enum{
    public static void main(String[] args) {
        Status s = Status.APPROVED;
        System.out.println(s.name()); // Output: APPROVED
        System.out.println(s.ordinal()); // Output: 1
        System.out.println(s); // Output: APPROVED
        System.out.println(s.getMessage()); // Output: Accepted 

         //Day day = Day.MONDAY;
        Day day = Day.SATURDAY;
        // day = Day.WEDNESDAY;
        System.out.println(day);
        
        


        switch(day) {

            case MONDAY:
                System.out.println("Start of the week");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend Day Enjoy");
                break;

            default:
                System.out.println("Working day");
        }
       



        System.out.println(Laptops.LAPTOP);
        System.out.println(Laptops.DESKTOP);
//values 
        Laptops[] computers = Laptops.values();//The values() method returns an array containing all of the values of the enum in the order they are declared.

for (Laptops c : computers) {//The for-each loop iterates over each element in the computers array, assigning each element to the variable c in each iteration.
    System.out.println(c);
} 

//valueOf
Laptops l = Laptops.valueOf("LAPTOP");

System.out.println(l);

//ordinal
System.out.println(Laptops.TABLET.ordinal());
System.out.println(Laptops.LAPTOP.ordinal());
System.out.println(Laptops.DESKTOP.ordinal());
System.out.println(Laptops.TABLET.ordinal());


System.out.println(Laptops1.LAPTOP.getPrice());//gives price of laptop
System.out.println(Laptops1.DESKTOP.getPrice());

System.out.println(Laptops1.TABLET.toString());//gives name of the enum constant

Transport.CAR.move();

TypeOfVehicle v = TypeOfVehicle.TwoWheeler;
v.move();
     
    }
}