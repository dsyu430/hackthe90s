import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleSprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleSprite extends Actor
{
    public int health = 10;

    public BattleSprite(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    public void hurt(Attack a) {
        health = health - a.damage;
        getWorld().showText("HP: " + health, 200,350); 
        move(30);
        Greenfoot.delay(5);
        move(-30);
        Greenfoot.delay(5);
        move(30);
        Greenfoot.delay(5);
        move(-30);
        if(health <= 0) {
            getWorld().removeObject(this);
            
        }
    }
    public void act() 
    {
        getWorld().showText("HP: " + health, 200,350);
        
    }    
}
