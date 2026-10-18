import java.util.*;
import java.util.function.Consumer;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5, 56, 5550, 55552,45,78);
        System.out.println("in for norrmal loop local ");
        List<Integer> sep = new ArrayList<>();
        for(int n : numbers){
            if(n%2==0){
                int n1=n*2;
                sep.add(n1);

                System.out.println("doubled values "+n1);
            }

        }
        System.out.println("LIST  "+sep);
        System.out.println("All numbers:");

        System.err.println("Anonymous class ");

        List<Integer> num2 =  Arrays.asList(2,4,5,6,8,7,9,9,3,33);
        // Consumer<Integer> con = new Consumer<Integer>()
        // {
        //    public void accept(Integer n2){
        //     System.out.println("ANONY  "+n2);
        //    } 
        // };
        //num2.forEach(con);
        //lambda expression
System.out.println("lambda expression ");
        Consumer<Integer> con = (Integer n2)->
        {
            System.out.println("ANONY  "+n2);
           
        };
        num2.forEach(con);//for each loop inteface
System.out.println("Without anonymous class reference FOR each called in lmbda epress");
num2.forEach(n3->System.out.println("no class created ->"+n3));
        System.out.println("Stream API :");
        numbers.stream().forEach(System.out::println);

        System.out.println("Numbers greater than 50, doubled and sorted:");
        numbers.stream()
                .filter(number -> number > 50)
                .map(number -> number * 2)
                .sorted()
                .forEach(System.out::println);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
    }
}