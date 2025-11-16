import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    private int speed = -2;
    private int lastScore = 0;
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
           score.increaseScore();
           resetBanana();
       }
       
       if (isTouching(Monkey.class)){
            world.removeObject(this);
            
            int worldHalfWidth = world.getWidth() / 2;
            int worldHalfHeight = world.getHeight() / 2;
            
            SadFace sadFace = new SadFace();
            score.hide();
            monkey.hide();
            
            GameOver gameOver = new GameOver();
            gameOver.showScore(score.getScore());
            world.addObject(gameOver, worldHalfWidth, worldHalfHeight + 50);
            world.addObject(sadFace, worldHalfWidth, worldHalfHeight);
            Greenfoot.stop();
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
        
        setLocation(x, y);
        }
}
