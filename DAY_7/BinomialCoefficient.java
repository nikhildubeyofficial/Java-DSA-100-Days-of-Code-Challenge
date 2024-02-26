package DAY_7;
// import DAY_7.Factorial;


public class BinomialCoefficient {
    public static int binCoeff(int n, int r){
        int nfact = Factorial.factNum(n);
        int rfact = Factorial.factNum(r);
        int nmrfact = Factorial.factNum(n-r);

        int binCoeff = nfact / (rfact * nmrfact);
        return binCoeff;
    }
    public static void main(String args[]){
        System.out.println(binCoeff(3, 5));
    }
}
