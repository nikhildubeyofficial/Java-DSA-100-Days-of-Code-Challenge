import java.util.Scanner;

public class type_promotion {
    public static void main(String args[]){
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
        // System.out.println(b-a);


        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a+b+c);
        System.out.println(bt);


        // Java automatically promotes each byte short char operand to int when evaluating an expression.
        // If one operand is long float or double the whole expression is promoted to long float or double respectively.


        // wrong
        // byte b = 5;
        // ab = b*2;
        // System.out.println(ab);

        // right
        byte b1 = 5 ;
        b = (byte) (b1*2);
    }
}
