// Method Overloading in Java
// Definition:
// Method overloading means having multiple methods with the same method name but different parameters in the same class.
// The parameters can differ in:
// Number of parameters
// Type of parameters
// Order of parameters
// It is also called compile-time polymorphism because the compiler decides which method to execute during compilation.

class Calculator {

    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}
    public class MethodOverLoading{
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
    }
}


//Method overloading is a feature of Java in which a class contains multiple methods having the same name but different parameter lists. 
// It provides compile-time polymorphism. The difference can be in the number, type, or order of parameters.
//  Return type alone cannot be used for method overloading.
