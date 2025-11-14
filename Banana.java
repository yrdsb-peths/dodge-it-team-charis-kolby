import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public void act()
    {
        move (-10);
       
       if (getX() <= 0)
       {
           resetBanana();
       }
       
       if (isTouching(Monkey.class)){
            World world = getWorld();
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
