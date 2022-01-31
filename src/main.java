import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */
       /* enum LiczbyEnum {jeden, dwa, trzy, cztery, piec, szesc;} //A do zadania F i G
        enum StatusEnum {KONTUNUUJEMY, KONIEC;}  //B do zadania F i G
        int licznik = 0; // do większości zadań */

      // Scanner scan = new Scanner(System.in); // do zadań z wpisywaniem danych przez użytkownika
        /*while (true) { //C
            System.out.println("infinity...");
        }*/
        /*System.out.println("Podaj elementy pętli"); //D,E
        do{
            licznik = scan.nextInt();
            System.out.println(licznik);
        }while(licznik>0);
        System.out.println("Koniec pętli");*/
       /* System.out.println("Podaj elementy pętli od 1 do 6"); //F,G
        do{licznik = scan.nextInt();
            switch(licznik){
                case 0:
                    System.out.println(StatusEnum.KONIEC);
                    break;
                case 1:
                    System.out.println(LiczbyEnum.jeden);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.dwa);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.trzy);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.cztery);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.piec);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.szesc);
                    System.out.println(StatusEnum.KONTUNUUJEMY);
                    break;
            }
           // System.out.println(licznik);
        }while(licznik>0); */
        //System.out.println("Koniec pętli");


        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>,
            f) wyświetlić dane
         */
    }
}