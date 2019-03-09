package konstruktory;

public class computation {
    public enum Computation{
        MULTIPLY,
        DIVIDE,
        ADD,
        SUBSTRACT;


    }
    static double kalkulator(double a, double b, Computation kalk){
        switch (kalk){
            case ADD:
                return a + b;
            case DIVIDE:
                return a/b;
            case SUBSTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            default:
                break;

        }
        return 0;
    }
    public static void main (String[]args){
        System.out.println(kalkulator(10,20 , Computation.ADD));
    }


}
