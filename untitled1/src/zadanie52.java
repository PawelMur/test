public class zadanie52 {
    static int count (int tab [] , int element){
        int count = 0;
        for (int i = 0 ; i <tab.length ; i++ ){
            if (tab[i] == element){
                count++
            }
        }
        return count;
    }
    static void wypisz(int[] tab) {
        for (int i : tab)
            System.out.println(i);
    }

    static int suma(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    static double srednia(int[] tab) {
        return (double) suma(tab) / tab.length;
    }

    static int maxArray(int[] tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    static int minArray(int[] tab) {
        int min = 999999999;
        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
    }

    public static void main (String[] args){
            int[] tablica = {10, 5, 6, 3, 9, 5,};

            //wypisz(tablica);
            // System.out.println(suma(tablica));
            // System.out.println(srednia(tablica));
            System.out.println(maxArray(tablica));
            System.out.println(minArray(tablica));
        System.out.println();
        }

}
