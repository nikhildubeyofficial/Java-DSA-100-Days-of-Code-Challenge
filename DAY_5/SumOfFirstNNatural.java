package DAY_5;
import java.util.Scanner;

public class SumOfFirstNNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int init = 1;
        int sum = 0;

        while(init<=num){
            sum = sum + init;
            init++;
        }
        System.out.println(sum);
    }
}
