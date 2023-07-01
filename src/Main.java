public class Main {
    public static void main(String[] args){


        HeroBase test=new HeroBase("ork", 12);
    System.out.println(test);

    Building Dom = new Building("Building1", 15);
    System.out.println(Dom);

        Hero Hero  = new Hero("Odin", 22, 34);
        System.out.println(Hero);

        NPC neitralny = new NPC("Solder", 33);
        System.out.println(neitralny);


        //запусаем рендер


        Render renderSystem= new Render("renderWarcraft");

        renderSystem.showIndicator(Dom);




    }
}