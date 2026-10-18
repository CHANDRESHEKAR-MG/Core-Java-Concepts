import java.util.*;
class  Student{
    int age;
    String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Student [Age="+age+", name="+name+"]";
    }
}
public class collectionInterface{
    public static void main(String[] args) {
        ArrayList<Student> c5 = new ArrayList<>();
        c5.add(new Student (21,"navin"));
        c5.add(new Student (91,"ranga"));
        c5.add(new Student (71,"narada"));
        c5.add(new Student (81,"malla"));
        System.out.println(c5);
        for (Student s : c5 ){
            System.out.println(s);
        }
        //sort vbased on age

// Comparator<Student> num1 = new Comparator<Student>()
//         {
//               public int compare(Student i, Student j)
//               {
//                 if(i.age>j.age){
//                     return 1;

//                 }
//                 else{
//                     return -1;
//                 }
//               }
//         };
Comparator<Student> num1 = (i,j)->i.age>j.age?1:-1;

        Collections.sort(c5,num1);
        System.out.println("Sort based on age");
        for(Student s1 : c5){
            
            System.out.println(s1);
        }


        ArrayList<Integer> c4 = new ArrayList<Integer>();
        c4.add(57);
        c4.add(92);
        c4.add(11);
        c4.add(780);
        System.out.println(c4);
        //to sort this list based on last v=digit using comparator
        // Comparator<Integer> num = new Comparator<Integer>()
        // {
            //   public int compare(Integer i, Integer j)
            //   {
            //     if(i%10>j%10){
            //         return 1;
            //     }
            //     else {
            //         return -1;
            //     }
            //   }
    //};
            //lambda expression 
            System.out.println("from labda express");
            Comparator<Integer> num = (i,j) -> i%10 > j%10?1:-1;


        Collections.sort(c4,num);
        System.out.println(c4);

        //ArrayList is a Non Contigious memory and it is a fixed size it a variable in size  so 
                //Collection c = new Collection();
        ArrayList<Integer> c = new ArrayList<Integer>();
        System.out.println("ArrayList");
        c.add(7);
        c.add(9);
        c.add(11);
        System.out.println("List"+c);
        //to adda specific index 
        // ndex, vallue 
        c.add(2, 12);
        System.out.println("Added to index 2");
         System.out.println("List"+c);
        for(int n : c){
            System.out.println(n);
            
        }
        //set element 
        c.set(0,111);
         System.out.println("List"+c);
         //to delete an index element
         c.remove(1);
          System.out.println("List"+c);
          //to size
          int size =c.size();
           System.out.println("size "+size);

           //Sort collect 
           Collections.sort(c);
            System.out.println("Sort  = "+c);
             

     System.out.println(c.get(2));
     Set<Integer> c1 = new HashSet<Integer>();//Accept only uique
     System.out.println("HAshSet");
        c1.add(71);
        c1.add(169);
        c1.add(110);
        for(int n1 : c1){
            System.out.println(n1);
            
        }
        Collection<Integer> c2 = new TreeSet<Integer>();//In SORTed orderr
        System.out.println("TreeSet");
        c2.add(78);
        c2.add(946);
        c2.add(161);
        System.out.println(c2.contains(2));
        
        for(int n2 : c2){
            System.out.println(n2);
            
        }
        HashMap<String,Integer> c3 = new HashMap<>();//In SORTed orderr
        System.out.println("Hashmap");
        c3.put("harsh",1);
        c3.put("kempi",2);
        c3.put("timmanna",85);
        c3.put("konga",3);
       // c3.put(key, value)
       System.out.println(c3);
       System.out.println(c3.keySet());//provide all keys 
       for (String key : c3.keySet()){
        System.out.println(key +" : "+c3.get(key));
       }
       System.out.println(c3.containsValue(1));
       System.out.println(c3.entrySet());
        System.out.println(c2.contains(2));
        System.out.println(c3.containsKey(58));
        System.out.println(c3.values());
        System.out.println(c3.remove("kempi",2));
        System.out.println(c3);
        System.out.println(c3.remove("konga"));
        System.out.println(c3);
        
        // for(int n3 : c3){
        //     System.out.println(n3);
            
        // }
        c.isEmpty();
        c.toString();

    }
}