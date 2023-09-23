package DAY_6;

public class CharacterPattern {
    public static void main(String args[]){
        char ch = 'A';
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
