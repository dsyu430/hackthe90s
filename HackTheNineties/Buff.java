import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buff extends Actor
{
    /**
     * Act - do whatever the Buff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(270);
        for(int i = 1; i < 70; i++) {
            move(3);
            Greenfoot.delay(1);
        }
        Greenfoot.delay(20);
        setRotation(90);
        for(int i = 1; i < 70; i++) {
            move(3);
            Greenfoot.delay(1);
        }
        Greenfoot.delay(20);
        Battle battle = (Battle)getWorld();
        battle.changeETurn();
        getWorld().removeObject(this);
    }    
}
