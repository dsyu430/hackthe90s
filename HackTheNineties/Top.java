import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Top here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Top extends World
{
    Actor sprite = null;
    /**
     * Constructor for objects of class Top.
     * 
     */
    public Top()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(702, 373, 1);
        Grass thicPatch = new ThicPatch();
        Grass thinPatch = new ThinBoi();
        
        addObject(thinPatch, 558, 367);
        addObject(thicPatch, 470, 231);
        
        int trans = 0;
        
        thinPatch.getImage().setTransparency(trans);
        thicPatch.getImage().setTransparency(trans);
    }
    
    public Top(Actor character, boolean afterBattle) {
        super(702,373,1);
        sprite = character;
        
        if(afterBattle) {
            addObject(sprite, sprite.getX(), sprite.getY());
        } else {
            addObject(sprite, sprite.getX(), 10);
        }
        //addObject(sprite, sprite.getX(), getHeight()-15);
        
        Grass thicPatch = new ThicPatch();
        Grass thinPatch = new ThinBoi();
        
        addObject(thinPatch, 558, 367);
        addObject(thicPatch, 470, 231);
        
        int trans = 0;
        
        thinPatch.getImage().setTransparency(trans);
        thicPatch.getImage().setTransparency(trans);
     
    }
    
    public Top(Actor character) {
        super(702,373,1);
        sprite = character;
        addObject(sprite, sprite.getX(), getHeight()-15);
        
        Grass thicPatch = new ThicPatch();
        Grass thinPatch = new ThinBoi();
        
        addObject(thinPatch, 558, 367);
        addObject(thicPatch, 470, 231);
        
        int trans = 0;
        
        thinPatch.getImage().setTransparency(trans);
        thicPatch.getImage().setTransparency(trans);
     
    }
    
    public void act() {
        if(sprite != null) {
            if(sprite.getY() > getHeight() -10) {
                Greenfoot.setWorld(new Middle(sprite,0));
            }
        }

    }
}
