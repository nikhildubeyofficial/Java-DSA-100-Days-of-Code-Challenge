import java.util.*;

public class LargestNumber {
    public static int largestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        for (int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,3,5,7,9,23,21,43,76,98};
        System.out.println(largestNum(numbers));
    }
}
