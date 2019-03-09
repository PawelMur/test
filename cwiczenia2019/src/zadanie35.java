public class zadanie35 {
    static void oneToten (){
        int i = 0;
        while (i<10){
            i++;
            System.out.println(i);
        }

    }
    static void tenToone(){
        int i = 11;
        while (i>1){
            i--;
            System.out.println(i);
        }
    }
    static void parzyste(){
        int i= 0;
        while (i<10){
            i+=2;
            System.out.println(i);
        }
    }
    static void parzysteFor(){
        for (int i = 0; i<=10; i+=2){
            System.out.println(i);
        }
    }
    public static void main (String[]args){
    //oneToten();
    //tenToone();
    //parzyste();
    parzysteFor();
    }
}
