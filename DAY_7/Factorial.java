package DAY_7;

public class Factorial {
    public static int factNum(int n){
        int f = 1;

        for(int i =1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        // int fact = factNum(5);
        System.out.println(factNum(8));
    }
}
