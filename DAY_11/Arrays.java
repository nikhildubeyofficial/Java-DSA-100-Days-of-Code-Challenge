import java.util.*;

public class Arrays{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){

        // Array Creation
        // int marks[] = new int[50];
        // int numbers[] = {1,2,3};
        // int moreNumbers[] = {4,5,6};
        int marks[] = {12,34,67};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
         
    }
}