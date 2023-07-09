package soldiers;

public class ResearchSoldier extends IntelligenceSoldier{
    public void research() {}

    public void attack() throws Exception {
        throw new Exception("Research Soldier does not attack");
    }
}
