import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Banana banana = new Banana();
        Monkey monkey = new Monkey();
        addObject(banana, 600, 100);
        addObject(monkey, 100, 100);
    }
}
