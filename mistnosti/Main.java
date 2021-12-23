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
        
        while(!chooseAction().equalsIgnoreCase("exit")) {
            //todo
            break; //ignore
        }
        

    }

    public static String chooseAction() {
        System.out.printf("jsi v mistnosti: %s%nCo chces delat?", player.currentPosition.name);

        
        


        return "";
    }

    public static void printOptions() {
        String lights = (player.currentPosition.rozsviceno) ? "zhasnout" : "rozsvitit";
        String exit = (player.canLeave()) ? "odejit" : "";
        System.out.print("\nMuzes jit do jine mistnosti, " + lights + exit);
        
    }

    public static void printAvailableRooms() {
        System.out.print("(");
        List<Mistnost> sousedi = player.currentPosition.sousedi;
        for(int i = 0; i < sousedi.size(); i++) {
            System.out.print(sousedi.get(i).name);
            if(i<sousedi.size()-1) System.out.print(", ");
        }
        System.out.print(")");
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