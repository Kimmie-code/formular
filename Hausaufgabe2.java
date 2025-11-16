import java.util.*;
public class Hausaufgabe2 {
    public static void main(String [] args){
        Scanner Keyb = new Scanner(System.in);
        double Anlagensumme, Zinssatz;
        int Laufzeit;

        System.out.println("Bitte Anlagesumme: "); Anlagensumme = Keyb.nextFloat();
        System.out.println("Bitte Zinssatz eingeben: "); Zinssatz = Keyb.nextFloat();
        System.out.println("Bitte Laufzeit eingeben: "); Laufzeit = Keyb.nextInt();

        System.out.println("Bei einer Anlagensumme von " + Anlagensumme + " Euro und bei einem Zinssatz von " + Zinssatz + "% ergibt sich folgendes Sparvermögen:");

        int i = 0;
        double Gewinn = Anlagensumme;
        
        
        while ( i < Laufzeit){
        double mult = (Zinssatz + 100.0) /100.0;
        Gewinn = Gewinn * mult;
        i = i + 1;
        System.out.println("Nach dem " + i + " Jahr: " + Gewinn);
        }
        
        Double GewinnSatz = (Gewinn / Anlagensumme -1) *100;

        System.out.println("Der Gewinn beträgt: " + GewinnSatz + " Prozent");
    }
}
