import java.util.Scanner;

public class NWD {
    static int przezOdejmowanie( int a , int b){
        
        while(a!=b){
            if (a > b) {
                a = a - b;
            }else
                b = b - a;

        }return a;
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(t);
        for (int i = 0 ; i < t ; i++)
            System.out.println(przezOdejmowanie(a,b));
        }

    }

