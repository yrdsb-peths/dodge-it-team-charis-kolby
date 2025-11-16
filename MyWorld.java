import greenfoot.*;

public class MyWorld extends World {
    Score score;
    Monkey monkey;
    public MyWorld() {
        super(600, 400, 1);
        score = new Score();
        Banana banana = new Banana();
        monkey = new Monkey();
        addObject(monkey, 100, 100);
        addObject(banana, 600, 100);
        addObject(score, 500 ,50);
    }
    
    public Score getScoreActor(){
        return score;
    }
    
    public Monkey getMonkeyActor(){
        return monkey;
    }
}
