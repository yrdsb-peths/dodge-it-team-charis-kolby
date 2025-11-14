import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        String score = "0";
        showText(score, 500, 50);
        Banana banana = new Banana();
        Monkey monkey = new Monkey();
        addObject(monkey, 100, 100);
        addObject(banana, 600, 100);
    }
}
