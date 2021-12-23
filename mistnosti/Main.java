import java.util.List;
import java.util.Scanner;
    /*
    !! looteni trva 3 sec
    * random rozhozeny 2 klice
        !! muzu odejit jen s dvema klici

    * pri looteni muzu zhebnout z random duvodu
    */
class Main {
    static final Scanner sc = new Scanner(System.in);
    static final Dum dum = new Dum();
    static Player player;
    
    public static void main(String[] args) {
        player = createPlayer();
        String action = "null";
        
        
        while(true) {
            action = chooseAction();
            evalAction(action);
        }
        

    }

    public static String chooseAction() {
        System.out.println("\n==================================");
        System.out.printf("jsi v mistnosti: %s%nCo chces delat?", player.currentPosition.name);
        printOptions();
        System.out.println("==================================\n");

        int action;

        try {
            action = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            action = 0;
        }

        switch(action) {
            
            case 1:
                return "move";

            case 2:  
                return "lights";
            
            case 3:
                return "loot";

            case 4:
                if(player.canLeave()) return "exit";
                return "null";

            default:
                return "null";
                
        }

    }

    public static void evalAction(String action) {
        switch(action) {
            case "exit":
                System.out.println("Odesel jsi");
                exitHouse();
                break;

            case "lights":
                System.out.println((player.currentPosition.rozsviceno) ? "zhasl jsi" : "rozsvitil jsi");
                player.currentPosition.lightswitch();
                break;

            case "move":
                movePlayer();
                break;

            case "loot":
                loot();
                break;
            
            case "null":
                System.out.println("Nic jsi neudelal");
                break;

            default: break;
        }
    }

    public static void printOptions() {
        String lights = (player.currentPosition.rozsviceno) ? "zhasnout" : "rozsvitit";

        System.out.printf("%nMuzes:%n 1) jit do jine mistnosti%n 2) %s%n 3) prohledat mistnost %n", lights);
        if(player.canLeave()) System.out.println(" 4) odejit %n");
        
    }

    public static void printAvailableRooms() {
        System.out.print("(");
        List<Mistnost> sousedi = player.currentPosition.sousedi;
        for(int i = 0; i < sousedi.size(); i++) {
            System.out.print((i+1) + ") " + sousedi.get(i).name);
            if(i<sousedi.size()-1) System.out.print(", ");
        }
        System.out.print("): ");
    }

    public static void movePlayer() {
        System.out.println("Muzes se posunout do: ");
        printAvailableRooms();
        int choice;

        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) { System.out.println("Tam nemuzes"); return; }

        if (choice < 1 || choice > player.currentPosition.sousedi.size()) {
            System.out.println("Tam nemuzes");
            return;
        } 

        player.move(player.currentPosition.sousedi.get(choice-1));

    }

    public static void loot() {
        System.out.println("Rozhodl jsi se prohledat mistnost");
        //todo
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