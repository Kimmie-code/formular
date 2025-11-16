import java.util.*;
public class Hausaufgabe{
    public static void main (String [] args){
        Scanner Keyb = new Scanner(System.in);
        int Tag, Monat, Jahr;
        String MonatStr = "";
        System.out.println("Bitte geben Sie den Tag ein: "); Tag = Keyb.nextInt();
        System.out.println("Bitte geben Sie den Monat ein: "); Monat = Keyb.nextInt();
        System.out.println("Bitte geben Sie das Jahr ein: "); Jahr = Keyb.nextInt();
        
        switch (Monat) {
            case 1:
                MonatStr = "Januar";
                break;
            case 2:
                MonatStr = "Februar";
                break;
             case 3:
                MonatStr = "März";
                break;
            case 4:
                MonatStr = "April";
                break;
            case 5:
                MonatStr = "Mai";
                break;
            case 6:
                MonatStr = "Juni";
                break;
            case 7:
                MonatStr = "July";
                break;
            case 8:
                MonatStr = "August";
                break;
            case 9:
                MonatStr = "September";
                break;
            case 10:
                MonatStr = "Oktober";
                break;
            case 11:
                MonatStr = "November";
                break;
            case 12:
                MonatStr = "Dezember";
                break;
            default:
                System.out.print("Sie haben einen nicht erlaubten Wert für das Monat eingegeben!");
                break;
        }
        if (!MonatStr.isEmpty())
        System.out.print("" + Tag +". " + MonatStr + " " + Jahr );

    }
}