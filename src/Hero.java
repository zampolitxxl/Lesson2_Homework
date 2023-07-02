public class Hero extends  HeroBase implements  HealthIndication, MagicIndication {


    public int magic;

    public Hero(String name, int health, int magic) {
        super(name, health);
        this.magic=magic;
    }

    @Override
    public int healing() {
        int healthCount = this.health;
        return healthCount;
    }

        @Override
        public int magic (){
            int magicCount = this.magic;
            return magicCount;
        }
    }