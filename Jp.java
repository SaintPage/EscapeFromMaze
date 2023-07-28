import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Thread;
/**
 * Write a description of class Jp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jp extends Actor
{
    image scream = new image();
    private int counter = 0;
    GifImage myGif = new GifImage("scream.gif");
    private GreenfootSound s = new GreenfootSound("video0.MP3");
    private GreenfootSound lose = new GreenfootSound("lose.mp3");
    
    public Jp(){
        GreenfootImage image= getImage();
        image.scale(40,40);  
        s.setVolume(20);
        s.play();
        lose.setVolume(30);
        lose.stop();
    }
    /**
     * Act - do whatever the Jp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
        if (isTouching(win.class) && counter == 3){
            
            String x = Greenfoot.ask("VICTORY! Press ok to play again.");
                
                if ("random".equals(x)) {
                Greenfoot.setWorld(new Mundo2());
                s.stop();
            }
            Greenfoot.setWorld(new Mundo());
            s.stop();
        }
        if (isTouching(food.class)){
            getWorld().removeObjects(getObjectsInRange(100, food.class));
            counter++;
        }
        if (isTouching(bot.class)){
            s.stop();
            lose.play();

            image myScream = getWorld().getObjects(image.class).get(0);
            myScream.getImage().setTransparency(255);
            myScream.setImage( myGif.getCurrentImage());
            myScream.getImage().scale(535, 720);
            
            
            Greenfoot.delay(2000);   
            lose.stop();
            String x = Greenfoot.ask("DEFEAT! Press ok to play again");

            Greenfoot.setWorld(new Mundo());
            
        }
        if (counter == 3){
            win victory = getWorld().getObjects(win.class).get(0);
            victory.getImage().setTransparency(255);
        }
        // Add your action code here.
    }
}
