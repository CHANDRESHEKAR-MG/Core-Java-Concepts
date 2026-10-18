import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(12,54, 586, 55590, 526,445,708);
        System.out.println("in for norrmal loop local ");
        List<Integer> sep = new ArrayList<>();
        for(int n : numbers1){
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
//Stream is an interface
Stream<Integer> s1 = num2.stream();//only onle methood should ue at a time 
Stream<Integer> s2 = num2.stream();//this is created for filter method above s1 for ForEach 
s1.forEach(n4->System.out.println("Stream -> "+n4));//only once use 
//methods 
s2.filter(n5 -> n5 % 2 == 0)
  .forEach(n5 -> System.out.println("Filter method -> " + n5));
//s2.count();//error bcz s2 was already used 


System.out.println("To overcome Stream reuse, create a new stream each time.");

List<Integer> numbers = Arrays.asList(2, 5, 56, 5550, 55552, 45, 78);

System.out.println("Stream API:");
numbers.stream().forEach(System.out::println);

System.out.println("Numbers greater than 50, doubled and sorted:");

numbers.stream()
       .filter(number -> number > 50)
       .map(number -> number * 2)
       .sorted()//incresing or
       .forEach(System.out::println);

 numbers.stream()
.sorted(Comparator.reverseOrder())//decreasing order 
       
       .forEach(n6->System.out.println("decreasing   "+n6 ));

       numbers.stream()
       .distinct()
       .forEach(System.out::println);


       //limit() — Get the first N elements
numbers.stream()
       .limit(3)
       .forEach(System.out::println);

      // skip() — Skip the first N elements
numbers.stream()
       .skip(3)
       .forEach(System.out::println);

      // min() — Find the minimum value
int min = numbers.stream()
                 .min(Integer::compareTo)
                 .orElseThrow();
//anyMatch() — Check whether any element matches
boolean result = numbers.stream()
                        .anyMatch(n -> n > 25);

System.out.println(result);
                // max() — Find the maximum value
int max = numbers.stream()
                 .max(Integer::compareTo)
                 .orElseThrow();

System.out.println(max);

//anyMatch() — Check whether any element matches
boolean result2 = numbers.stream()
                        .anyMatch(n -> n > 25);

System.out.println(result2);

//noneMatch() — Check whether no elements match
boolean result3 = numbers.stream()
                        .noneMatch(n -> n < 0);

System.out.println(result3);
//allMatch() — Check whether all elements match
boolean result1 = numbers.stream()
                        .allMatch(n7 -> n7 > 0);

System.out.println(result1);

//findFirst() — Get the first element
int first = numbers.stream()
                   .findFirst()
                   .orElseThrow();


System.out.println(first);
//findAny() — Get any element
numbers.stream()
       .filter(n -> n > 15)
       .findAny()
       .ifPresent(System.out::println);
//collect() — Store processed elements in a collectio
      List<Integer> doubled = numbers.stream()
        .map(n -> n * 2)
        .toList();

//Bonus: peek() — Inspect elements during processing
numbers.stream()
       .filter(n -> n > 15)
       .peek(n -> System.out.println("Filtered: " + n))
       .map(n -> n * 2)
       .forEach(n -> System.out.println("Doubled: " + n));
// Count the numbers greater than 50

long count = numbers.stream()
        .filter(number -> number > 50)
        .count();

        long count1=numbers.stream()
        .count();

System.out.println("Count: " + count);

System.out.println("Count1 : " + count1);

// Calculate the sum
int sum = numbers.stream()
        .reduce(0, Integer::sum);

System.out.println("Sum: " + sum);


    }
}