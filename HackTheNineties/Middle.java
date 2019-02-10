import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Middle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Middle extends World
{
    Actor sprite = null;
    /**
     * Constructor for objects of class Middle.
     * 
     */
    public Middle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(703, 378, 1);
        
        Grass bottom1 = new TwoXSix();
        Grass bottom2 = new TwoXSix();
        Grass top1 = new TwoXSix();
        Grass top2 = new TwoXSix();
        Grass top3 = new TwoXSix();
        
        addObject(bottom1, 445, 320);
        addObject(bottom2, 445, 350);
        addObject(top1, 563, 97);
        addObject(top2, 563, 50);
        addObject(top3, 563, 0);
        
        int trans = 0;
        
        bottom1.getImage().setTransparency(trans);
        bottom2.getImage().setTransparency(trans);
        top1.getImage().setTransparency(trans);
        top2.getImage().setTransparency(trans);
        top3.getImage().setTransparency(trans);
    }
    
    public Middle(Actor character, int position) {
        super(703, 378, 1);
        Grass bottom1 = new TwoXSix();
        Grass bottom2 = new TwoXSix();
        Grass top1 = new TwoXSix();
        Grass top2 = new TwoXSix();
        Grass top3 = new TwoXSix();
        
        addObject(bottom1, 445, 320);
        addObject(bottom2, 445, 350);
        addObject(top1, 563, 97);
        addObject(top2, 563, 50);
        addObject(top3, 563, 0);
        
        int trans = 0;
        
        bottom1.getImage().setTransparency(trans);
        bottom2.getImage().setTransparency(trans);
        top1.getImage().setTransparency(trans);
        top2.getImage().setTransparency(trans);
        top3.getImage().setTransparency(trans);
        sprite = character;
        if(position == 1) {
            addObject(sprite, character.getX(), getHeight()-15);
        } else if(position == 0) {
            addObject(sprite, character.getX(), 15);
        }
        
    }
    
    public Middle(Actor character, boolean afterBattle) {
        super(703, 378, 1);
        Grass bottom1 = new TwoXSix();
        Grass bottom2 = new TwoXSix();
        Grass top1 = new TwoXSix();
        Grass top2 = new TwoXSix();
        Grass top3 = new TwoXSix();
        
        addObject(bottom1, 445, 320);
        addObject(bottom2, 445, 350);
        addObject(top1, 563, 97);
        addObject(top2, 563, 50);
        addObject(top3, 563, 0);
        
        int trans = 0;
        
        bottom1.getImage().setTransparency(trans);
        bottom2.getImage().setTransparency(trans);
        top1.getImage().setTransparency(trans);
        top2.getImage().setTransparency(trans);
        top3.getImage().setTransparency(trans);
        sprite = character;
        if(afterBattle) {
            addObject(sprite, sprite.getX(), sprite.getY());
        } else {
            addObject(sprite, sprite.getX(), 10);
        }
        
    }
    
    
    
    public void act() {
     if(sprite != null) {
        if(sprite.getY() < 10) {
            Greenfoot.setWorld(new Top(sprite));
        } else if(sprite.getY() > getHeight()-10) {
            Greenfoot.setWorld(new Bottom(sprite));
        }
     }
    }
}
