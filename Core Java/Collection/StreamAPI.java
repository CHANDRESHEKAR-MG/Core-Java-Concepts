import java.util.*;
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