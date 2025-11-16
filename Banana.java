import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    private int speed = -2;
    private int lastScore = 0;
    private boolean decreased = false;
    public void act()
    {
       if (getWorld() == null){
           return;
       }
       MyWorld myWorld = (MyWorld) getWorld();
       Score score = myWorld.getScoreActor();
       Monkey monkey = myWorld.getMonkeyActor();
       World world = getWorld();
       
       if (score.getScore() != lastScore && score.getScore() % 2 == 0){
           speed -= 2;
           lastScore = score.getScore();
       }
       move(speed);
       
       if (getX() <= 0)
       {
           if(!decreased)
           {
               score.increaseScore();
           }
           resetBanana();
       }
       
       
       if (isTouching(Monkey.class)){
           Lives[] livesActors = myWorld.getLivesActors();
           if (!decreased) {
            myWorld.decreaseLive();
            int lives = myWorld.getLives();
            if (lives >= 0) {
                world.removeObject(livesActors[lives]);
            }
            decreased = true;
    
            if (lives <= 0) {
                gameOver(world, myWorld.getScoreActor(), myWorld.getMonkeyActor());
            }
        }
           
        }
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        int x = 600;
        int y;
        
        if (num == 0) {
            y = 100;
        } else {
            y = 300;
        }
        
        decreased = false;
        setLocation(x, y);
        }
        
    public void gameOver(World world, Score score, Monkey monkey)
    {
        world.removeObject(this);
            
        int worldHalfWidth = world.getWidth() / 2;
        int worldHalfHeight = world.getHeight() / 2;
        
        SadFace sadFace = new SadFace();
        score.hide();
        monkey.hide();
        
        GameOver gameOverObj = new GameOver();
        gameOverObj.showScore(score.getScore());
        world.addObject(gameOverObj, worldHalfWidth, worldHalfHeight + 50);
        world.addObject(sadFace, worldHalfWidth, worldHalfHeight);
        Greenfoot.stop();
    }
}
