package DAY_5;
import java.util.Scanner;

public class BreakStatement {
    public static void main(String args[]){
        // for(int i = 1; i<=5; i++){
        //     if(i==3){
        //         break;
        //     }
        // System.out.println("I am out");
        // }

        Scanner sc = new Scanner(System.in);

        do {
            int n = sc.nextInt();
            if (n%10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
