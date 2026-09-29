//Final JKeyword use with method variable and class
final class calc{
    public void show(){
        System.out.println("in calc class");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }


}
//class advcalc extends calc { //cannot inherit from final cal 
//final class cant be inherited by subclass
//}
public class FinalKeyWord{
    public static void main(String[] args) {
       //final with variable
       //final var means once assign canot be changed

       final int num=6;
       System.out.println(num);
       // num=99; //error bcz num is final canot be a modifid in next
        //System.out.println(num);
        calc c = new calc();
        c.show();
        c.add(5,4);

    }
}