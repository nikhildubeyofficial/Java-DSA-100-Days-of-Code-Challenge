import java.util.*;

public class ternary_operator{
    public static void main(String args[]){
        // variable = condition? statement1 : statement2;

        // boolean larger = (5>3)?5:3;

        int number = 4;
        String type = ((number%2)==0) ? "EVEN" : "ODD"; 
        System.out.println(type);
    }
}