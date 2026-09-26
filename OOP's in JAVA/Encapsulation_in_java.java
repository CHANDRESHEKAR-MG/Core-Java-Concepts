 class Encapsulation{
    // Instance or Global variables are declared as private to achieve encapsulation.
    private String name;
    private int rollno;
    private int marks;

    public void setName(String NameString) {// sets the name of the student
        name = NameString;// NameString is a local variable and name is an instance variable. 
        // this keyword is used to refer to the current object.

        // this keyword is used to refer to the current object.
        //  It is used to differentiate between the instance variable and the local variable.
    }

    public String getName() {// gets the name of the student
        return name;// returns the value of the instance variable name
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public class Constructor_in_java {
    public static void main(String[]args){
        
        // Encapsulation is the process of wrapping data (variables) and 
        // code (methods) together as a single unit.
        // In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
        // Therefore, it is also known as data hiding.
        // To achieve encapsulation in Java:
        // 1. Declare the variables of a class as private.
        // 2. Provide public setter and getter methods to modify and view the variables values.

        Encapsulation s = new Encapsulation();//
        s.setName("Chandreshekar");// sets the name of the student
        s.setRollno(1);
        s.setMarks(90);

        System.out.println("Name: "+s.getName());// gets the name of the student               
        System.out.println("Roll No: "+s.getRollno());
        System.out.println("Marks: "+s.getMarks());
       }
   }
}