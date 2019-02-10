    
    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
    * Write a description of class Enemy here.
    * 
    * @author (your name) 
    * @version (a version number or a date)
    */
    public class Enemy extends Actor
    {
    public int health;
    public enum Guy {
        PINGU, MOJO, SPONGEBOB
    }
    public Guy guy;
    GreenfootSound sound;
    public boolean hasSoundPlayed = false;
    
    public Enemy() {
        health = 10;
        int x = Greenfoot.getRandomNumber(3) + 1;
        if(x == 1) {
            guy = Guy.PINGU;
            sound = new GreenfootSound("Pingu.mp3");
            setImage("pingusprite.png");
        }
        if(x == 2) {
            guy = Guy.MOJO;
            sound = new GreenfootSound("Mojo Jojo.mp3");
            setImage("mojosprite.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/3, image.getHeight()/3);
            setImage(image);
        } 
        if(x == 3) {
            guy = Guy.SPONGEBOB;
            sound = new GreenfootSound("Spongebob.mp3");
            setImage("spongebobsprite.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/2, image.getHeight()/2);
            setImage(image);
        } 
    }
    
    public void hurt(Attack a) {
            health = health - a.damage;
            getWorld().showText("HP: " + health, 400,100); 
            move(30);
            Greenfoot.delay(5);
            move(-30);
            Greenfoot.delay(5);
            move(30);
            Greenfoot.delay(5);
            move(-30);
    
            getWorld().showText("HP: " + health, 400,100); 
            if(health <= 0) {
                getWorld().removeObject(this);
                
            }
    }
    
    public void act() {
            getWorld().showText("HP: " + health, 400,100);
            if(hasSoundPlayed == false) {
                Greenfoot.delay(250);
                sound.play();
                hasSoundPlayed = true;
            }
            hasSoundPlayed = true;
    }    
}
