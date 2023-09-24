package DAY_7;

public class Swap {
    public static void main(String args[]){
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}


// Call by Value
// Call by Reference
// Java always calls by value