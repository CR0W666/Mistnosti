
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Dum {
    public final Map<String, Mistnost> layout = new HashMap<>();

    public Dum() {
        initializeLayout();
        initialiteLoot();
    }

    private void initializeLayout() {
        final String OBYVAK = "Obyvak";
        final String LOZNICE = "Loznice";
        final String KABINET = "Smajchl kabinet";
        final String KUCHYNE = "Kuchyne";
        final String PODKROVI = "Podkrovi";

        layout.put(OBYVAK, new Mistnost(OBYVAK));
        layout.put(LOZNICE, new Mistnost(LOZNICE));
        layout.put(KABINET, new Mistnost(KABINET));
        layout.put(KUCHYNE, new Mistnost(KUCHYNE));
        layout.put(PODKROVI, new Mistnost(PODKROVI));

        layout.get(OBYVAK).setSousedi(
            List.of(
                layout.get(LOZNICE),
                layout.get(KABINET),
                layout.get(KUCHYNE)
            )
        );
        
        layout.get(LOZNICE).setSousedi(
            List.of(
                layout.get(PODKROVI),
                layout.get(OBYVAK)
                )        
        );
        
        layout.get(KUCHYNE).setSousedi(
            List.of(
            layout.get(OBYVAK),
            layout.get(KABINET)
            )
        );
        layout.get(KABINET).setSousedi(
            List.of(
                layout.get(OBYVAK),
                layout.get(KUCHYNE)
            )
        );
        layout.get(PODKROVI).setSousedi(
            List.of(
                layout.get(LOZNICE)
            )
        );
        
    }

    private void initialiteLoot() {
        //todo
    }


}
