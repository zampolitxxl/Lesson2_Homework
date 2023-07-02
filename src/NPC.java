public class NPC extends  HeroBase implements  HealthIndication {
    public NPC(String name, int health) {
        super(name, health);
    }
    @Override
    public int healing() {
        int healthCount = this.health;
        return healthCount;
    }
}