import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobil mobil = new mobil();
        addObject(mobil,61,279);
        buah buah = new buah();
        addObject(buah,269,201);
        buah buah2 = new buah();
        addObject(buah2,390,340);
        buah buah3 = new buah();
        addObject(buah3,418,51);
        buah buah4 = new buah();
        addObject(buah4,114,124);
        buah buah5 = new buah();
        addObject(buah5,619,219);
        buah buah6 = new buah();
        addObject(buah6,736,72);
        buah buah7 = new buah();
        addObject(buah7,76,487);
        buah buah8 = new buah();
        addObject(buah8,292,473);
        buah buah9 = new buah();
        addObject(buah9,526,271);
        buah buah10 = new buah();
        addObject(buah10,732,539);
        buah buah11 = new buah();
        addObject(buah11,539,434);
        rock rock = new rock();
        addObject(rock,269,148);
        rock rock2 = new rock();
        addObject(rock2,437,205);
        rock rock3 = new rock();
        addObject(rock3,595,87);
        rock rock4 = new rock();
        addObject(rock4,245,360);
        rock rock5 = new rock();
        addObject(rock5,460,439);
        rock rock6 = new rock();
        addObject(rock6,679,359);
    }
}
