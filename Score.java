import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    private int score = 0;
    
    public Score(){
        showScore();
    }
    
    public int getScore(){
        return score;
    }
    
    public void increaseScore(){
        score++;
        showScore();
    }
    
    public void showScore(){
        World world = getWorld();
        GreenfootImage scoreText = new GreenfootImage("Score: " + getScore(), 32, Color.RED,new Color(0, 0, 0, 0));
        setImage(scoreText);
    }
    
    public void hide()
    {
        World world = getWorld();
        world.removeObject(this);
    }
}
