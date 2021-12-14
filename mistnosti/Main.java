import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    static Dum dum = new Dum();
    static Player player;
    
    public static void main(String[] args) {
        createPlayer();
        

        while(chooseAction().equalsIgnoreCase("exit")) {
            //todo

        }
        

    }

    public static String chooseAction() {

        //todo
        
        return "";
    }

    public static void createPlayer() {
        System.out.println("Jak se jmenujes?");
        this.player = new Player(sc.nextLine(), dum.layout.get("Obyvak"));

    }

    public static void exitHouse() {
        sc.close();
        System.exit(0);
    }
}