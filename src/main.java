import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SamochodSerwis samochodSerwis = new SamochodSerwis(); ///// stworzenie obiektu
        UczenService uczenService = new UczenService();
        while(true) {
            System.out.println("1.Menu samochody");
            System.out.println("2.Menu uczniowe");
            System.out.println("0.Wyjscie");
            int k =scanner.nextInt();
            switch(k) {
                case 1:
                    samochodSerwis.menuSamochody();
                    break;
                case 2:
                    uczenService.menuUczniowie();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}

