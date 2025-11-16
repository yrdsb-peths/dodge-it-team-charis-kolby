import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Actor
{
    public void showScore(int finalScore) {
        GreenfootImage img = new GreenfootImage(
            "You lost! Your score was " + finalScore,
            32,
            Color.RED,
            new Color(0,0,0,0)
        );
        setImage(img);
    }
}
