
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Item> contents = new ArrayList<>();
    

    public void addItem(Item item) {
        boolean found = false;
        
        for (Item iItem : contents) {
            if(iItem.name.equalsIgnoreCase(item.name)) {
                iItem.amount++;
                found = true;
                break;
            }
        }

        if(!found) contents.add(item);
    }



    public void removeItem(Item item) {
        for (Item iItem : contents) {
            if(iItem.name.equalsIgnoreCase(item.name)) {
                if(iItem.amount == 1) contents.remove(iItem);
                else iItem.amount--;
                break;
            }
        }
    }

    public Item getItem(Item item) {
        for (Item iItem : contents) {
            if(iItem.name.equalsIgnoreCase(item.name)) {
                return iItem;
            }
        }
        return new Item("null", "placeholder", -1);
    }

    public List<Item> getContents() {
        return contents;
    }
}