package DAY_7;

public class ProductFunction {

    public static int Multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int prod = Multiply(a,b);
        System.out.println(prod);
    }
}
