package c.soldiers;

public class Soldier {
    String name;
    int age;
    String gunLicense;

    public void shoot() throws Exception {
        System.out.println("Pew Pew");
    };

    public void attack() throws Exception {
        this.shoot();
    }
}
