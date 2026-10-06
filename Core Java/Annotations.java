//@deprecated // this annotation is used to indicate that the marked element is deprecated and should no longer be used. It serves as a warning to developers that the element may be removed in future versions of the code.
class A{
  
    public void showTheDataWhichBelongdToThisClass(){
    System.out.println("A show");

}
}
class B extends A{

    @Override  // to avoid mistakes we can use @Override annotation to avoid this kind of mistakes   
    public void showTheDataWhichBelongdToThisClass(){//sometimes the long method names are not give wrong answers like  it will give answers of parent class methods because of the long method name so to avoid this we can use @Override annotation to avoid this kind of mistakes
        System.out.println("B show");
    }

}


class Annotations{
    public void show(){
        System.out.println("Annotations show");
    }
    public static void main (String[] args){

    B b = new B();
    b.showTheDataWhichBelongdToThisClass();
    }
}