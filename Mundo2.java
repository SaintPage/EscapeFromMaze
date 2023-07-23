import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo2 extends World
{

    /**
     * Constructor for objects of class Mundo2.
     * 
     */
    public Mundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(535, 720, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
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

        //---------
        BordeV bordeV = new BordeV();
        addObject(bordeV,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV2 = new BordeV();
        addObject(bordeV2,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //-----------------
        BordeV bordeV3 = new BordeV();
        addObject(bordeV3,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordeV3.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        Borde1 borde1 = new Borde1();
        addObject(borde1,207,307);
        borde1.setLocation(145,310);
        Borde1 borde12 = new Borde1();
        addObject(borde12,204,310);
        borde12.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        borde1.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordeV3.setLocation(223,278);
        BordeV bordeV4 = new BordeV();
        addObject(bordeV4,219,213);
        bordeV4.setLocation(222,241);
        bordeV4.setLocation(224,241);
        bordeV3.setLocation(224,300);

        bordeV3.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordeV4.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        Borde1 borde13 = new Borde1();
        addObject(borde13,198,160);
        borde13.setLocation(171,150);
        borde13.setLocation(165,141);
        borde13.setLocation(165,141);
        Borde1 borde14 = new Borde1();
        addObject(borde14,204,67);
        borde14.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        borde13.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque = new bordepeque();
        addObject(bordepeque,267,407);
        bordepeque.setLocation(381,508);

        bordepeque.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque2 = new bordepeque();
        addObject(bordepeque2,312,223);
        bordepeque2.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        izquierda2.setLocation(11,63);

        bordepeque2.setLocation(275,222);
        borde13.setLocation(139,146);
        borde14.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        borde13.setLocation(155,146);
        borde13.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV5 = new BordeV();
        addObject(bordeV5,97,179);
        bordeV5.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque3 = new bordepeque();
        addObject(bordepeque3,68,195);
        bordepeque3.setLocation(47,195);
        bordepeque3.setLocation(378,300);
        bordepeque3.setLocation(350,338);
        bordepeque3.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV6 = new BordeV();
        addObject(bordeV6,92,198);
        bordeV6.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque4 = new bordepeque();
        addObject(bordepeque4,56,232);
        bordepeque4.setLocation(25,234);
        bordepeque bordepeque5 = new bordepeque();
        addObject(bordepeque5,25,234);
        bordepeque5.setLocation(22,231);
        bordepeque4.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque5.setLocation(84,235);
        bordepeque5.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV7 = new BordeV();
        addObject(bordeV7,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV8 = new BordeV();
        addObject(bordeV8,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //------------
        bordepeque bordepeque6 = new bordepeque();
        addObject(bordepeque6,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque7 = new bordepeque();
        addObject(bordepeque7,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //--------------
        bordepeque bordepeque8 = new bordepeque();
        addObject(bordepeque8,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque9 = new bordepeque();
        addObject(bordepeque9,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //----------
        BordeV bordeV9 = new BordeV();
        addObject(bordeV9,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV10 = new BordeV();
        addObject(bordeV10,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV11 = new BordeV();
        addObject(bordeV11,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //---------------
        Borde1 borde15 = new Borde1();
        addObject(borde15,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque10 = new bordepeque();
        addObject(bordepeque10,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //--------
        bordepeque bordepeque11 = new bordepeque();
        addObject(bordepeque11,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        BordeV bordeV12 = new BordeV();
        addObject(bordeV12,169,598);
        bordeV12.setLocation(169,599);
        removeObject(bordeV12);

        //------
        BordeV bordeV13 = new BordeV();
        addObject(bordeV13,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV14 = new BordeV();
        addObject(bordeV14,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //-----
        bordepeque bordepeque12 = new bordepeque();
        addObject(bordepeque12,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        //....
        BordeV bordeV15 = new BordeV();
        addObject(bordeV15,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV16 = new BordeV();
        addObject(bordeV16,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //--------------
        BordeV bordeV17 = new BordeV();
        addObject(bordeV17,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV18 = new BordeV();
        addObject(bordeV18,461,473);
        bordeV18.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //----------
        bordepeque bordepeque13 = new bordepeque();
        addObject(bordepeque13,418,431);
        bordepeque13.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        derecha.setLocation(524,187);
        //-.-----

        bordemas bordemas = new bordemas();
        addObject(bordemas,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        //---
        bordemas bordemas2 = new bordemas();
        addObject(bordemas2,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //---------------------
        BordeV bordeV19 = new BordeV();
        addObject(bordeV19,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV20 = new BordeV();
        addObject(bordeV20,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //-------------
        bordepeque bordepeque14 = new bordepeque();
        addObject(bordepeque14,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque15 = new bordepeque();
        addObject(bordepeque15,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        //-------------
        BordeV bordeV21 = new BordeV();
        addObject(bordeV21,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV22 = new BordeV();
        addObject(bordeV22,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //----------
        bordepeque bordepeque16 = new bordepeque();
        addObject(bordepeque16,174,625);
        bordepeque16.setLocation(Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        bordepeque bordepeque17 = new bordepeque();
        addObject(bordepeque17,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //--------------
        Borde1 borde16 = new Borde1();
        addObject(borde16,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //--------
        BordeVpeque bordeVpeque = new BordeVpeque();
        addObject(bordeVpeque,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        //.....
        BordeV bordeV23 = new BordeV();
        addObject(bordeV23,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        BordeV bordeV24 = new BordeV();
        addObject(bordeV24,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));
        //.....
        bordepeque bordepeque18 = new bordepeque();
        addObject(bordepeque18,Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));

        //Jugador:
        Jp jp = new Jp();
        addObject(jp,30,272);
        
        bot bt = new bot();
        addObject(bt, Greenfoot.getRandomNumber(535), Greenfoot.getRandomNumber(720));        
       
        // Meta:
        win w = new win();
        addObject(w, 510, 400);
        
        
    }

}
