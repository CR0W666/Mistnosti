public class Item {
    final String name;
    final String lore;
    int amount;
    
    public Item(String name, String lore, int amount) {
        this.name = name;
        this.lore = lore;
        this.amount = amount;
    }

    public Item(String name, String lore) {
        this.name = name;
        this.lore = lore;
        this.amount = 1;
    }

    public Item(String name) {
        this.name = name;
        this.lore = "";
        this.amount = 1;
    }

}
