import stuktury_danych.StosTab;
import stuktury_danych.Tablice;
import stuktury_danych.algorytmy.ONP;
import stuktury_danych.kolejka.KolejkaLista;
import stuktury_danych.stos.StosLista;
import stuktury_danych.stos.StosListaOutOfIndex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        wywolajONP();
//        wywolajKolejkaLista();
//        wywolajStosList();
//        wywolajStosTab();
//        wywolajTablice();
    }

    public static void wywolajONP() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyrażenie:");
        String input = scanner.nextLine();
        String[] operations = input.split(" ");

        new ONP().run(operations);
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
        int[] tab = new int[] {0, 1, 2};

        Tablice tablice = new Tablice();

//        tablice.parzysteMiejsca(tab);
//        tablice.podzielnePrzezTrzy(tab);
        tablice.sumaPieciuMinusOstatni(tab);
    }
}
