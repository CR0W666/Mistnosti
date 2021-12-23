public class Item {
    final String name;
    final String lore;
    
    public Item(String name, String lore) {
        this.name = name;
        this.lore = lore;
    }

    public Item(String name) {
        this.name = name;
        this.lore = "";
    }

}
