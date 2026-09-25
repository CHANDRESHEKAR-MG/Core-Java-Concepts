// //
// In Java, the static keyword means that a member belongs to the class itself, rather than to individual objects.

// You can use static with:

// Static variable
// Static method
// Static block
// Static nested class


// 1. Static Variable

// A static variable is shared by all objects of a class.

// Without static
class Mobile1 {
    String brand;
    int price;

     public void show() {
        System.out.println(brand + " " + price );
    }
}

// With static variable
class Mobile2 {
    String brand;
    int price;

    static String category = "Smartphone";

    public void show() {
        System.out.println(brand + " " + price + " " + category);
    }
}


// 2. Static Method

// A method declared with static belongs to the class, not to an object.
//static method is used bcz we no need to create object direcly we should class name
//use class name with method
class Calculator {

    static int add(int a, int b) {
        return a + b;

    }
}
public class static_keyword_injava {
    public static void main(String[] args) {

        // Without static
        Mobile1 m1 = new Mobile1();
        m1.brand = "Apple";
        m1.price = 80000;

        Mobile1 m2 = new Mobile1();
        m2.brand = "Samsung";
        m2.price = 60000;


        // With static
        Mobile2 m3 = new Mobile2();
        m3.brand = "Apple";
        m3.price = 80000;

        Mobile2 m4 = new Mobile2();
        m4.brand = "Samsung";
        m4.price = 60000;
        
        m1.show();
        m2.show();

        m3.show();
        m4.show();

        System.out.println(Mobile2.category);

        int res=Calculator.add(10, 20);
        System.out.println(res);

    }
}

// here, every object gets its own copy of brand and price.






// class Mobile{
//     static String name="smartphone"
//     String brand;
//     int price;
//     //String network;
//     //String name;
//     public void show(){
//         System.out.println(brand+" "+ price+" "+name+" ");

//     }

// }
// public class static_keyword_injava{
//     public static void main(String[] args) {
//         Mobile obj1 = new Mobile();
//         obj1.brand="Apple";
//         obj1.price=180000;
//         obj1.name="smartphone";

//         Mobile obj2 = new Mobile();
//         obj2.brand="realme";
//         obj2.price=18000;
//         obj2.name="smartphone";

//         obj1.show();
//         obj2.show();
        
        


//     }

// }