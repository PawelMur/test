import java.util.Scanner;

public class zadanie30 {
    public static void main (String[]args){
        Scanner podaj = new Scanner (System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwsza = podaj.nextInt();
        System.out.println("Podaj drugą liczbę");
        int druga = podaj.nextInt();
        System.out.println("Wcisnij 1 by dodać" + "\n" + "Wcisnij 2 by odjąć" + "\n"+ "Wciśnij 3 by pomnożyć");
        System.out.println("Wciśnij 4 by podzielić" + "\n" + "Wcińnij 0 by wyjść z programu");
        int wynik = podaj.nextInt();

        switch (wynik){
            case 1:
                wynik = pierwsza + druga;
                System.out.println(wynik);
                break;
            case 2:
                wynik = pierwsza - druga;
                System.out.println(wynik);
                break;
            case 3:
                wynik = pierwsza * druga;
                System.out.println(wynik);
                break;
            case 4:
                float wynik2 = (float) pierwsza / druga;
                System.out.println(wynik2);
                break;
            case 0:
                System.out.println("Koniec programu");
                break;

                default:
                    System.out.println("Poza zakresem");





        }

    }
}
