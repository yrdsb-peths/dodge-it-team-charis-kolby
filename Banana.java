import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    private int speed = -2;
    private int lastScore = 0;
    public void act()
    {
       MyWorld myWorld = (MyWorld) getWorld();
       World world = getWorld();
       
       if (myWorld.getScore() != lastScore && myWorld.getScore() % 2 == 0){
           speed -= 2;
           lastScore = myWorld.getScore();
       }
       move(speed);
       if (getX() <= 0)
       {
           myWorld.increaseScore();
           resetBanana();
       }
       
       if (isTouching(Monkey.class)){
            world.removeObject(this);
            
            SadFace sadFace = new SadFace();
            world.addObject(sadFace, world.getWidth() / 2, world.getHeight() / 2);
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
        
        setLocation(x, y); // Set location to random position
        }
}
