
import java.util.Arrays;
import java.util.Random;


public class zadanie2 {
    public static void main (String[]args){
        int [] tab = new int [10];
        Random liczba = new Random();
        for (int i = 0 ; i <tab.length; i++){
            tab [i] = liczba.nextInt(100);
        }
        System.out.println(Arrays.toString(tab));
    }
}
