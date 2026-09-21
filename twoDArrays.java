class twoDArrays{
    static int TwoDArray (){

        int random=0;
        int [][] arr = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*100);

                // System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
System.out.println("Using Enhanced for loop");
//Enhanced for loop
        for(int n[] : arr){  
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        return 0;
    }
       // Jagged Array
       //Jagged array is an array of arrays such that member arrays can be of different sizes.
       //  In Java, a jagged array is created by defining an array of arrays. 
       // The size of each member array can be different.\
       // here in below example same number rows is fixed 3 and 
       // but the number of collumns must be vary depending on the given size of the array.
    static int jaggedArray(){
        int [][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args)
    {
        // int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        TwoDArray();
        jaggedArray();
        
    }
}