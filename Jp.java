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
    public void act()
    {
        int dx=0,dy=0;
        if(Greenfoot.isKeyDown("d")) dx=1;
        if(Greenfoot.isKeyDown("a")) dx=-1;
        if(Greenfoot.isKeyDown("w")) dy=-1;
        if(Greenfoot.isKeyDown("s")) dy=1;
        
        setLocation(getX() + dx, getY() + dy);
        
        if (isTouching(Pared.class)){
            setLocation(getX()-dx, getY()-dy);
        }

        // Add your action code here.
    }
}
