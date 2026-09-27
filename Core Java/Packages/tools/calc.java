package Packages.tools;

public class calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static void main(String[] args) {
        calc c = new calc();
        int r1 = c.add(4, 5);
        int r2 = c.sub(7, 2);
        System.out.println(r1);
        System.out.println(r2);
    }
}