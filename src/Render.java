public class Render {


    private String name; // поле, содержащее имя


//конструктор


    public Render(String name) {
        this.name = name;

    }

    public void showIndicator(Object object) {
        if (object instanceof Building) {
            System.out.println("Показетель:   " + "1. Здоровье:  "+ ((Building) object).healing());
        }
        if (object instanceof NPC) {
            System.out.println("Показетель:   "+ "1. Здоровье:  " + ((NPC) object).healing());
        }
        if (object instanceof Hero) {
            System.out.println("Показетель:   "+ "1. Здоровье:  " + ((Hero) object).healing() + "___ 2. Магическая энергия:  "+ ((Hero) object).magic());
        }


    }
}
