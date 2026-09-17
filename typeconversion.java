class typeconversion{
    public static void main(String args[]){
        //conversion 
        //smaller data type to larger data type
        byte a=127;//byte range is -128 to 127
         int  b=a; 
        System.out.println(b);
        //casting
        int m=255;
        byte n=(byte)m;
        System.out.println(n);
        //larger data type to smaller data type
        double c=10.5;// data loss occurs
        int d=(int)c;
        System.out.println(d);
    }
}