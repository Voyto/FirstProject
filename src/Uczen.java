import java.util.ArrayList;
import java.util.List;

public class Uczen {
    String Imie;
    String Nazwisko;
    String Pesel;
    int Wiek;
    List<Integer> Oceny = new ArrayList<Integer>();
    public List<Integer> getOceny() {
        return Oceny;
    }
    public void setOceny (List < Integer > oceny) {
        Oceny = oceny;
    }






    public Uczen() {
    }

    public Uczen(String imie, String nazwisko, String pesel, int wiek) {
        Imie = imie;
        Nazwisko = nazwisko;
        Pesel = pesel;
        Wiek = wiek;

    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        this.Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.Nazwisko = nazwisko;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        this.Pesel = pesel;
    }

    public int getWiek() {
        return Wiek;
    }

    public void setWiek(int wiek) {
        this.Wiek = wiek;
    }
}
