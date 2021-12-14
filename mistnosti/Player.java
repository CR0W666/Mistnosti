public class Player {
    String name;
    Inventory inventory = new Inventory();
    Mistnost currentPosition;
    

    public Player(String name, Mistnost currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }

}
