public class Player {
    final String name;
    final Inventory inventory = new Inventory();
    Mistnost currentPosition;
    

    public Player(String name, Mistnost currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }

    public void move(Mistnost newPosition) {
        this.currentPosition = newPosition;
    }


    public boolean canLeave() {
        return inventory.getItem(new Item("Klic")).amount == 2;
    }

}
