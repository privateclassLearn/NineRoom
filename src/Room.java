import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Room {


    private String roomName;
    private String roomDescription;
    private String roomItems;
    public int roomX;
    public int roomY;

    public Room(String roomName, String roomDescription, String roomItems, int roomX, int roomY) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomItems = roomItems;
        this.roomX = roomX;
        this.roomY = roomY;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomItems() {
        return roomItems;
    }

    public void setRoomItems(String roomItems) {
        this.roomItems = roomItems;
    }

    public int getRoomX() {
        return roomX;
    }

    public void setRoomX(int roomX) {
        this.roomX = roomX;
    }

    public int getRoomY() {
        return roomY;
    }

    public void setRoomY(int roomY) {
        this.roomY = roomY;
    }

    @Override
    public String toString() {

        return "Raumeigenchaften:" +
                " Raumname: " + roomName +
                " Raumbeschreibung: " + roomDescription +
                " Gegenstände im Raum: " + roomItems +
                " Raumkoordinate x: " + roomX +
                " Raumkoordinate y: " + roomY;
    }
}
