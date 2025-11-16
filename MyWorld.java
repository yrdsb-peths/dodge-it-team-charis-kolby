import greenfoot.*;

public class MyWorld extends World {
    Score score;
    Monkey monkey;
    private int lives = 3;
    private Lives[] livesActors = new Lives[lives];
    
    public MyWorld() {
        super(600, 400, 1);
        score = new Score();
        Banana banana = new Banana();
        monkey = new Monkey();
        
        addObject(monkey, 100, 100);
        addObject(banana, 600, 100);
        addObject(score, 500 ,50);
        
        for (int i = 0; i < lives; i++){
            Lives lives = new Lives();
            addObject(lives, 50 + 30 * i, 50);
            livesActors[i] = lives;
        }
    }
    
    public Score getScoreActor(){
        return score;
    }
    
    public Monkey getMonkeyActor(){
        return monkey;
    }
    
    public int getLives()
    {
        return lives;
    }
    
    public Lives[] getLivesActors()
    {
        return livesActors;
    }
    
    public void decreaseLive()
    {
        lives--;
    }
}
