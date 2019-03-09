import java.util.Arrays;

public class sortowanieBabelkowe {

    static void bubbleSort(int []arr){
        int n = arr.length;
        int tmp = 0;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0; j < n -i; j++){
                if(arr[i+1] < arr[j]){
                    tmp = arr[i+1];
                    arr[i+1] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main (String [] args){
        int tab[] = { 3,6,4,8,1,5,9,12};
        bubbleSort(tab);

    }
}
