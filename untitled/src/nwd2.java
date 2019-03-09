public class nwd2 {
    static int przezOdejmowanie( int x , int y){
        while(x!=0){
            if (x > y) {
                x = x - y;
            }else{
                y = y -x;
            }
        }return x;
    }static int przezReszteZDzielenia (int x , int y){
        while (x!=0){
            int r = x%y;
            x = y;
            y = r;
        }
        return x;
    }public static void wywolajNWD(){
        //System.out.println(przezOdejmowanie(104,4));
        //System.out.println(przezReszteZDzielenia(104,4));
    }
    public static void main (String[]args){
        System.out.println(przezOdejmowanie(104,4));
        System.out.println(przezReszteZDzielenia(104,4));
        System.out.println("test");

    }
}
