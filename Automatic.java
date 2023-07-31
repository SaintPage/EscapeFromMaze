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
    public int Lvl = 1;
    public Automatic(int lvl)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(536, 720, 1); 
        Lvl = lvl;
        prepare(lvl);
        addObject(new image(), 274, 372);
    }
    
    private int x = 5;
    private int y = 8;
    private int cx = 0;
    private int cy = 1 + Greenfoot.getRandomNumber(y - 2);
    private int[][] m = new int[x][y];
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    private void prepare(int lvl) {
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
        addObject(new Izquierda1(), 1, 200);
        addObject(new Derecha(), 720, 450);
        
        if (lvl >= 2){
     //   image image = new image();
       // addObject(image,90*Greenfoot.getRandomNumber(x) + 45,90*Greenfoot.getRandomNumber(y) + 45);
        food food = new food();
        addObject(food,44,197);
        food food2 = new food();
        addObject(food2,427,662);
        food food3 = new food();
        addObject(food3,58,426);
        food2.setLocation(462,669);
        removeObject(food2);
        food3.setLocation(73,448);
        removeObject(food3);
        food.setLocation(43,209);
        removeObject(food);
        addObject(food3,90*Greenfoot.getRandomNumber(x) + 45, 90*Greenfoot.getRandomNumber(y) + 45);
        food food4 = new food();
        addObject(food4,45+90*Greenfoot.getRandomNumber(x),90*Greenfoot.getRandomNumber(y) +45);
        food food5 = new food();
        addObject(food5,90*Greenfoot.getRandomNumber(x) + 45,45+90*Greenfoot.getRandomNumber(y));
    }
        addObject(new Jp(), 59, 90*cy +45);
        if (lvl >= 3){
        bot bot = new bot();
        addObject(bot, 90*(Greenfoot.getRandomNumber(x -2)+ 1) + 45,45+90*(Greenfoot.getRandomNumber(y-2) + 1));
    }
    if (lvl >= 4){
        bot bot2 = new bot();
        addObject(bot2, 90*(Greenfoot.getRandomNumber(x -2)+ 1) + 45,45+90*(Greenfoot.getRandomNumber(y-2) + 1));
    }
    
        for (int[] i: m) {
            for (int j: i){
                j = 0;
            }
        }
        
        NextWall(1);
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
                    
                    if (j == 0){
                        
                        int o = 45, p = 45, pr = 1, des = 0;
 //                       if ((m[k][l + 1] == 1 || m[k][l - 1] == 1) && !(m[k - 1][l] == 1 || m[k + 1][l] == 1)){
   //                         des = 1;
     //                   }
       //                 if (!(m[k][l + 1] == 1 || m[k][l - 1] == 1) && (m[k - 1][l] == 1 || m[k + 1][l] == 1)){
         //                   des = 0;
           //             }
                        //if ((m[k][l + 1] == 1 || m[k][l - 1] == 1) && (m[k - 1][l] == 1 || m[k + 1][l] == 1)){
                            des = Greenfoot.getRandomNumber(2);
             //           }
                        if (des == 1){
                        if (l + 1 < y){
                        if (m[k][l + 1] == 1){
                            p = 1*90; pr = 2;
                        }}
                        if (l - 1 >= 0){
                        if (m[k][l - 1] == 1){
                            p = 0; pr = 3;
                        }}
                        if (l - 1 >= 0 && l + 1 < y){
                        if (m[k][l + 1] == 1 && m[k][l - 1] == 1){
                            p = Greenfoot.getRandomNumber(2)*90;
                            pr = 2 + (p/90-1)*-1;
                        }}}
                        if (des == 0){
                        if (k + 1 < x){
                        if (m[k + 1][l] == 1){
                            o = 90; pr = 0;
                        }}
                        if (k - 1 >= 0){
                        if (m[k - 1][l] == 1){
                            o = 0; pr = 1;
                        }}
                        if (k - 1 >= 0 && k + 1 < x){
                        if (m[k - 1][l] == 1 && m[k + 1][l] == 1){
                            o = Greenfoot.getRandomNumber(2)*90;pr=(o/90-1)*-1;
                        }}}
                        if (!(o == 45 && p == 45)){
                        cx = k; cy = l;
                        //System.out.println(""+ cx + cy + pr);
                        
                        
                        removeObjects(getObjectsAt(90*(k)+o, 90*(l)+p, Pared.class));
                        NextWall(pr);
                        brk = true;
                        break;
                    }
                        
                    }
                    l ++;
                }
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
    private void NextWall(int prev){
        ;
        int[] moves = {0, 0, 0, 0};
        boolean keep = true;
        
        
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
