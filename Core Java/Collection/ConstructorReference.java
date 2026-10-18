import java.util.*;
//import java.stream.Stream;
class Student{
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int setAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return "Student[name="+name+"  , age =" +age+"]";
    }

}
public class ConstructorReference{
    public static void main(String[]args){
        List<String> names=Arrays.asList("Chandu","Somanna","Maranna","Kempanna");
        List<Student> stu = new ArrayList<>();
        //normal
        for (String name : names){
            stu.add(new Student(name));
            //System.out.println(stu);

                                            
        }
      System.out.println(stu);

      //stream
      stu=names.stream()
      .map(name->new Student(name))
      .toList();
      System.out.println(stu);
//constuctor reference 
stu=names.stream()
      //.map(name->new Student(name))
      .map(Student::new)
      .toList();
      System.out.println(stu);


    }
}