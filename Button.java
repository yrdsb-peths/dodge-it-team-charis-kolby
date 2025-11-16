import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    public Button()
    {
        GreenfootImage img = new GreenfootImage(("Restart"), 32, Color.RED, new Color(1, 1, 1, 1));
        setImage(img);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.initiateWorld();
        }
    }
}
