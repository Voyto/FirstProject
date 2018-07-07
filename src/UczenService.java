import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UczenService {
    List<Uczen> ListaObecnosci = new ArrayList<Uczen>();

    public List<Uczen> getListaObecnosci() {
        return ListaObecnosci;
    }

    public void setListaObecnosci(List<Uczen> listaObecnosci) {
        ListaObecnosci = listaObecnosci;
    }
public void dodajCzterachUczniow(){
    Uczen jacek = new Uczen("Jacek", "Stanislawowski", "1224625472", 20);
    Uczen stasiek = new Uczen("Stasiek", "Myczychuj", "29482746352", 15);
    Uczen jan = new Uczen("Jan", "NotRedundant", "28574625491", 19);
    Uczen artyom = new Uczen("Artyom", "Puszkin", "27462512741", 17);

    dodajGotowegoUcznia(jacek);
    dodajGotowegoUcznia(stasiek);
    dodajGotowegoUcznia(jan);
    dodajGotowegoUcznia(artyom);


}
public void wypiszWszystkichUczniow(){

    for (int i = 0; i < ListaObecnosci.size(); i++) {
        System.out.println("Imie: " + ListaObecnosci.get(i).getImie());
        ;
        System.out.println("Nazwisko: " + ListaObecnosci.get(i).getNazwisko());
        ;
        System.out.println("Nr Pesel: " + ListaObecnosci.get(i).getPesel());
        ;
        System.out.println("Wiek: " + ListaObecnosci.get(i).getWiek());
        ;
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
