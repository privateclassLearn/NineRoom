import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Start {
    public static void main(String[] args) {
        int neuX = 0;
        int neuY = 0;

        Room room1 = new Room("Startraum", "Hier gehts los!", "Tür", 0, 0);
        Room room2 = new Room("Küche", "Hell", "Töpfe", 0, 1);
        Room room3 = new Room("Wohnzimmer", "Halbdunkel", "Spielkonsole", 0, 2);
        Room room4 = new Room("Schlafzimmer", "Dunkel", "Kissen", 1, 0);
        Room room5 = new Room("Garten", "Hell", "Blumen", 1, 1);
        Room room6 = new Room("Schuppen", "Dunkel", "Schaufel", 1, 2);
        Room room7 = new Room("Hühnerstall", "Dunkel", "Eier", 2, 0);
        Room room8 = new Room("Wiese", "Sehr hell", "4 blättriger Klee", 2, 1);
        Room room9 = new Room("Bachrand", "Hell", "Fische", 2, 2);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);

        List<Room> room = Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8);
        Room getRoomWithSchuppen = room
                .stream()
                // map um die z.B. Koordinatenen mit && zu bekommen
                .filter(x -> "Schuppen".equals(x.getRoomName()))
                .findFirst()
                .orElse(null);
                System.out.println(getRoomWithSchuppen);

        // map um die z.B. Koordinatenen mit && zu bekommen


        //System.out.println("Liste: "+ room0.roomDescription);
        int currentX = 0;
        int currentY = 0;

        System.out.println("***********************************************************************************");
        roomList.forEach(System.out::println);

        Movement direction = Movement.NONE;

        Scanner benutzerEingbe = new Scanner(System.in);
        System.out.print("Richtung: ");
        String richtung = benutzerEingbe.nextLine();

        System.out.println("Richtung aus der Scanner Eingabe ist: " + richtung);

        switch (richtung) {
            case "NORD":
                direction = Movement.NORD;
                break;
            case "OST":
                direction = Movement.OST;
                break;
            case "SUED":
                direction = Movement.SUED;
                break;
            case "WEST":
                direction = Movement.WEST;
                break;
            case "UNTEN":
                direction = Movement.UNTEN;
                break;
            case "OBEN":
                direction = Movement.OBEN;
                break;
            case "TELEPORT":
                direction = Movement.TELEPORT;
                break;
            default:
                System.out.println("Da hat etwas mit der Eingabe nicht geklappt!");
        }


        switch (direction) {
            case NORD:
                System.out.println("Case NORD Ausgabe");
                neuX = 0;
                neuY = 1;
                break;
            case OST:
                System.out.println("Case OST Ausgabe");
                neuX = 1;
                neuY = 0;
                break;
            case SUED:
                System.out.println("Case SUED Ausgabe");
                neuX = 0;
                neuY = -1;
                break;
            case WEST:
                System.out.println("Case WEST Ausgabe");
                neuX = -1;
                neuY = 0;
                break;
            case UNTEN:
                System.out.println("Case UNTEN Ausgabe");
                break;
            case OBEN:
                System.out.println("Case OBEN Ausgabe");
                break;
            case TELEPORT:
                System.out.println("Case TELEPORT Ausgabe");
                break;
/*            case NONE:
                System.out.println("Case NONE Ausgabe");
                break;*/
            default:
                System.out.println("Das hier ist die default Ausgabe. (Eingabefehler wurde erkannt)");
        }



        System.out.println("***************************************************************************************");
        System.out.println("Alter Wert von roomX: " + room1.roomX);
        System.out.println("Alter Wert von roomY: " + room1.roomY);
        System.out.println("Wert von neuX: " + neuX);
        System.out.println("Wert von neuY: " + neuY);
        currentX += neuX;
        currentY += neuY;
        System.out.println("Neuer Wert von roomX: " + currentX);
        System.out.println("Neuer Wert von roomY: " + currentY);

        if (roomList.contains(room1.roomX) && roomList.contains(room1.roomY)) {
            System.out.println("Neuer Raum mit den Koordinaten " + room1.roomX + " / " + room1.roomY + " gefunden.");
        } else {
            System.out.println("Kein neuer Raum gefunden!");
        }
    }


}
