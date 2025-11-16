import greenfoot.*;

public class MyWorld extends World {
    private int score = 0;
    
    public MyWorld() {
        super(600, 400, 1);
        showText("Score: " + score, 500, 50);
        Banana banana = new Banana();
        Monkey monkey = new Monkey();
        addObject(monkey, 100, 100);
        addObject(banana, 600, 100);
    }
    
    public int getScore(){
        return score;
    }
    public void increaseScore(){
        score++;
        showText("Score: " + score, 500, 50);
    }
}
