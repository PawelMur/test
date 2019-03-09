public class TabUtils {

    public static void swap(int[] tab, int a, int b) {
        int tmp = tab[a];
        tab[a] = tab[b];
        tab[b] = tmp;
    }
}