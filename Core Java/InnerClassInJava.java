class A{
    int age ;
    public void show(){
        System.out.println("Age is "+age);
    }
    class B{
        public void display(){
            System.out.println("Age is "+age);
        }
    }
}
public class InnerClassInJava{
    public static void main(String[] args){
        A obj = new A();
        obj.age = 25;
        obj.show();
      //  B obj1=new B(); // This line will cause a compilation error because B is an inner class and cannot be instantiated like this.
        A.B nestedObj = obj.new B();// Creating an instance of the inner class B using the instance of the outer class A
        //A.B A is outer clas and B is inner class first we need the object for outer class to create the object for the innerclass using the outer class object
        
        nestedObj.display();
    }
}