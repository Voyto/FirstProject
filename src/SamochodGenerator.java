import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SamochodGenerator {
        Random rad = new Random();
        String[] marka = new String[]{"Opel","Ford","BMW","Audi","Toyota","Wolksvagen","Renault","Peugot"};
        String[] model = new String[]{"Corsa","Corolla","Fiesta","E3","Passat","Clio","206","A4"};
        int[] pojemonscBagaznika = new int[]{4000,3500,5000,3600,4500,6000,2000};
        int[] pojemnoscSilnika = new int[]{1900,1600,2000,2500,1300,3000,2200};
        int[] iloscMiejsc = new int []{4,5,6,7};
        String[] rodzaj = new String[] {"Osobowy","Ciężarowy"};
        int[] spalanie = new int[]{3,5,7,6,5,2,10};
        String[] rodzajPaliwa = new String[]{"Benzyna","Diesel","Gaz"};



        public Samochod generujSamochod(){


            Samochod samochod = new Samochod();
            int los = rad.nextInt(marka.length);

            samochod.setMarka(marka[los]);
            los=rad.nextInt(model.length);
            samochod.setModel(model[los]);

            los=rad.nextInt(pojemnoscSilnika.length);
            samochod.setPojemnoscSilnika(pojemnoscSilnika[los]);
            los=rad.nextInt(pojemonscBagaznika.length);
            samochod.setPojemnoscBagaznik(pojemonscBagaznika[los]);

            los=rad.nextInt(iloscMiejsc.length);
            samochod.setIloscMiejsc(iloscMiejsc[los]);
            los=rad.nextInt(rodzaj.length);
            samochod.setRodzaj(rodzaj[los]);

            los=rad.nextInt(spalanie.length);
            samochod.setSpalanie(spalanie[los]);

            los=rad.nextInt(rodzajPaliwa.length);
            samochod.setRodzajPaliwa(rodzajPaliwa[los]);

            return samochod;

        }





    }



