import java.util.ArrayList;
import java.util.List;

public class Mistnost {
    final String name;
    boolean rozsviceno;
    List<Mistnost> sousedi;
    final Inventory loot;

    public Mistnost(String name) {
        this.name = name;
        this.rozsviceno = false;
        this.sousedi = new ArrayList<>();
        this.loot = new Inventory();
    }

    public void setSousedi(List<Mistnost> sousedi) {
        this.sousedi = sousedi;
    }

    public void addItem(Item item) {
        this.loot.addItem(item);
    }

    public void addItems(List<Item> items) {
        for(Item item : items) loot.addItem(item);
    }

    public Item getItem(Item item) {
        return this.loot.getItem(item);
    }


    public void lightswitch() {
        this.rozsviceno = !rozsviceno;
    }



}