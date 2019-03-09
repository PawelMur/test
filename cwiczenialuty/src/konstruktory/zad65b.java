package konstruktory;

public class zad65b {
    public enum Direction {
        NORTH('N', 180), EAST('E', 200), SOUTH('S', 360), WEST('E', 280);
        private char symbol;
        private int stopnie;

        Direction(char symbol, int x) {
            this.symbol = symbol;
            this.stopnie = x;

        }

        public static Direction valueFromSymbol (char c){
            for (Direction a : values()){
                if (a.symbol == c)
                    return a;

            }
            return null;

        }
    }
    public static void main (String[]args) {
        System.out.println(Direction.valueFromSymbol('W'));
    }
}

