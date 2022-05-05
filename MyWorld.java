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
        super(600, 400, 1); 
        Frog f = new Frog();
        addObject(f,300, 200);
        
        spawnPizza();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void spawnPizza()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Pizza pizza = new Pizza();
        addObject(pizza,x, y);
    }  
    
    public void spawnFries()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Fries fries = new Fries();
        addObject(fries, x, y);
    }
}
