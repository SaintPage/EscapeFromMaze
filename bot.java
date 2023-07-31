import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bot extends Actor
{
    /**
     * Act - do whatever the bot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r = Greenfoot.getRandomNumber(4);
    int dx=0,dy=0;
    //int X = getX(); 
    //int Y = getY();
    public void act()
    {
        // Add your action code here.
        
        if (r == 0){
            dx =1;
            dy = 0;
        }
        if (r == 1){
            dx = -1;dy=0;
        }
        if (r == 2){
            dy =1;dx=0;
        }
        if (r == 3){
            dy = -1;dx=0;
        }
        setLocation(getX() + dx, getY() + dy);
        
        if (isTouching(Pared.class) && (dx != 0)){
            setLocation(getX()-dx, getY());
            r = Greenfoot.getRandomNumber(4);
        }
        if (isTouching(Pared.class) && (dy != 0)){
            setLocation(getX(), getY()-dy);
            r = Greenfoot.getRandomNumber(4);
            
        }
        
        
    }
}
