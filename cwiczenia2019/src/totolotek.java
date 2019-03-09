package PACKAGE_NAME;

import java.util.Arrays;
import java.util.Random;

public class totolotek {
    static void totolotek1() {
        Random liczba = new Random();
        int[] tablica = new int[6];
        for (int i = 0; i < tablica.length; i++) {
            int losowanie = liczba.nextInt(44) + 1;
            tablica[i] = losowanie;

        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i + 1; j < tablica.length; j++) {
                if (tablica[i] == tablica[j]) {
                    tablica[j] = liczba.nextInt(44) + 1;
                    for (int k = 0; k < tablica.length; k++) {
                        for (int l = k + 1; l < tablica.length; l++) {
                            if (tablica[k] == tablica[l]) {
                                tablica[l] = liczba.nextInt(44) + 1;
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(tablica);

        System.out.println(Arrays.toString(tablica));
    }

    public static void main (String[]args){
        totolotek1();

    }

}
