package Packages.tools;

public class Advcalc extends calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Advcalc c1 = new Advcalc();
        int r1 = c1.add(4, 5);
        int r2 = c1.sub(7, 2);
        int r3 = c1.mul(6, 3);
        int r4 = c1.div(4, 2);
        System.out.println(r1 + "  " + r2 + "   " + r3 + " " + r4);
    }
}