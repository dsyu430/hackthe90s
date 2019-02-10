import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    public int speed = 10;
    public int damage;
    public int oldDamage;
    public boolean player;
    public boolean enemy;
    public Attack(boolean p, int d) {
        player = p;
        damage = d;
    }
    
    public boolean crit() {
        int x = Greenfoot.getRandomNumber(10)+1;
        if(x < 8){
            return false;
        }
        else {
            getWorld().showText("CRITICAL HIT!", 300,200); 
            Greenfoot.delay(80);
            getWorld().showText("", 300,200);
            return true;
        }
    }
    
    public void playerAttack() {
        setLocation(getX() + speed, getY() - 5);
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if(enemy != null) {
            if(crit() == true) {
                oldDamage = damage;
                damage *= 2;
            }
            enemy.hurt(this);
            damage = oldDamage;
            Battle battle = (Battle)getWorld();
            battle.changeETurn();
            getWorld().removeObject(this);
            GreenfootSound psound = new GreenfootSound("Hit SFX.wav");
            psound.play();
            Greenfoot.delay(50);
        }    
    }
    
    public void enemyAttack() {
        setLocation(getX() - speed, getY() + 5);
        BattleSprite t = (BattleSprite)getOneIntersectingObject(BattleSprite.class);
        if(t != null) {
            if(crit() == true) {
                oldDamage = damage;
                damage *= 2;
            }
            t.hurt(this);
            damage = oldDamage;
            Battle battle = (Battle)getWorld();
            battle.changePTurn();
            getWorld().removeObject(this);
            GreenfootSound psound = new GreenfootSound("Hit SFX.wav");
            psound.play();
            //Greenfoot.delay(50);
        }    
    }
    
    /**
     * Act - do whatever the attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(this.player == true) {
            playerAttack();
        }
        else{
            enemyAttack();
        }
    }    
}
