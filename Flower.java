public class Flower {

    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
     return " aime cette fleur elle se nomme " + getName() + ", elle est magnifique";
    }
}