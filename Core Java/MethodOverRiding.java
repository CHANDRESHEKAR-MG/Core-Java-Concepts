
//method overloading means same method name with different parameter and
//  method overing means if a parent and child class both have same method name but parent class overide  to child class executes
//  the child class method if the child class dont have that method that was declared inside the  main now that parent class metod
//  will be executedmeans overide means if you have execute otherwise check at you parent

// if both parent and child class have the same method the child will overideen method executed
class A{
    public void show(){
        System.out.println("in A show");

    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");

    }
    // public void config(){
    //     System.out.println("in B config");
    // }
}

class MethodOverRiding{
    public static void main (String [] args){

        B obj = new B();
        obj.show();
        obj.config();
    }
}