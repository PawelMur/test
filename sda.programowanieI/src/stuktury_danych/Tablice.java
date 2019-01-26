package stuktury_danych;

public class Tablice {

    public void parzysteMiejsca(int[] tab) {
        for(int i = tab.length - 1 ; i >= 0 ; i--) {
            if(i % 2 == 0) {
                System.out.println(tab[i]);
            }


        }
    }

    public void podzielnePrzezTrzy(int[] tab) {
        int suma = 0;

        for(int e : tab) {
            if(e % 3 == 0) {
                suma += e; // suma = suma + e;
            }
        }

        System.out.println("Wynik podzielnePrzezTrzy: " + suma);
    }

    public int sumaPieciuMinusOstatni(int[] tab) {
        if(tab.length < 6) {
            System.out.println("Za mało elementów");
            return -1;
        }

        int wynik = 0;

        for(int i = 0 ; i < 5 ; i++) {
            wynik += tab[i];
        }

        wynik = wynik - tab[tab.length - 1];

        System.out.println("Wynik: " + wynik);

        return wynik;
    }

}
