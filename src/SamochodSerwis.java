import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SamochodSerwis {


    Scanner scanner = new Scanner(System.in);
    List<Samochod> Katalog = new ArrayList<Samochod>();
    public List<Samochod> getKatalog() {
        return Katalog;
    }

    SamochodGenerator generator = new SamochodGenerator();

    public void generujSamochod() {

        dodajGotowySamochod(generator.generujSamochod());


    }

    public void dodaj10Samochodow() {

        Samochod corsa = new Samochod("Opel", "Corsa", 5000, 2000, 4, "Osobowy", 4, "Diesel");
        Samochod fiesta = new Samochod("Ford", "Fiesta", 4000, 3232, 5, "Osobowy", 3, "Benzyna");
        Samochod passat = new Samochod("Wolksvagen", "Passat", 4500, 2000, 4, "Osobowy", 6, "Benzyna");
        Samochod e3 = new Samochod("BMW", "e3", 2000, 2000, 5, "Osobowy", 3, "Gaz");
        Samochod golf3 = new Samochod("Golf", "3", 3500, 2000, 4, "Ciężarowy", 3, "Gaz");
        Samochod focus = new Samochod("Ford", "Focous", 3500, 1600, 4, "Osobowy", 6, "Benzyna");
        Samochod vectra = new Samochod("Opel", "Vectra", 3500, 1900, 4, "Osobowy", 2, "Diesel");
        Samochod golf5 = new Samochod("Golf", "5", 2200, 2000, 5, "Osobowy", 2, "Benzyna");
        Samochod touran = new Samochod("Wolksvagen", "Touran", 4000, 2000, 4, "Osobowy", 3, "Diesel");
        Samochod rav4 = new Samochod("Toyota", "RAV4", 5000, 2400, 5, "Ciężarowy", 1, "Benzyna");

        dodajGotowySamochod(corsa);
        dodajGotowySamochod(fiesta);
        dodajGotowySamochod(passat);
        dodajGotowySamochod(e3);
        dodajGotowySamochod(golf3);
        dodajGotowySamochod(focus);
        dodajGotowySamochod(vectra);
        dodajGotowySamochod(golf5);
        dodajGotowySamochod(touran);
        dodajGotowySamochod(rav4);


    }


        public void setKatalog (List < Samochod > katalog) {
            Katalog = katalog;
        }
        public void wyborRodzajuSamochodu () {
            System.out.println("Jesli interesuje Cie samochód osobowy wpisz 1, jesli ciężarowy wpisz 2");


            int l = scanner.nextInt();
            int a = 0;
            for (int k = 0; k < Katalog.size(); k++) {
                if (l == 1) {
                    System.out.println(Katalog.get(k).getRodzaj() == "Osobowy");
                    System.out.println(Katalog.get(k).getMarka());
                    System.out.println(Katalog.get(k).getModel());
                    System.out.println();

                    if (Katalog.get(k).getRodzaj() == "Osobowy") {

                        System.out.println("-------");
                        System.out.println(Katalog.get(k).getMarka());
                        System.out.println(Katalog.get(k).getRodzaj());
                        System.out.println(Katalog.get(k).getModel());
                        System.out.println("-------");

                    }

                } else {


                    if (Katalog.get(k).getRodzaj() == "Ciężarowy") {
                        System.out.println("-------");
                        System.out.println(Katalog.get(k).getMarka());
                        System.out.println(Katalog.get(k).getRodzaj());
                        System.out.println(Katalog.get(k).getModel());
                        System.out.println("-------");
                    }
                }


            }

        }
        public void zapytajka () {

            System.out.println("Podaj ilosc miejsc ");
            int iloscMiejsc = scanner.nextInt();
            System.out.println("Podaj Pojemnosc Silnika");
            int pojemnoscsilnika = scanner.nextInt();
            System.out.println("Spalanie");
            int spalanie = scanner.nextInt();
            System.out.println("Podaj Marka");
            scanner.nextLine();
            String marka = scanner.nextLine();
            System.out.println("Podaj Model");
            String model = scanner.nextLine();
            System.out.println("Podaj pojemnosc bagaznika");
            int pojemnoscBagaznika = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj rodzaj paliwa");
            String rodzajPaliwa = scanner.nextLine();
            for (int e = 0; e < Katalog.size(); e++) {
                if (iloscMiejsc== Katalog.get(e).getIloscMiejsc() && pojemnoscsilnika == Katalog.get(e).getPojemnoscSilnika() && spalanie ==Katalog.get(e).getSpalanie()
                        && marka.equals(Katalog.get(e).getMarka()) && model.equals(Katalog.get(e).getModel())  && pojemnoscBagaznika == Katalog.get(e).getPojemnoscBagaznik() &&
                         rodzajPaliwa.equals(Katalog.get(e).rodzajPaliwa)){

                    System.out.print(Katalog.get(e).getModel()+ " ");

                    System.out.print(Katalog.get(e).getMarka()+ " ");
                    System.out.print(Katalog.get(e).getRodzaj()+ " ");
                    System.out.print(Katalog.get(e).getSpalanie()+ " ");
                    System.out.print(Katalog.get(e).getIloscMiejsc()+ " ");
                    System.out.print(Katalog.get(e).getRodzajPaliwa()+ " ");
                    System.out.print(Katalog.get(e).getPojemnoscSilnika()+ " ");
                    System.out.print(Katalog.get(e).getPojemnoscBagaznik()+ " ");
                    System.out.println();

            }

        }
    }

        public void wypiszWsieSamochody () {
            for (int i = 0; i < Katalog.size(); i++) {

                System.out.println(Katalog.get(i).toString());

            }
            System.out.println();

            System.out.println("***********");
            System.out.println("PRESS ENTER");
            System.out.println("***********");
            scanner.nextLine();


        }
        void dodajGotowySamochod (Samochod samochod){

            Katalog.add(samochod);


        }


        void DodajSamochod () {
            Samochod samochod = new Samochod();
            //String dodajsamochod = scanner.nextLine();
            String Marka;
            String Rodzaj;
            String RodzajSilnika;
            String Model;
            int PojemoscSilnika;
            int PojemnoscBagaznika;
            String RodzajPaliwa;
            int IloscMiejsc;
            double spalanie;

            System.out.println("Podaj ilosc miejsc");

            IloscMiejsc = scanner.nextInt();
            samochod.setIloscMiejsc(IloscMiejsc);
            scanner.nextLine();
            System.out.println("Podaj model");
            Model = scanner.nextLine();
            samochod.setModel(Model);
            System.out.println("Marka");
            Marka = scanner.nextLine();
            samochod.setMarka(Marka);
            System.out.println("Pojemnosc bagaznika");
            PojemnoscBagaznika = scanner.nextInt();
            samochod.setPojemnoscBagaznik(PojemnoscBagaznika);
            System.out.println("Pojemnosc Silnika");
            PojemoscSilnika = scanner.nextInt();
            samochod.setPojemnoscSilnika(PojemoscSilnika);
            scanner.nextLine();
            System.out.println("Rodzaj");
            Rodzaj = scanner.nextLine();
            samochod.setRodzaj(Rodzaj);
            System.out.println("Rodzaj Paliwa");
            RodzajPaliwa = scanner.nextLine();
            samochod.setRodzajPaliwa(RodzajPaliwa);
            System.out.println("Spalanie");
            spalanie = scanner.nextDouble();
            samochod.setSpalanie(spalanie);
            Katalog.add(samochod);

        }

    public void menuSamochody() {

        while (true) {

            System.out.println("1.Dodaj Samochód ");
            System.out.println("2.Dodaj 10 gotowych samochodów ");
            System.out.println("3.Wybór rodzaju samochodu ");
            System.out.println("4.Zapytajka ");
            System.out.println("5.Wypisz wszystkie samochody ");
            System.out.println("6.Generuj samochód");
            System.out.println("0.Wyjscie ");

            int k = scanner.nextInt();
            switch (k) {

                case 1:
                    DodajSamochod(); ///// stowrzylem samochod
                    break;
                case 2:
                    dodaj10Samochodow();
                    break;
                case 3:
                    wyborRodzajuSamochodu();
                    break;
                case 4:
                    zapytajka();
                    break;
                case 5:
                    wypiszWsieSamochody();
                    break;
                case 6:
                    System.out.println("Podaj ilość generowanych samochodów");
                    int j = scanner.nextInt();
                    for (int i = 0; i < j; i++) {
                        generujSamochod();
                    }
                    break;
                default:
                    break;
                case 0:
                    return;
            }

        }
    }}
