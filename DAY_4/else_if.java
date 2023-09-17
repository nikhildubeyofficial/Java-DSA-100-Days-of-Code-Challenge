import java.util.*;

public class else_if{
    public static void main(String args[]){

        // int age = 13;
        // if(age>=18){
        //     System.out.println("ADULT");
        // }
        // else if(age>= 13 && age<18){
        //     System.out.println("TEENAGER");
        // }
        // else {
        //     System.out.println("CHILD");
        // }


        // INCOME TAX CALCULATOR
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }else{
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is: " + tax);
    }
}