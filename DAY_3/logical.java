public class logical {
    public static void main(String args[]){
        // && Logical AND
        // || Logical OR
        // !  Logical NOT

        // Logical AND
        // T   T   T
        // T   F   F
        // F   T   F
        // F   F   F
        System.out.println((3<2) && (3>2));

        // Logical OR
        // T   T   T
        // T   F   T
        // F   T   T
        // F   F   F
        System.out.println((3<2) || (3>2));

        // Logical NOT
        // T   F
        // F   T
        System.out.println(!(3<2));
    }
}
