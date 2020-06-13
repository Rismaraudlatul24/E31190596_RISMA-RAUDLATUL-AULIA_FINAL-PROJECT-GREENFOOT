import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobil extends Actor
{
    /**
     * Act - do whatever the mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 0;
    public int belok = 0;
    public void act() 
    {
        getWorld().showText("Score = "+score,60,30);
        KontrolKeyboard();
        Ambil();
        hitrock();
    } 
    
    public void KontrolKeyboard()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            belok+=2;
            setRotation(belok);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            belok-=2;
            setRotation(belok);
        }
    }
    
    public void Ambil()
    {
        if(isTouching(buah.class))
        {
            removeTouching(buah.class);
             score = score + 1;
        }
    }
    
    public void hitrock()
    {
        
        Actor rock = getOneIntersectingObject(rock.class);
        if (rock != null)
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            myWorld.removeObject(this);
        }
}
}
