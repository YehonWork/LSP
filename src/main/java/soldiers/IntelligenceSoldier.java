package soldiers;

public class IntelligenceSoldier extends Soldier{
    @Override
    public void shoot() throws Exception {
        throw new Exception("Intelligence Soldier does not shoot");
    }


}
