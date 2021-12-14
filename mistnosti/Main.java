import java.util.Scanner;

class Main {
    static final Scanner sc = new Scanner(System.in);
    static final Dum dum = new Dum();
    static Player player;
    
    public static void main(String[] args) {
        player = createPlayer();
        

        while(chooseAction().equalsIgnoreCase("exit")) {
            //todo

        }
        

    }

    public static String chooseAction() {

        //todo

        return "";
    }

    public static Player createPlayer() {
        System.out.println("Jak se jmenujes?");
        return new Player(sc.nextLine(), dum.layout.get("Obyvak"));
    }

    public static void exitHouse() {
        sc.close();
        System.exit(0);
    }
}