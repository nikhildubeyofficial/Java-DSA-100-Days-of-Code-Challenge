package DAY_9;

public class InvertedRotatedHalfPyramid {
    public static void halfPyramid(int rows){
        //outer
        for(int i=1; i<=rows; i++){
            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }

            //stars
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers(int rows){
        // outer
        int n = rows;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            n--;
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        // halfPyramid(70);
        invertedHalfPyramidWithNumbers(10);
    }
}
