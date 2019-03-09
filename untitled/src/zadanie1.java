public class zadanie1 {
    static boolean sortowanie (){
        int [] tab = {4 , 5, 6, 7};
        for (int i = 0 ; i<tab.length-1; i++){

            if (tab[i]>tab[i+1]){
                return false;
            }
        }return true;
    }
    public static void main (String[]args){
        String i = (sortowanie()) ? "jest rosnąca" : "nie jest rosnąca";
        System.out.println(i);
    }
}
