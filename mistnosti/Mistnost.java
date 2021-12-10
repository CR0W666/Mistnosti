import java.util.ArrayList;
import java.util.List;

public class Mistnost {
    String name;
    boolean rozsviceno;
    List<Mistnost> sousedi;

    public Mistnost(String name) {
        this.name = name;
        this.rozsviceno = false;
        this.sousedi = new ArrayList<>();
    }

    public void setSousedi(List<Mistnost> sousedi) {
        this.sousedi = sousedi;
    }



}