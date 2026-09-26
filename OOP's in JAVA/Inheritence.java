
// Inheritance means one class can acquire the variables and methods of another class.

// It helps us reuse code instead of writing the same code again
//parent class animal

// Types of Inheritance in Java

// There are 5 commonly discussed types of inheritance in Java/OOP:

// Single Inheritance
// Multilevel Inheritance
// Hierarchical Inheritance
// Multiple Inheritance  // java does not support 
// Hybrid Inheritance

//Single level inheritence
class Animal{
    String name;
    public void eat(){
        System.out.println("Animal is eating");

    }

}
// Now we create a Dog class that inherits from Animal:

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }
}
//MultiLevel Inheritence

class calc{
    
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
class Advcalc extends calc{
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvcalc extends Advcalc{
    public int pow(int n1, int n2){
        return (int) Math.pow(n1, n2); 
    }
    public int remain(int n1, int n2){
        return n1%n2;
    }
}

//herirachial level inhritence
class Animal1 {
    void eat() {
        System.out.println("Eating");
    }
}

class Dogs extends Animal1 {
    void bark() {
        System.out.println("Barking");
    }
}

class Cats extends Animal1 {
    void meow() {
        System.out.println("Meowing");
    }
}
public class Inheritence{
    public  static void main(String[] args) {
        Dog d = new Dog();
        d.name= "Vicky";
        d.eat();//inherited from animal class

        d.bark();// dog class pwn method
        System.out.println(d.name);

        VeryAdvcalc c = new VeryAdvcalc();
        int r1= c.add(2, 3);
        int r2=c.sub(3, 6);
        int r3=c.mul(3, 6);
        int r4=c.div(3, 6);
        int r5=c.pow(3,3);
        int r6=c.remain(10,3);

        System.out.println("add "+r1+" "+ "sub "+":"+r2+" mul "+r3+" div "+r4+
            " power : "+ r5+" remainder : "+ r6        );

            Dogs d1 = new Dogs();
            d1.eat();//Animal1 class 
            d1.bark();
            Cats c1  = new Cats();
            c1.eat();//Animal1 class
            c1.meow();

            

    }
}



// Important Terms
// Term	Meaning
// Parent class	Class whose properties are inherited
// Child class	Class that inherits properties
// Superclass	Another name for parent class
// Subclass	Another name for child class
// extends	Keyword used for inheritance