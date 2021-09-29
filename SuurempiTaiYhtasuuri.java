
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ensimmäinen luku:");
        int first = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int second = Integer.valueOf(lukija.nextLine());
        if (first > second) {
            System.out.println("Suurempi luku: " + first);
        } else if (first < second) {
            System.out.println("Suurempi luku: " + second);
        } else if (first == second) {
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
