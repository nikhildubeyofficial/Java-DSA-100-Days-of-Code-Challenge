package DAY_6;

public class InvertedStar {
    public static void main(String args[]){
        for(int line=4; line>=1; line--){
            for(int i=1; i<=line; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
