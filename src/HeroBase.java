public class HeroBase  {


        private String name; // поле, содержащее имя
        protected int health;




//конструктор


        public HeroBase (String name, int health) {
            this.name = name;
            this.health = health;


        }
        //методы




        //4. toString переделка

        @Override
        public String toString() {
            return name ;
        }

    }





