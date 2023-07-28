import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pruebas extends World
{

    /**
     * Constructor for objects of class pruebas.
     * 
     */
    public pruebas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(535, 720, 1);
        prepare();
    }
    private void prepare() {
        Pared pared = new Pared();
        addObject(pared,267,15);
        Derecha derecha = new Derecha();
        addObject(derecha,516,202);
        derecha.setLocation(528,201);
        Derecha2 derecha2 = new Derecha2();
        addObject(derecha2,522,633);
        Abajo abajo = new Abajo();
        addObject(abajo,265,702);
        Izquierda2 izquierda2 = new Izquierda2();
        addObject(izquierda2,13,63);
        Izquierda1 izquierda1 = new Izquierda1();
        addObject(izquierda1,16,510);
        derecha.setLocation(524,187);
        
        addObject(new Borde1(), 100, 210);
        addObject(new Borde1(), 100, 300);
        addObject(new BordeV(), 100, 232);
        addObject(new BordeV(), 100, 278);
        addObject(new BordeVpeque(), 150, 300);
        addObject(new Borde1(), 100, 90);
        addObject(new Borde1(), 100, 180);
        addObject(new Jp(), 100, 500);
        addObject(new Borde1(), 100, 630);
        addObject(new bordepeque(), 100, 540);
        addObject(new bordemas(), 100, 450);
        addObject(new Borde1(), 100, 270);
        addObject(new Borde1(), 100, 360);
        
        addObject(new BordeV(), 90, 630);
        addObject(new BordeV(), 180, 630);
        addObject(new BordeV(), 270, 630);
        addObject(new BordeV(), 360, 630);
        addObject(new BordeVpeque(), 450, 630);
        
        addObject(new BordeV(), 270, 540);
        addObject(new BordeVpeque(), 270, 497);
        addObject(new bordemas(), 405, 630);
    }
}
