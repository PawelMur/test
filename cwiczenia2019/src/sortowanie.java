import java.lang.reflect.Array;
import java.util.Arrays;

public class sortowanie {
    static void sortowanie(int [] tab){
        int n = tab.length;
        for (int i = 0 ; i < n-1 ; i++){
            for(int j = i + 1 ; j < n; j++)
                if (tab[j] < tab[i]){
                    int tmp = tab[i];
                   tab[i]=tab[j];
                    tab[j] = tmp;
                }

        }
        System.out.println(Arrays.toString(tab));
    }
    public static void main (String[]args){
        int [] tablica = {3,2,6,5,4,9,7,10};
        sortowanie(tablica);
    }
}
