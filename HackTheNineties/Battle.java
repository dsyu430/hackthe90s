
    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Battle here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Battle extends World
    {
        BattleSprite p1 = new BattleSprite();
        Enemy e = new Enemy();
        Button b1 = new Button();
        Button b2 = new Button();
        
        Bottom vw = new Bottom();
        boolean playerTurn = true;
        boolean enemyTurn = false;
        boolean soundPlayed = false;
        int stage = 0;
        Actor sprite = null;
        /**
         * Constructor for objects of class Battle.
         * 
         */
    
        public Battle(Actor sprite, int stage)
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(600, 400, 1);
    
             this.stage = stage;
             this.sprite = sprite;
            addObject(p1, 100, 330);
            addObject(e, 500, 100);
            addObject(b1, 500, 280);
            addObject(b2, 430, 280);

            
        }
        public void act() {
            GreenfootSound sound = new GreenfootSound("Battle Music.mp3");
            sound.setVolume(50);
            GreenfootSound psound = new GreenfootSound("Will Smith.mp3");
            if(soundPlayed == false) {
                psound.play();
                sound.play();
                soundPlayed = true;
            }
            soundPlayed = true;
        if(playerTurn == true && enemyTurn == false) {
            if(Greenfoot.mouseClicked(b1)){
                changePTurn();
                int x = Greenfoot.getRandomNumber(3);
                Attack a = new Attack(true, x);
                addObject(a, 100, 300);
            }
            else if(Greenfoot.mouseClicked(b2)){
                changePTurn();
                Buff b = new Buff();
                addObject(b, 100, 300);
            }
        }
        
        if(enemyTurn == true && playerTurn == false) {
            changeETurn();
            int x = Greenfoot.getRandomNumber(3);
            Attack ea = new Attack(false, x);
            addObject(ea, 500, 100);           
        }
        
        if(e.health <= 0 || p1.health <= 0) {
            //Greenfoot.setWorld(vw);
            if(stage == 0) {
                Greenfoot.setWorld(new Bottom(sprite, true));
            } else if(stage == 1) {
                Greenfoot.setWorld(new Middle(sprite, true));
            } else if(stage == 2) {
                Greenfoot.setWorld(new Top(sprite, true));
            }

        }
    }
    
    public void changePTurn() {
        playerTurn = !playerTurn;
    }
    public void changeETurn() {
        enemyTurn = !enemyTurn;
    }
}
