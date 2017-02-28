package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;



//Billy Wang & Marc Eastman & Stephen Lee
// Checked By : Ankit
/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //Jumper bob = new Jumper();
        //Jumper coray= new Jumper(Color.CYAN);
        Jumper rachelBilson= new Jumper(Color.orange);
        Jumper robertDowneyJr= new Jumper(Color.green);
        Jumper peterParker=new Jumper();
        Jumper leodeCaps= new Jumper();
        Jumper meganFox= new Jumper();
        Jumper hopedwarz= new Jumper();
        Jumper emmaStone=new Jumper();
        Jumper emmaWatson=new Jumper();
        Jumper morganFrees=new Jumper();
        Jumper jonahHill=new Jumper();
        Jumper sethRogan=new Jumper();
        Jumper prezObama=new Jumper();
        Jumper shiaLabeouf=new Jumper();
        Jumper jeromayLin=new Jumper();
        
        Rock dwayne=new Rock();
        Rock lebron= new Rock();
        Rock shwarzinager=new Rock();
        Rock shaque= new Rock();
        
        Flower oliviaWilde= new Flower();
        Flower kateUpton= new Flower();
        Flower shakira= new Flower();
        Flower sophVergara=new Flower();
        
        rachelBilson.setDirection(-90);
        robertDowneyJr.setDirection(-90);
        meganFox.setDirection(90);
        hopedwarz.setDirection(90);
        emmaStone.setDirection(90);
        emmaWatson.setDirection(90);
        morganFrees.setDirection(90);
        shiaLabeouf.setDirection(180);
        jeromayLin.setDirection(180);
       // Rock geodude= new Rock();
       // Flower marc = new Flower(Color.magenta);
        Actor jamesFranco= new Actor();
        //coray.setDirection(180);
        //world.add(new Location(5, 5), bob);
       // world.add(new Location(3,5), coray);
        world.add(new Location(1,1), rachelBilson);
        world.add(new Location(2,0),robertDowneyJr);
        //world.add(new Location(6,5), geodude);
        //world.add(new Location(8,5), marc);
        world.add(new Location(9,4), jamesFranco);
        world.add(new Location(0,5), peterParker);
        world.add(new Location(1,6), leodeCaps);
        world.add(new Location(0,8), meganFox);
        world.add(new Location(1,9), hopedwarz);
        world.add(new Location(4,0), emmaStone);
        world.add(new Location(5,0), emmaWatson);
        world.add(new Location (3,0), morganFrees);
        world.add(new Location(9,2), jonahHill);
        world.add(new Location(9,3), sethRogan);
        world.add(new Location(9,4), prezObama);
        world.add(new Location(9,7), shiaLabeouf);
        world.add(new Location(8,8), jeromayLin);
        world.add(new Location(7,3), dwayne);
        world.add(new Location(8,2), lebron);
        world.add(new Location(7,4), shwarzinager);
        world.add(new Location(8,4), shaque);
        
        world.add(new Location(3,1), oliviaWilde);
        world.add(new Location(4,2), kateUpton);
        world.add(new Location(5,1), shakira);
        world.add(new Location(5,2), sophVergara);
        world.show();
    }
} 
 
