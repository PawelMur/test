public class OutOfMemory {

    static void OutOfMemory() {
        int [] tab= new int [99999999];
        for ( int i = 0; i<tab.length; i++){
            tab[i]=99999999 * 1239;
            System.out.println(i + " " + Runtime.getRuntime().freeMemory());
        }
    }
    public static void main (String[]args){
        OutOfMemory();


    }
}
