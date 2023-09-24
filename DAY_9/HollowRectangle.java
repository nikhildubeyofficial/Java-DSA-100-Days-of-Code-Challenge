package DAY_9;

public class HollowRectangle {
    public static void hollowRectangle(int totRows, int totCols){
        // outer loop
        for(int i = 1; i<=totRows; i++){
            //inner - columns
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowRectangle(4, 5);
        hollowRectangle(5, 10);
    }
}
