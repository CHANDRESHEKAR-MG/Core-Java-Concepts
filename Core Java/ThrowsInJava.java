// What is throws?
// throws is used in a method declaration to tell Java:
// "This method may throw an exception, but I am not handling it here. The caller of this method must handle it."
class A{
    public void show() throws ClassNotFoundException 
    {
       
       // System.out.println("in A show");
    //    try{
         Class.forName("AA");

    //    }
    //    catch(ClassNotFoundException e)
    //    {
    //     System.out.println("Not able to find class"+e);
    //    }
    //    catch (Exception e){
    //     System.out.println("Something went wrong "+ e);
    //    }
    
    
    }
}

public class ThrowsInJava{
    public static void main(String[] args)
    {
       A obj = new A();
       try {
           obj.show();
           System.out.println("class found");
       } catch (ClassNotFoundException e) {
           System.out.println("Class not found: " + e.getMessage());
       }
    }
}