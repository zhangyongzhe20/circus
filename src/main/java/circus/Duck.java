package circus;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a circus.Duck";
    }

    @Override
    public int getValue() {
        return 20;
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
