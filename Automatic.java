import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Automatic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Automatic extends World
{

    /**
     * Constructor for objects of class Automatic.
     * 
     */
    public Automatic()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(535, 720, 1); 
        prepare();
    }
    private int x = 5;
    private int y = 8;
    private int cx = 0;
    private int cy = 1 + Greenfoot.getRandomNumber(y - 2);
    private int[][] m = new int[x][y];
    
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
        
        addObject(new Jp(), 59, 90*cy +45);
        
        for (int[] i: m) {
            for (int j: i){
                j = 0;
            }
        }
        
        NextWall();
        addObject(new win(), 90*cx +45, 90*cy +45);
        
        while (true) {
            int k =0, l =0;
            boolean brk = false, stop = false;
            for (int[] i:m){
                l = 0;
                for (int j:i){
                  //  if (l == y - 1){
                    //    break;
                    //}
                    if (l+1 < y && k +1 < x && l - 1 >= 0 && k - 1>= 0){
                    if (j == 0 && (m[k][l + 1] == 1 || m[k][l - 1] == 1 || m[k +1][l] == 1 || m[k - 1][l + 1] == 1)){
                        
                        int o = 0, p = 0;
                        cx = k; cy = l;
                        if (l + 1 < y){
                        if (m[k][l + 1] == 1){
                            p = 1;
                        }}
                        if (l - 1 >= 0){
                        if (m[k][l - 1] == 1){
                            p = 0;
                        }}
                        if (l - 1 >= 0 && l + 1 < y){
                        if (m[k][l + 1] == 1 && m[k][l - 1] == 1){
                            p = Greenfoot.getRandomNumber(2);
                        }}
                        if (k + 1 < x){
                        if (m[k + 1][l] == 1){
                            o = 1;
                        }}
                        if (k - 1 >= 0){
                        if (m[k - 1][l] == 1){
                            o = 0;
                        }}
                        if (k - 1 >= 0 && k + 1 < x){
                        if (m[k - 1][l] == 1 && m[k + 1][l] == 1){
                            o = Greenfoot.getRandomNumber(2);
                        }}
                        removeObjects(getObjectsAt(90*o, 90*p, Pared.class));
                        NextWall();
                        brk = true;
                        break;
                    }
                    l ++;
                }}
                if (brk){
                    break;
                }
                k ++;
                
            }
            if (k == x){
                break;
            }
        }
        win victory = getObjects(win.class).get(0);
        victory.getImage().setTransparency(255);
    }
    private void NextWall(){
        ;
        int[] moves = {0, 0, 0, 0};
        boolean keep = true;
        int prev = 1;
        
        do {
            m[cx][cy] = 1;
           // System.out.println(""+ cx +cy);
        if (cx > 0) {if (m[cx - 1][cy] == 0){
            moves[0] = 1;
        }}
        if (cx < x - 1) {if (m[cx + 1][cy] == 0){
            moves[1] = 1;
        }}
        if (cy > 0) {if(m[cx][cy - 1] == 0){
            moves[2] = 1;
        }}
        if (cy < y - 1) {if (m[cx][cy + 1] == 0){
            moves[3] = 1;
        }}
        
        int random = Greenfoot.getRandomNumber(4);
        
        if (moves[0] == 0 && moves[1] == 0 && moves[2] == 0 && moves[3] == 0){
            keep = false;
        }
        if (keep) {
        while (moves[random] == 0){
            random = Greenfoot.getRandomNumber(4);
        }
        build(prev, cx, cy, random);
        switch (random){
            case 0:
                cx -= 1;
               // addObject(new bordepeque(), 107*(cx+1), 90*(cy+1));
               prev = 0;
                break;
            case 1:
                cx += 1;
                prev = 1;
               // addObject(new Borde1(), 107*(cx+1), 90*(cy+1));
                break;
            case 2:
                cy -= 1;
                prev = 2;
                //addObject(new BordeVpeque(), 107*(cx+1), 90*(cy+1));
                break;
            case 3:
                cy += 1;
                prev = 3;
               // addObject(new BordeV(), 107*(cx+1), 90*(cy+1));
                break;
            default:
                prev = 0;
        }
        
    } 
        moves[0] = 0; moves[1] = 0; moves[2] = 0; moves[3] = 0;
        } while (keep);
        
    }
    private void build(int prev, int xx, int yy, int r){
        
            if ((r == 1 || r == 0) && (prev == 1 || prev == 0)) {
                addObject(new bordepeque(), 90*xx + 45, 90*yy);
                addObject(new bordepeque(), 90*xx + 45, 90*(yy+1));
            }
            if ((r == 2 || r == 3) && (prev == 2 || prev == 3)) {
                addObject(new BordeV(), 90*xx, 90*yy+45);
                addObject(new BordeV(), 90*(xx+1), 90*yy+45);
            }
            if ((prev == 1 && r == 2) || (prev == 3 && r == 0)){
                addObject(new BordeV(), 90*(xx+1), 90*yy+45);
                addObject(new bordepeque(), 90*xx + 45, 90*(yy+1));
            }
            if ((prev == 1 && r == 3) || (prev == 2 && r == 0)){
                addObject(new BordeV(), 90*(xx+1), 90*yy+45);
                addObject(new bordepeque(), 90*xx + 45, 90*(yy));
            }
            if ((prev == 0 && r == 2) || (prev == 3 && r == 1)){
                addObject(new BordeV(), 90*xx, 90*yy+45);
                addObject(new bordepeque(), 90*xx + 45, 90*(yy+1));
            }
            if ((prev == 0 && r == 3) || (prev == 2 && r == 1)){
                addObject(new BordeV(), 90*xx, 90*yy+45);
                addObject(new bordepeque(), 90*xx + 45, 90*(yy));
            }
    }
}
