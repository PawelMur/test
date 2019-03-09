import java.util.Arrays;
import java.util.Random;

public class sortowanie {

    static int[] sortuj1(int[] tab) {
        int n = tab.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (tab[i + 1] < tab[i]) {
                    TabUtils.swap(tab, i, i + 1);
                }
            }
        }
        return tab;
    }


    static int[] random(int[] tab) {
        Random liczba = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = liczba.nextInt(100)* 9999999;
        }
        return tab;
    }

    static int petla() {
        int suma = 0;
        for (int i = 1; i > 0; i++) {
            suma++;
            return suma;
        }
        return suma;
    }


    public static void main(String[] args) {

        for (int i = 1; i > 0; i++) {
            int[] tab = new int[i*9999];
            sortuj1(random(tab));

        }

    }
}