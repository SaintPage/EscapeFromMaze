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
        lose.setVolume(30);
        lose.stop();
    }
    /**
     * Act - do whatever the Jp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        s.play();
        int dx=0,dy=0;
        if(Greenfoot.isKeyDown("d")) dx=1;
        if(Greenfoot.isKeyDown("a")) dx=-1;
        if(Greenfoot.isKeyDown("w")) dy=-1;
        if(Greenfoot.isKeyDown("s")) dy=1;
        //System.out.println(""+getWorld());
        setLocation(getX() + dx, getY() + dy);
        
        if (s.isPlaying() == false) {
            s.playLoop();
        }
        
        if (isTouching(Pared.class)){
            setLocation(getX()-dx, getY()-dy);
        }
        if (getWorld().getWidth() == 536){
        if (isTouching(win.class) && (counter == 3 || getWorldOfType(Automatic.class).Lvl == 1)){
            
            if (getWorldOfType(Automatic.class).Lvl < 4){
            String x = Greenfoot.ask("VICTORY! Press ok to play again in the next level.");
                
                //if ("random".equals(x)) {
               // Greenfoot.setWorld(new Automatic());
             //   s.stop();
          //  }
            Greenfoot.setWorld(new Automatic(getWorldOfType(Automatic.class).Lvl + 1));}
            else {
                String x = Greenfoot.ask("VICTORY! Press ok to play again in the first level.");
               
            Greenfoot.setWorld(new Automatic(1));
            }
            s.stop();
        }
        if (isTouching(bot.class)){
            getWorld().removeObjects(getWorld().getObjects(food.class));
            s.stop();
            lose.play();

            image myScream = getWorld().getObjects(image.class).get(0);
            myScream.getImage().setTransparency(255);
            myScream.setImage( myGif.getCurrentImage());
            myScream.getImage().scale(590, 790);
            
            
            Greenfoot.delay(1580);   
            lose.stop();
            String x = Greenfoot.ask("DEFEAT! Press ok to play again");

            Greenfoot.setWorld(new Automatic(getWorldOfType(Automatic.class).Lvl));
            
        }
        if (counter == 3 || getWorldOfType(Automatic.class).Lvl == 1){
            win victory = getWorld().getObjects(win.class).get(0);
            victory.getImage().setTransparency(255);
        }
    }
        else{
            if (isTouching(win.class) && counter == 3){
                String x = Greenfoot.ask("VICTORY! Press ok to play again.");
                Greenfoot.setWorld(new Mundo());
            }
            if (isTouching(bot.class)){
            getWorld().removeObjects(getWorld().getObjects(food.class));
            s.stop();
            lose.play();

            image myScream = getWorld().getObjects(image.class).get(0);
            myScream.getImage().setTransparency(255);
            myScream.setImage( myGif.getCurrentImage());
            myScream.getImage().scale(590, 790);
            
            
            Greenfoot.delay(1580);   
            lose.stop();
            String x = Greenfoot.ask("DEFEAT! Press ok to play again");

            Greenfoot.setWorld(new Mundo());
            
        }
        }
        if (isTouching(food.class)){
            getWorld().removeObjects(getObjectsInRange(70, food.class));
            counter++;
        }
        
        if (counter == 3){
            win victory = getWorld().getObjects(win.class).get(0);
            victory.getImage().setTransparency(255);
        }
        // Add your action code here.
    }
}
