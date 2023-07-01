public class Render {


    private String name; // поле, содержащее имя


//конструктор


    public Render(String name) {
        this.name = name;

    }

    public void showIndicator(Object object) {
        if (object instanceof Building) {
            System.out.println("Показетель:   " + ((Building) object).healing(object));
        }


    }
}
