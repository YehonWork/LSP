package soldiers;

import java.util.ArrayList;
import java.util.List;

public class Operation {
    List<Soldier> soldiers = new ArrayList<>();

    public void attack() throws Exception {
        for (Soldier soldier: soldiers) {
            soldier.attack();
        }
    }
}
