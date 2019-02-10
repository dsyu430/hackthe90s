import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jimmy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sprite extends Actor
{
    public Sprite() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image);
    }
    /**
     * Act - do whatever the Jimmy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-3);
            Grass inGrass = (Grass) getOneIntersectingObject(Grass.class);
            if(inGrass != null) {
                int random = Greenfoot.getRandomNumber(1000);
                if(random <= 5) {
                    triggerRandom();
                }
                
            }
        }
        if(Greenfoot.isKeyDown("right")) {
            move(3);
            Grass inGrass = (Grass) getOneIntersectingObject(Grass.class);
            if(inGrass != null) {
                int random = Greenfoot.getRandomNumber(1000);
                if(random <= 5) {
                    triggerRandom();
                }
                
            }
        }
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-3);
            Grass inGrass = (Grass) getOneIntersectingObject(Grass.class);
            if(inGrass != null) {
                int random = Greenfoot.getRandomNumber(1000);
                if(random <= 5) {
                    triggerRandom();
                }
                
            }
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+3);
            Grass inGrass = (Grass) getOneIntersectingObject(Grass.class);
            if(inGrass != null) {
                int random = Greenfoot.getRandomNumber(1000);
                if(random <= 5) {
                    triggerRandom();
                }
                
            }
        }
    }
    
    public void triggerRandom() {
        int stage = 0;
        if(getWorld() instanceof Bottom) {
            stage = 0;
        } else if(getWorld() instanceof Middle) {
            stage = 1;
        } else if(getWorld() instanceof Top) {
            stage = 2;
        }
        Greenfoot.setWorld(new Battle(this, stage));
    }
}
