import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lives extends Actor
{
    public void act()
    {
        if (gameOver())
        {
            hide();  
        }
    }
}
