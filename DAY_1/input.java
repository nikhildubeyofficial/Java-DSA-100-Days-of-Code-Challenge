import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            System.out.println(number);

            float price = sc.nextFloat();
            System.out.println(price);
        }

        // String name = sc.nextLine();
        // System.out.println(name);


        // next
        // nextLine
        // nextInt
        // nextByte
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong
    }
}
