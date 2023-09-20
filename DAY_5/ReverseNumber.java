package DAY_5;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // while (num > 0) {
        //     int lastDigit = num % 10;
        //     System.out.print(lastDigit + " ");
        //     num = num/10;
        // }

        int rev = 0;

        while(num>0){
            int LastDigit = num % 10;
            rev = (rev*10) + LastDigit;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
