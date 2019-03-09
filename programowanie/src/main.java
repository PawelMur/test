import algorytmy.BinarySearch;
import algorytmy.LiczbyPierwsze;
import algorytmy.NWD;
import algorytmy.Silnia;
import algorytmy.dijkstra.Dijkstra;
import sortowanie.*;
import struktury_danych.StosTab;
import struktury_danych.Tablice;
import struktury_danych.drzewa.BinareDrzewoPrzeszukiwan;
import struktury_danych.kolejka.KolejkaLista;
import struktury_danych.kopiec.Kopiec;
import struktury_danych.lista.Lista;
import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosListaOutOfIndex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        wywolajSortowania();
//        wywolajKopiec();
//        Dijkstra.run();
//        wywolajBST();
//        wywolajSilnia();
//        wywolajLiczyPiersze();
//        wywolajNWD();
//        wywolajBinarySearch();
//        wywolajBinarySearchRekurencyjnie();
//        wywolajLista();
//        wywolajONP();
//        wywolajKolejkaLista();
//        wywolajStosList();
//        wywolajStosTab();
//        wywolajTablice();
    }
    public  E remove (int index){
        if(index >= 0 && index < size){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    @Override
    public boolean remove (Object o){
        if (o == null){

        }
    }
    @Override
    public E get (int index){
        checkIndexInSize(index);
        return (E) tab[index];
    }

    @Override
    public Object [] toArray(){
        return Arrays.copyOf(tab,size);
    }

    @Override
    public <T> T [] toArray (T[]a){
        if(a.length < size){
            return (T[] Arrays.copyOf(tab, size, a.getClass());
        }else if (a.length > size){
            a[size] = null;
        }
        System.arraycopy(tab,);
        return a;
    }

    public boolean add (E e) {
        checkEnoughTabSize(size + 1);
        tab[size++] = e;
        return true;
    }

    private void checkEnoughTabSize(int newSize){
        if(newSize > tab.length){

            //int newCapacity = tab.length + (int) (0.5 * tab.length);
            int newCapacity = tab.length + (tab.length >> 1);
            tab = Arrays.copyOf(tab, newCapacity);

        }
    }
    public void add (int index , E element){
        checkIndexSize(index);
    }
    private void checkIndexInSize (int index){
        if (index < 0 || )
    }

    public static void wywolajSortowania() {
        int[] tab = new int[]{1, 2, 6, 10, 15, 3, 11, 56, 12, 46, 22};
        SortowaniePrzezWybieranie wybieranie = new SortowaniePrzezWybieranie();
        SortowanieBabelkowe babelkowe = new SortowanieBabelkowe();
        SortowaniePrzezZliczanie zliczanie = new SortowaniePrzezZliczanie();
        SortowaniePrzezWstawianie wstawianie = new SortowaniePrzezWstawianie();
        SortowanieSzybkie szybkie = new SortowanieSzybkie();

//        int[] wybieranieTab = wybieranie.sortuj(tab.clone());
        int[] babelkoweTab1 = babelkowe.sortuj1(tab.clone());
        System.out.println();
        int[] babelkoweTab2 = babelkowe.sortuj2(tab.clone());
        System.out.println();
        int[] babelkoweTab3 = babelkowe.sortuj3(tab.clone());
        System.out.println();
        int[] zliczanieTab = zliczanie.sortuj(tab, 100);
        System.out.println();
        int[] wstawianieTab = wstawianie.sortuj(tab.clone());
        System.out.println();
        int[] szybkieTab = szybkie.sortuj(tab.clone(), 0, tab.length - 1);

//        System.out.println("Wypisz tab źródlowy:");
//        System.out.println(Arrays.toString(tab));
//        System.out.println("Wypisz tab wybieranie:");
//        System.out.println(Arrays.toString(wybieranieTab));
        System.out.println("Wypisz tab babelkowe1:");
        System.out.println(Arrays.toString(babelkoweTab1));
        System.out.println("Wypisz tab babelkowe2:");
        System.out.println(Arrays.toString(babelkoweTab2));
        System.out.println("Wypisz tab babelkowe3:");
        System.out.println(Arrays.toString(babelkoweTab3));
        System.out.println("Wypisz tab przez zliczanie:");
        System.out.println(Arrays.toString(zliczanieTab));
        System.out.println("Wypisz tab przez wstawianie:");
        System.out.println(Arrays.toString(wstawianieTab));
        System.out.println("Wypisz tab sortowanie szybkie:");
        System.out.println(Arrays.toString(szybkieTab));
    }

    public static void wywolajKopiec() {
        int[] tab = new int[]{3, 8, 2, 6, 10, 7, 9, 15, 4, 18};
        Kopiec kopiec = new Kopiec();
        kopiec.run(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void wywolajBST() {
        BinareDrzewoPrzeszukiwan bst = new BinareDrzewoPrzeszukiwan();
        bst.dodaj(5);
        bst.dodaj(2);
        bst.dodaj(7);
        bst.dodaj(10);
        bst.dodaj(3);
        bst.dodaj(6);
        bst.dodaj(15);
        bst.dodaj(21);
        bst.dodaj(1);

        bst.usun(1);
        bst.usun(7);

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

    public static void wywolajBinarySearchRekurencyjnie() {
        int[] tab = {1, 5, 7, 9, 12, 16, 20, 21, 22};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.rekurencyjnie(tab, 0, tab.length - 1, 5);

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
        int[] tab = new int[]{0, 1, 2, 9};

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
