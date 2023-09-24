package DAY_8;

public class FunctionOverloading { 
    // public static int sum(int a, int b){
    //     return a+ b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    // Function overloading using Datatypes
    public static int sum(int a, int b){
        return a+b;
    }

    public static  float sum(float a , float b){
        return a+b;
    }

    public static void main(String args[]){
        // Multiple functions with same name but different parameters
        System.out.println(sum(5,4)); 
        System.out.println(sum(3.2f,7.8f));
    }
}
