public class Building  extends  HeroBase implements  HealthIndication {
    public Building(String name, int health) {
        super(name, health);
    }

    @Override
    public int healing() {
    int healthCount=this.health;
    return healthCount;

    }
}