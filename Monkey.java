import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monkey extends Actor
{
    private boolean atTop = true;
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if (atTop)
        {
            setLocation (100, 100);
        }
        else
        {
            setLocation(100, 300);
        }
    }
}
