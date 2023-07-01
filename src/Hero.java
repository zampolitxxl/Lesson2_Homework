public class Hero extends  HeroBase implements  HealthIndication, MagicIndication {


    public int magic;

    public Hero(String name, int health, int magic) {
        super(name, health);
        this.magic=magic;
    }

    @Override
    public int healing(HeroBase target) {
        int healthCount = this.health;
        return healthCount;
    }

        @Override
        public int magic (HeroBase target){
            int magicCount = this.magic;
            return magicCount;
        }
    }