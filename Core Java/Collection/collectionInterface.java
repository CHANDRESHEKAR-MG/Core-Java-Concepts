import java.util.*;
class collectionInterface{
    public static void main(String[] args) {
        //Collection c = new Collection();
        Collection<Integer> c = new ArrayList<Integer>();
        System.out.println("ArrayList");
        c.add(7);
        c.add(9);
        c.add(11);
        for(int n : c){
            System.out.println(n);
            
        }
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
        for(int n2 : c2){
            System.out.println(n2);
            
        }
        c.isEmpty();
        c.toString();

    }
}