import greenfoot.*;

public class MyWorld extends World {
    Score score;
    Monkey monkey;
    public MyWorld() {
        super(600, 400, 1);
        score = new Score();
        Banana banana = new Banana();
        monkey = new Monkey();
        Lives lives = new Lives();
        addObject(monkey, 100, 100);
        addObject(banana, 600, 100);
        addObject(score, 500 ,50);
        addObject(lives, 50,50);
    }
    
    public Score getScoreActor(){
        return score;
    }
    
    public Monkey getMonkeyActor(){
        return monkey;
    }
}
