public class zadanie6 {
    static int dzielenie (int [] tab, int y){
        int lewo = 0;
        int prawo = tab.length -1;
        while(lewo <= prawo){
           int  srodek = (lewo + prawo / 2);
            if(tab[srodek] < y)
                lewo = srodek + 1;
            else
                prawo = srodek ;
        }
        return -1;
    }
    public static void main (String[]args){
        int [] tab = {1,3,6,8,9,11};

    }
}