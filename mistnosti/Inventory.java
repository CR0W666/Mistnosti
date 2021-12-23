
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Item, Integer> contents = new HashMap<>();
    

    public void addItem(Item item) {
        contents.put(item, contents.getOrDefault(item, 0) + 1);
    }

    public void removeItem(Item item) {
        contents.computeIfPresent(item, (k, v) -> v-1);
    }

    public Item getItem(Item item) {
        if(contents.get(item) > 0 || contents.get(item) != null) {
            removeItem(item);
            return item;
        } else return null;
    }

    public Map<Item, Integer> getContents() {
        return this.contents;
    }
}