import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Dum dum = new Dum();

        for(Mistnost mistnost : dum.getLayout().values()) {
            System.out.println(mistnost.name + " ma pristup k: ");
            for(Mistnost soused : mistnost.sousedi) {
                System.out.println(soused.name);
            }
            System.out.println("\"");
        }
        

    }
}