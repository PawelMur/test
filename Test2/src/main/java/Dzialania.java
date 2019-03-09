public class Dzialania {


    static double calculate(double a, double b, Computation operation) {
        switch (operation) {
            case MULTIPLY:
                return a * b;
            case ADD:
                return a + b;
            case DIVIDE:
                return a / b;
            case SUBSTRACT:
                return a - b;
            default:
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1.0, 2.0, Computation.MULTIPLY));
        System.out.println(calculate(1.0, 2.0, Computation.ADD));
        System.out.println(calculate(1.0, 2.0, Computation.DIVIDE));
        System.out.println(calculate(1.0, 2.0, Computation.SUBSTRACT));

    }
}
