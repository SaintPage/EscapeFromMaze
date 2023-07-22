import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
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
        addObject(bordeV,425,170);
        BordeV bordeV2 = new BordeV();
        addObject(bordeV2,425,125);

        //-----------------
        BordeV bordeV3 = new BordeV();
        addObject(bordeV3,414,407);
        bordeV3.setLocation(402,511);

        Borde1 borde1 = new Borde1();
        addObject(borde1,207,307);
        borde1.setLocation(145,310);
        Borde1 borde12 = new Borde1();
        addObject(borde12,204,310);
        borde12.setLocation(181,309);
        borde1.setLocation(47,309);
        bordeV3.setLocation(223,278);
        BordeV bordeV4 = new BordeV();
        addObject(bordeV4,219,213);
        bordeV4.setLocation(222,241);
        bordeV4.setLocation(224,241);
        bordeV3.setLocation(224,300);

        bordeV3.setLocation(204,285);
        bordeV4.setLocation(204,247);
        Borde1 borde13 = new Borde1();
        addObject(borde13,198,160);
        borde13.setLocation(171,150);
        borde13.setLocation(165,141);
        borde13.setLocation(165,141);
        Borde1 borde14 = new Borde1();
        addObject(borde14,204,67);
        borde14.setLocation(189,72);
        borde13.setLocation(193,131);
        bordepeque bordepeque = new bordepeque();
        addObject(bordepeque,267,407);
        bordepeque.setLocation(381,508);

        bordepeque.setLocation(240,222);
        bordepeque bordepeque2 = new bordepeque();
        addObject(bordepeque2,312,223);
        bordepeque2.setLocation(279,223);
        izquierda2.setLocation(11,63);

        bordepeque2.setLocation(275,222);
        borde13.setLocation(139,146);
        borde14.setLocation(172,72);
        borde13.setLocation(155,146);
        borde13.setLocation(164,144);
        BordeV bordeV5 = new BordeV();
        addObject(bordeV5,97,179);
        bordeV5.setLocation(91,169);
        bordepeque bordepeque3 = new bordepeque();
        addObject(bordepeque3,68,195);
        bordepeque3.setLocation(47,195);
        bordepeque3.setLocation(378,300);
        bordepeque3.setLocation(350,338);
        bordepeque3.setLocation(243,268);
        BordeV bordeV6 = new BordeV();
        addObject(bordeV6,92,198);
        bordeV6.setLocation(91,207);
        bordepeque bordepeque4 = new bordepeque();
        addObject(bordepeque4,56,232);
        bordepeque4.setLocation(25,234);
        bordepeque bordepeque5 = new bordepeque();
        addObject(bordepeque5,25,234);
        bordepeque5.setLocation(22,231);
        bordepeque4.setLocation(56,234);
        bordepeque5.setLocation(84,235);
        bordepeque5.setLocation(20,234);
        BordeV bordeV7 = new BordeV();
        addObject(bordeV7,310,200);
        BordeV bordeV8 = new BordeV();
        addObject(bordeV8,310,170);

        //------------
        bordepeque bordepeque6 = new bordepeque();
        addObject(bordepeque6,470,336);
        bordepeque bordepeque7 = new bordepeque();
        addObject(bordepeque7,413,336);

        //--------------
        bordepeque bordepeque8 = new bordepeque();
        addObject(bordepeque8,470,296);
        bordepeque bordepeque9 = new bordepeque();
        addObject(bordepeque9,434,296);

        //----------
        BordeV bordeV9 = new BordeV();
        addObject(bordeV9,376,360);
        BordeV bordeV10 = new BordeV();
        addObject(bordeV10,376,410);
        BordeV bordeV11 = new BordeV();
        addObject(bordeV11,376,460);

        //---------------
        Borde1 borde15 = new Borde1();
        addObject(borde15,95,465);
        bordepeque bordepeque10 = new bordepeque();
        addObject(bordepeque10,493,555);

        //--------
        bordepeque bordepeque11 = new bordepeque();
        addObject(bordepeque11,341,485);

        BordeV bordeV12 = new BordeV();
        addObject(bordeV12,169,598);
        bordeV12.setLocation(169,599);
        removeObject(bordeV12);

        //------
        BordeV bordeV13 = new BordeV();
        addObject(bordeV13,343,510);
        BordeV bordeV14 = new BordeV();
        addObject(bordeV14,343,530);

        //-----
        bordepeque bordepeque12 = new bordepeque();
        addObject(bordepeque12,400,620);
        //....
        BordeV bordeV15 = new BordeV();
        addObject(bordeV15,362,643);
        BordeV bordeV16 = new BordeV();
        addObject(bordeV16,362,670);

        //--------------
        BordeV bordeV17 = new BordeV();
        addObject(bordeV17,475,530);
        BordeV bordeV18 = new BordeV();
        addObject(bordeV18,461,473);
        bordeV18.setLocation(475,486);

        //----------
        bordepeque bordepeque13 = new bordepeque();
        addObject(bordepeque13,418,431);
        bordepeque13.setLocation(412,370);

        derecha.setLocation(524,187);
        //-.-----

        bordemas bordemas = new bordemas();
        addObject(bordemas,400,420);
        //---
        bordemas bordemas2 = new bordemas();
        addObject(bordemas2,455,515);

        //---------------------
        BordeV bordeV19 = new BordeV();
        addObject(bordeV19,119,650);
        BordeV bordeV20 = new BordeV();
        addObject(bordeV20,119,600);

        //-------------
        bordepeque bordepeque14 = new bordepeque();
        addObject(bordepeque14,155,575);
        bordepeque bordepeque15 = new bordepeque();
        addObject(bordepeque15,196,575);
        //-------------
        BordeV bordeV21 = new BordeV();
        addObject(bordeV21,150,553);
        BordeV bordeV22 = new BordeV();
        addObject(bordeV22,210,551);

        //----------
        bordepeque bordepeque16 = new bordepeque();
        addObject(bordepeque16,174,625);
        bordepeque16.setLocation(159,623);
        bordepeque bordepeque17 = new bordepeque();
        addObject(bordepeque17,196,623);

        //--------------
        Borde1 borde16 = new Borde1();
        addObject(borde16,95,400);

        //--------
        BordeVpeque bordeVpeque = new BordeVpeque();
        addObject(bordeVpeque,153,328);
        //.....
        BordeV bordeV23 = new BordeV();
        addObject(bordeV23,86,334);
        BordeV bordeV24 = new BordeV();
        addObject(bordeV24,86,378);
        //.....
        bordepeque bordepeque18 = new bordepeque();
        addObject(bordepeque18,188,346);
    }
}
