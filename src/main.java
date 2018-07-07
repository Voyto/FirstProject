import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SamochodSerwis samochodSerwis = new SamochodSerwis(); ///// stworzenie obiektu
        UczenService uczenService = new UczenService();
        while (true){
        System.out.println("1.Dodaj Samochód ");
        System.out.println("2.Dodaj 10 gotowych samochodów ");
        System.out.println("3.Wybór rodzaju samochodu ");
        System.out.println("4.Zapytajka ");
        System.out.println("5.Wypisz wszystkie samochody ");
        System.out.println("6.Dodaj czterech gotowych uczniow ");
        System.out.println("7.Dodaj Ucznia ");
        System.out.println("8.Wypisz wszystkich uczniów ");
        System.out.println("9.Wypisz uczniow 18+ ");
        System.out.println("10.Generuj samochód" );
        System.out.println("0.Wyjscie ");
        int k=scanner.nextInt();
        switch(k) {

            case 1:
                samochodSerwis.DodajSamochod(); ///// stowrzylem samochod
                break;
            case 2:
                samochodSerwis.dodaj10Samochodow();
                break;
            case 3:
                samochodSerwis.wyborRodzajuSamochodu();
                break;
            case 4:
                samochodSerwis.zapytajka();
                break;
            case 5:
                samochodSerwis.wypiszWsieSamochody();
                break;
            case 6:
                uczenService.dodajCzterachUczniow();
                break;
            case 7:
                uczenService.dodajUcznia();
                break;
            case 8:
                uczenService.wypiszWszystkichUczniow();
                break;
            case 9:
                uczenService.wypiszUcznow18plus();
                break;
            case 10:
                System.out.println("Podaj ilość generowanych samochodów");
                int j=scanner.nextInt();
                for( int i=0;i<j;i++) {
                    samochodSerwis.generujSamochod();
                }
                break;
            default:
                break;
            case 0:
                return;
        }
        }








    }
}

