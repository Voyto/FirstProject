import java.util.Random;

public class UczenGenerator {

    Random rad = new Random();
    String[] Imie = new String[]{"Stanislaw","Zbyszek","Andrzej","Jan","Galileusz"};
    String[] Nazwisko = new String[]{"Myczyczuj","Kowalski","Nowak","Giovanni"};
    int[] Wiek = new int[]{15,18,32,21,16};
    String[] PESEL = new String[]{"66669789","78987987","7894598","7895469","451235478","1654879846"};
    int[] iloscMiejsc = new int []{4,5,6,7};
    String[] rodzaj = new String[] {"Osobowy","Ciężarowy"};
    int[] spalanie = new int[]{3,5,7,6,5,2,10};
    String[] rodzajPaliwa = new String[]{"Benzyna","Diesel","Gaz"};



    public Uczen generujUczen(){


        Uczen uczen = new Uczen();
        int los = rad.nextInt(Imie.length);

        uczen.setImie(Imie[los]);
        los=rad.nextInt(Nazwisko.length);
        uczen.setNazwisko(Nazwisko[los]);

        los=rad.nextInt(Wiek.length);
        uczen.setWiek(Wiek[los]);
        los=rad.nextInt(PESEL.length);
        uczen.setPesel(PESEL[los]);



        return uczen;

    }



}
