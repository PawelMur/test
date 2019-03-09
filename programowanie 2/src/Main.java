import algorytmy.BinarySearch;
import algorytmy.LiczbyPierwsze;
import algorytmy.NWD;
import algorytmy.Silnia;
import struktury_danych.StosTab;
import struktury_danych.Tablice;
import struktury_danych.drzewa.BinarneDrzewoPrzeszukiwan;
import struktury_danych.kolejka.KolejkaLista;
import struktury_danych.kopiec.Kopiec;
import struktury_danych.lista.Lista;
import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosListaOutOfIndex;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // wywolajSilnia();
//        wywolajLiczyPiersze();
//        wywolajNWD();
//        wywolajBinarySearch();
//        wywolajLista();
//        wywolajONP();
//        wywolajKolejkaLista();
//        wywolajStosList();
//        wywolajStosTab();
//        wywolajTablice();
         // wywolajBST();
        wywolajKopiec();
    }

    public static void wywolajKopiec() {
        int [] tab = new int [] {3,8,2,6,10,7,9,15,4,18};
        Kopiec kopiec = new Kopiec();
        kopiec.run(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void wywolajBST(){
        BinarneDrzewoPrzeszukiwan bst = new BinarneDrzewoPrzeszukiwan();
        bst.dodaj(5);
        bst.dodaj(2);
        bst.dodaj(7);
        bst.dodaj(10);
        bst.dodaj(3);
        bst.dodaj(6);
        bst.dodaj(15);
        bst.dodaj(21);
        bst.dodaj(1);
    }

    public static void wywolajSilnia() {
        Silnia silnia = new Silnia();

        System.out.println(silnia.rekurencyjnie(5));
    }

    public static void wywolajLiczyPiersze() {
        LiczbyPierwsze liczbyPierwsze = new LiczbyPierwsze();
        int liczba = 950993;

        long start;
        long stop;

        start = System.nanoTime();
        liczbyPierwsze.sprawdzZwykle(liczba);
        stop = System.nanoTime();
        System.out.println("Zwykle: " + (stop - start));

        start = System.nanoTime();
        liczbyPierwsze.sprawdzOptymalizacja(liczba);
        stop = System.nanoTime();
        System.out.println("Optymalizacja: " + (stop - start));

        start = System.nanoTime();
        liczbyPierwsze.stworzSito(950994);
        liczbyPierwsze.sprawdzPrzezSito(liczba);
        stop = System.nanoTime();
        System.out.println("Sito: " + (stop - start));
    }

    public static void wywolajNWD() {
        int a = 1000000002;
        int b = 4;
        long start;
        long stop;
        NWD nwd = new NWD();

        start = System.nanoTime();
        nwd.przezOdejmowanie(a, b);
        stop = System.nanoTime();

        System.out.println("NWD odejmowanie: " + (stop - start));

        start = System.nanoTime();
        nwd.przezReszteZDzielenia(a, b);
        stop = System.nanoTime();

        System.out.println("NWD przez resztę: " + (stop - start));
    }

    public static void wywolajBinarySearch() {
        int n = 10000000;
        int[] tab = new int[n];
        int y = 5000000;
        long start;
        long stop;
        boolean wynik;
        BinarySearch binarySearch = new BinarySearch();

        for (int i = 0; i < n; i++) {
            tab[i] = i;
        }

        start = System.nanoTime();
        binarySearch.runBinarySearch(tab, y);
        stop = System.nanoTime();

        System.out.println("Czas binary search: " + (stop - start));


        start = System.nanoTime();
        binarySearch.iteracyjnie(tab, y);
        stop = System.nanoTime();

        System.out.println("Czas iteracyjnie: " + (stop - start));

    }

    public static void wywolajLista() {
        Lista lista = new Lista();

        lista.addFirst(1);
        lista.addFirst(123);
        lista.addFirst(334);
        lista.addLast(22);
        lista.addLast(5465675);

        int szukaj = 1;
        System.out.println("Czy znajduje się " + szukaj + ": " + lista.czyZnajduje(szukaj));

        lista.usun(5465675);


        lista.pollFirst();
        lista.peekFirst();
        lista.pollLast();
        lista.pollLast();
        lista.peekFirst();

        System.out.println("Print: ");
        lista.print();
        System.out.println("Printreverse: ");
        lista.printReverse();
    }

    public static void wywolajONP() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyrażenie:");
        String input = scanner.nextLine();
        String[] operations = input.split(" ");

//        new ONP().run(operations);
    }

    public static void wywolajKolejkaLista() {
        KolejkaLista kolejkaLista = new KolejkaLista();

        kolejkaLista.add(1);
        kolejkaLista.add(2);
        kolejkaLista.add(3);

        kolejkaLista.print();

        System.out.println(kolejkaLista.poll());
        System.out.println(kolejkaLista.peek());
        System.out.println(kolejkaLista.poll());

        kolejkaLista.add(5);
        kolejkaLista.add(7);

        kolejkaLista.poll();
        kolejkaLista.poll();
        kolejkaLista.poll();

        kolejkaLista.print();
    }

    public static void wywolajStosList() {
        StosLista stosLista = new StosLista();

        stosLista.push(1);
        stosLista.push(2);
        stosLista.push(3);

        stosLista.print();

        try {
            System.out.println("pop:" + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        try {
            System.out.println("pop:" + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        stosLista.push(4);
        stosLista.push(5);

        stosLista.print();

        try {
            System.out.println("peek:" + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("pop:" + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("peek:" + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        try {
            stosLista.pop();
            stosLista.pop();
            stosLista.pop();
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            System.out.println(stosListaOutOfIndex.getMessage());
        }


        stosLista.print();
    }

    public static void wywolajStosTab() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar stosu");
        int size = scanner.nextInt();
        StosTab stosTab = new StosTab(size);

        while (true) {
            System.out.println("Podaj operację:" +
                    "1. push()" +
                    "2. pop()" +
                    "3. peek()" +
                    "4. print()" +
                    "0. wyjście");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Podaj wartość");
                    int value = scanner.nextInt();

                    try {
                        stosTab.push(value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(stosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(stosTab.peek());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    stosTab.print();
                    break;
                case 0:
                    return;
            }


        }
    }

    public static void wywolajTablice() {
        int[] tab = new int[] {0, 1, 2, 9};

        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();

        Tablice tablice = new Tablice();

//        tablice.parzysteMiejsca(tab);
//        tablice.podzielnePrzezTrzy(tab);
//        tablice.sumaPieciuMinusOstatni(tab);
//        tablice.sprawdzCzyNiemalejaco(tab);
        tablice.stworzLosowaTablice(rozmiar);

        scanner.close();
    }
}
