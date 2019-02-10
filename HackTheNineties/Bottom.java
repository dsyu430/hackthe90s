import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bottom extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Actor yeet = new Sprite();
    public Bottom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(703, 378, 1);
        addObject(yeet, getWidth()/2, getHeight()/2);
        
        Grass topGrass = new TwoXSix();
        Grass midLeft = new TwoxSeven();
        Grass midBottomLeft = new TwoxSeven();
        Grass midRIght = new TwoXFive();
        Grass midRightBottom = new TwoXFive();
        Grass midBottom = new TwoXFive();
        
        int tras = 0;
        topGrass.getImage().setTransparency(tras);
        midLeft.getImage().setTransparency(tras);
        midBottomLeft.getImage().setTransparency(tras);
        midRightBottom.getImage().setTransparency(tras);
        midRIght.getImage().setTransparency(tras);
        midBottom.getImage().setTransparency(tras);
        midBottom.setRotation(90);
        
        addObject(topGrass, 439, 35);
        addObject(midLeft, 220, 175);
        addObject(midBottomLeft, 163, 230);
        addObject(midRIght, 570, 175);
        addObject(midRightBottom, 510, 230);
        addObject(midBottom, 379, 305);
        Greenfoot.start();
        
        
    }
    
    public Bottom(Actor character, boolean afterBattle) {
        super(703, 378 ,1);
        yeet = character;
        if(afterBattle) {
            addObject(yeet, yeet.getX(), yeet.getY());
        } else {
            addObject(yeet, yeet.getX(), 10);
        }
        
        //addObject(yeet, yeet.getX(), 10);
        Grass topGrass = new TwoXSix();
        Grass midLeft = new TwoxSeven();
        Grass midBottomLeft = new TwoxSeven();
        Grass midRIght = new TwoXFive();
        Grass midRightBottom = new TwoXFive();
        Grass midBottom = new TwoXFive();
        
        int tras = 0;
        topGrass.getImage().setTransparency(tras);
        midLeft.getImage().setTransparency(tras);
        midBottomLeft.getImage().setTransparency(tras);
        midRightBottom.getImage().setTransparency(tras);
        midRIght.getImage().setTransparency(tras);
        midBottom.getImage().setTransparency(tras);
        midBottom.setRotation(90);
        
        addObject(topGrass, 439, 35);
        addObject(midLeft, 220, 175);
        addObject(midBottomLeft, 163, 230);
        addObject(midRIght, 570, 175);
        addObject(midRightBottom, 510, 230);
        addObject(midBottom, 379, 305);
    }
    
    public Bottom(Actor character) {
        super(703, 378 ,1);
        yeet = character;
        
        //addObject(yeet, yeet.getX(), 10);
        Grass topGrass = new TwoXSix();
        Grass midLeft = new TwoxSeven();
        Grass midBottomLeft = new TwoxSeven();
        Grass midRIght = new TwoXFive();
        Grass midRightBottom = new TwoXFive();
        Grass midBottom = new TwoXFive();
        
        int tras = 0;
        topGrass.getImage().setTransparency(tras);
        midLeft.getImage().setTransparency(tras);
        midBottomLeft.getImage().setTransparency(tras);
        midRightBottom.getImage().setTransparency(tras);
        midRIght.getImage().setTransparency(tras);
        midBottom.getImage().setTransparency(tras);
        midBottom.setRotation(90);
        
        addObject(topGrass, 439, 35);
        addObject(midLeft, 220, 175);
        addObject(midBottomLeft, 163, 230);
        addObject(midRIght, 570, 175);
        addObject(midRightBottom, 510, 230);
        addObject(midBottom, 379, 305);
    }
    
    public void act() {
        if(yeet.getY() <10) {
            Greenfoot.setWorld(new Middle(yeet,1));
        }
    }
    
}
