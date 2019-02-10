import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trainer extends Actor
{
    private int health = 10;
    /**
     * Act - do whatever the trainer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public void hurt() {
            health = health - 1;
            getWorld().showText("HP: " + health, 200,300); 
            if(health == 0) {
                getWorld().removeObject(this);
                
            }
    }
    
    public void act() 
    {
        
    }    
}
