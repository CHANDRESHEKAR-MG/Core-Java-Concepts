import java.util.*;
import java.util.stream.Stream;
public class ParallelStream{
    public static void main (String [] args){
        int size=10000;
        List<Integer> li=new ArrayList<>(size);
        Random ran = new Random();
        for(int i=1;i<=size;i++){
            li.add(ran.nextInt(100));
        }
        System.out.println(li);
        // int sum=li.stream()
        // .map(n->n*2)
        // .reduce(0,(c,e)->c+e);
        // System.out.println(sum);

        //time takes
        long startSeq=System.currentTimeMillis();
        int sum1=li.stream()//single thread usage so more time compare to parallel 
        .map(i->i*2)
        .mapToInt(i->i)
        .sum();
        long endSeq=System.currentTimeMillis();
        System.out.println("Normal Stream = "+sum1);
        System.out.println("SEQ time takes for normal Stream = "+(endSeq-startSeq));
        


long startSeq1=System.currentTimeMillis();
        int sum3=li.parallelStream()//parallel stream works with multiple threads so its fast less time takes 
        .map(i->i*2)
        .mapToInt(i->i)
        .sum();
        long endSeq1=System.currentTimeMillis();
        System.out.println("Parallel sum ==  "+sum3);
        System.out.println("SEQ time takes for parallel Stream = "+(endSeq1-startSeq1));
        
        
        //Delay in time 
        long startSeq7=System.currentTimeMillis();
        int sum6=li.stream()//single thread usage so more time compare to parallel 
        .map(i->{
        try{
            Thread.sleep(1);
        }catch(Exception e){
        }
        return i*2;
    })
        .mapToInt(i->i)
        .sum();
        long endSeq8=System.currentTimeMillis();
        System.out.println("Normal Stream = "+sum6);
        System.out.println("SEQ time takes for normal Stream = "+(endSeq8-startSeq7));
        


long startSeq3=System.currentTimeMillis();
        int sum5=li.parallelStream()//parallel stream works with multiple threads so its fast less time takes 
        .map(i->{
        try{
            Thread.sleep(1);
        }catch(Exception e){
        }
        return i*2;
    })
        .mapToInt(i->i)
        .sum();
        long endSeq4=System.currentTimeMillis();
        System.out.println("Parallel sum ==  "+sum5);
        System.out.println("SEQ time takes for parallel Stream with delay  = "+(endSeq4-startSeq3));
        
        
    }
}