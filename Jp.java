import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jp extends Actor
{
    public Jp(){
        GreenfootImage image= getImage();
        image.scale(40,40);  
        
    }
    /**
     * Act - do whatever the Jp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound s = new GreenfootSound("video0.MP3"); 
    public void act()
    {
        int dx=0,dy=0;
        if(Greenfoot.isKeyDown("d")) dx=1;
        if(Greenfoot.isKeyDown("a")) dx=-1;
        if(Greenfoot.isKeyDown("w")) dy=-1;
        if(Greenfoot.isKeyDown("s")) dy=1;
        
        setLocation(getX() + dx, getY() + dy);
        
        if (s.isPlaying() == false) {
            s.playLoop();
        }
        
        if (isTouching(Pared.class)){
            setLocation(getX()-dx, getY()-dy);
        }
        if (isTouching(win.class)){
            String x = Greenfoot.ask("VICTORY! Press ok to play again.");
                
                if ("random".equals(x)) {
                Greenfoot.setWorld(new Mundo2());
                s.stop();
            }
            Greenfoot.setWorld(new Mundo());
            s.stop();
        }
        if (isTouching(bot.class)){
            String x = Greenfoot.ask("DEFEAT! Press ok to play again");

                Greenfoot.setWorld(new Mundo());
                s.stop();

        }
        
        // Add your action code here.
    }
}
