import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Inventory {
    public void InventoryP() {
        Set<String> playerInventory = new HashSet<>();
        playerInventory.add("Messer");
        playerInventory.add("Schild");
        playerInventory.add("Schwert");
        playerInventory.add("Helm");
        playerInventory.add("Handschuhe");
        playerInventory.add("Stiefel");

        for (String nextOut : playerInventory) {
            System.out.println(nextOut);
        }
        System.out.println(playerInventory.toString());
    }
}

