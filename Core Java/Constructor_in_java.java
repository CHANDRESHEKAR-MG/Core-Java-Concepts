 class Constructor_in_java {
    // Instance or Global variables are declared as private to achieve encapsulation.
    private String name; 
    private int rollno;
    private int marks;

    public Constructor_in_java(){// default constructor is called when an object of a class is created. 
        // It does not take any parameters.
        name = "Chandu";
        rollno = 1;
        marks = 90;
        System.out.println("Default constructor is called");
    }

    public Constructor_in_java(String name, int rollno, int marks){// parameterized constructor is called when an object of a class is created. 
        // It takes parameters to initialize the objects of a class.
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        System.out.println("Parameterized constructor is called");
    }
    public void setName(String name) {// sets the name of the student
        this.name = name;// name is a local variable and name is an instance variable. 
        // this keyword is used to refer to the current object.

       
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

   // public class Constructor_in_java {
    public static void main(String[]args){
        // Constructors are special methods that are called when an object of a class is created.
        // They have the same name as the class and do not have a return type.
        // Constructors are used to initialize the objects of a class.
        // There are two types of constructors in Java:
        // 1. Default constructor: It does not take any parameters.
        // 2. Parameterized constructor: It takes parameters to initialize the objects of a class.
        // Therefore, it is also known as data hiding.
        // To achieve encapsulation in Java:
        // 1. Declare the variables of a class as private.  
        // 2. Provide public setter and getter methods to modify and view the variables values.
        
         Constructor_in_java s = new Constructor_in_java();//default constructor is called when an object of a class is created. 
        // It does not take any parameters.
        // s.setName("Chandreshekar");// sets the name of the student
        // s.setRollno(1);
        // s.setMarks(90);

        Constructor_in_java s2 = new Constructor_in_java("Chandreshekar", 1, 99);   

        System.out.println("Name: "+s.getName());// gets the name of the student               
        System.out.println("Roll No: "+s.getRollno());
        System.out.println("Marks: "+s.getMarks());

         System.out.println("Name: "+s2.getName());// gets the name of the student               
        System.out.println("Roll No: "+s2.getRollno());
        System.out.println("Marks: "+s2.getMarks());
       }
   }
