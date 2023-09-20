package DAY_5;
import java.util.Scanner;

public class PrintNumbers1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int init = 1;

        while(init<=num){
            System.out.println(init);
            init++;
        }
    }
}
