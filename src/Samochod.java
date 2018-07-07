public class Samochod {
String marka;
String model;
int pojemnoscBagaznik;
int pojemnoscSilnika;
int iloscMiejsc;

String rodzaj;
double spalanie;

String rodzajPaliwa;

    public Samochod() {
    }

    public Samochod(String marka, String model, int pojemnoscBagaznik, int pojemnoscSilnika, int iloscMiejsc, String rodzaj, int spalanie, String rodzajPaliwa) {
        this.marka = marka;
        this.model = model;
        this.pojemnoscBagaznik = pojemnoscBagaznik;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscMiejsc = iloscMiejsc;
        this.rodzaj = rodzaj;
        this.spalanie = spalanie;
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPojemnoscBagaznik() {
        return pojemnoscBagaznik;
    }

    public void setPojemnoscBagaznik(int pojemnoscBagaznik) {
        this.pojemnoscBagaznik = pojemnoscBagaznik;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public String toString(){




        return getMarka()+" "+getModel()+ " "+getRodzaj();
    }

}

