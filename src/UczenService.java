import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UczenService {
    List<Uczen> ListaObecnosci = new ArrayList<Uczen>();
    Random rad = new Random();
    public List<Uczen> getListaObecnosci() {
        return ListaObecnosci;
    }

    public void setListaObecnosci(List<Uczen> listaObecnosci) {
        ListaObecnosci = listaObecnosci;
    }

    UczenGenerator generator = new UczenGenerator();

    public void generatorOcen(){

    for(int i=0;i<ListaObecnosci.size();i++){


        for(int j=0;j<3;j++) {
            ListaObecnosci.get(i).Oceny.add(rad.nextInt(6) + 1);
        }

    }


    }

    public double srednia(List<Integer> oceny)
    {
        DecimalFormat df = new DecimalFormat("#.00");

        if (oceny.size() != 0) {
            double suma = 0;

            for (int i = 0; i < oceny.size(); i++) {

                suma = suma + oceny.get(i);

            }

            return suma / oceny.size();
        }else
            System.out.println("Brak ocen");
            return 0;

    }

public void dodajCzterachUczniow() {
    Uczen jacek = new Uczen("Jacek", "Stanislawowski", "1224625472", 20);
    Uczen stasiek = new Uczen("Stasiek", "Myczychuj", "29482746352", 15);
    Uczen jan = new Uczen("Jan", "NotRedundant", "28574625491", 19);
    Uczen artyom = new Uczen("Artyom", "Puszkin", "27462512741", 17);

    dodajGotowegoUcznia(jacek);
    dodajGotowegoUcznia(stasiek);
    dodajGotowegoUcznia(jan);
    dodajGotowegoUcznia(artyom);
}


public void menuUczniowie() {
    while (true) {

            System.out.println("1.Dodaj czterech gotowych uczniow ");
            System.out.println("2.Dodaj Ucznia ");
            System.out.println("3.Wypisz wszystkich uczniów ");
            System.out.println("4.Wypisz uczniow 18+ ");
            System.out.println("5.Generuj Ucznia");
            System.out.println("6.Generuj 3 oceny dla kazdego ucznia");
            System.out.println("0.Wyjscie ");

            int k=scanner.nextInt();
        switch(k) {

            case 1:
                dodajCzterachUczniow();
                break;
            case 2:
                dodajUcznia();
                break;
            case 3:
                wypiszWszystkichUczniow();
                break;
            case 4:
                wypiszUcznow18plus();
                break;
            case 5:
                System.out.println("Podaj ilość generowanych Uczniów");
                int j = scanner.nextInt();
                for (int i=0; i<j; i++) {
                    generujUcznia();

                }
                break;
            case 6:
                generatorOcen();
                break;
            default:
                break;
            case 0:
                return;
        }
    }
}


    public void generujUcznia() {

        dodajGotowegoUcznia(generator.generujUczen());


    }

public void wypiszWszystkichUczniow(){

    for (int i = 0; i < ListaObecnosci.size(); i++) {
        System.out.print("Imie: " + ListaObecnosci.get(i).getImie()+" ");

        System.out.print("Nazwisko: " + ListaObecnosci.get(i).getNazwisko()+" ");

        System.out.print("Nr Pesel: " + ListaObecnosci.get(i).getPesel()+" ");

        System.out.print("Wiek: " + ListaObecnosci.get(i).getWiek()+" ");

        System.out.println("Oceny " + ListaObecnosci.get(i).getOceny() +" ");
        System.out.println("Srednia ocen " + String.format( "%.2f", srednia(ListaObecnosci.get(i).getOceny()) ) +" ");

        System.out.println();
    }
}
public void wypiszUcznow18plus (){
        for (int j = 0; j < ListaObecnosci.size(); j++) {
            if (ListaObecnosci.get(j).getWiek() > 18) {
                System.out.println("Imie: " + ListaObecnosci.get(j).getImie());
                ;
                System.out.println("Nazwisko: " + ListaObecnosci.get(j).getNazwisko());
                ;
                System.out.println("Nr Pesel: " + ListaObecnosci.get(j).getPesel());
                ;
                System.out.println("Wiek: " + ListaObecnosci.get(j).getWiek());
                ;
            }
        }
    }


    Scanner scanner = new Scanner(System.in);
    void dodajGotowegoUcznia(Uczen uczen){
        ListaObecnosci.add(uczen);
    }
    void dodajUcznia ()
    {

        Uczen uczen = new Uczen();
        String Imie;
        String Nazwisko;
        String Pesel;
        int Wiek;

        System.out.println("Podaj Imie ucznia: ");
        Imie = scanner.nextLine();
        uczen.setImie(Imie);
        System.out.println("Podaj nazwisko: ");
        Nazwisko = scanner.nextLine();
        uczen.setNazwisko(Nazwisko);
        System.out.println("Podaj pesel: ");
        Pesel = scanner.nextLine();
        uczen.setPesel(Pesel);
        System.out.println("Podaj Wiek");
        Wiek = scanner.nextInt();
        uczen.setWiek(Wiek);
        ListaObecnosci.add(uczen);
    }
}
