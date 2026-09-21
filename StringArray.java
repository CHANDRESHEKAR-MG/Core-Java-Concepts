class Student{
    int rollno;
    String name;
    int marks;
    
} 
public class StringArray{
    public static void main (String[]arga ){
        Student s1 = new Student();
    s1.rollno=1;
    s1.name="Chandreshekar";
    s1.marks=90;

    Student s2 = new Student();
    s2.rollno=2;
    s2.name="Alice";
    s2.marks=85;
     
    Student s3 = new Student();
    s3.rollno=3;
    s3.name="Bob";  
    s3.marks=95;

    Student students[] = new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    System.out.println(s1.name+" "+s1.rollno+" "+s1.marks);
    System.out.println(s2.name+" "+s2.rollno+" "+s2.marks);
    System.out.println(s3.name+" "+s3.rollno+" "+s3.marks);

    for(int i=0;i<students.length;i++){
        System.out.println("Roll No: "+students[i].rollno + " Name: "+students[i].name + " Marks: "+students[i].marks);

    }

    // Enhanced for loop
    // Enhanced for loop is used to iterate through the elements of an array or a collection. It is also known as for-each loop.
    //Stdent is also like a data type like int double we can also use it to create a reference variable of type Student.

    for(Student stud : students){//here Student is also a class name and stud is a reference variable of type Student. 
    // It is used to access the elements of the array.
        System.out.println("Roll No: "+stud.rollno + " Name: "+stud.name + " Marks: "+stud.marks);
    }
}
}