package Packages;

public class B{
    public int marks=40;//  // used anywhere inside different packages class etc 
    private int rollno=400; // inside same clsss only
    public void show(){
        System.out.println("Showing ");
    }
    private  void show1(){ // inside the same clas only
        System.out.println("Showing private ");
    }
}