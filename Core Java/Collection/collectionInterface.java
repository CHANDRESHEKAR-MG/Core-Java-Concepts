import java.util.*;
class collectionInterface{
    public static void main(String[] args) {
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
        HashMap<Integer,Integer> c3 = new HashMap<>();//In SORTed orderr
        System.out.println("Hashmap");
        c3.put(78,1);
        c3.put(95,2);
        c3.put(58,85);
        c3.put(728,3);
       // c3.put(key, value)
        System.out.println(c2.contains(2));
        System.out.println(c3.containsKey(58));
        
        // for(int n3 : c3){
        //     System.out.println(n3);
            
        // }
        c.isEmpty();
        c.toString();

    }
}