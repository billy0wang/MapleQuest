package Game;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;
//Billy Wang & Marc Eastman & Stephen Lee
//Checked by Ben Epstein

public class JumperRunner2
{
    public static void main(String[] args)
    {
    	 ActorWorld world = new ActorWorld();
    	 
    	 Bug mosquito= new Bug();
    	 mosquito.setDirection(90);
    	 world.add(new Location(2,0), mosquito);
    	 Jumper parachute= new Jumper();
    	 world.add(new Location(2,1), parachute);
    	 parachute.setDirection(-90);
    	 Jumper squirrel= new Jumper();
    	 world.add(new Location(1,4), squirrel);
    	 squirrel.setDirection(180);
    	 Jumper barryAlan= new Jumper();
    	 world.add(new Location(2,4), barryAlan);
    	 Jumper wallyWest=new Jumper();
    	 world.add(new Location(2,8), wallyWest);
    	 wallyWest.setDirection(180);
    	 Jumper bartAlan= new Jumper();
    	 world.add(new Location(4,8), bartAlan);
    	 Jumper gwenStacey= new Jumper();
    	 world.add(new Location(8,3), gwenStacey);
    	 Jumper mJ= new Jumper();
    	 world.add(new Location(6,7), mJ);
    	 mJ.setDirection(180);
    	 Jumper blakeGriffon=new Jumper();
    	 world.add(new Location(8,6), blakeGriffon);
    	 Bug mansquito= new Bug();
    	 world.add(new Location(5,3), mansquito);
    	 mansquito.setDirection(180);
    	 Bug dannyPhantom= new Bug();
    	 world.add(new Location(6,6), dannyPhantom);
    	 dannyPhantom.setDirection(180);
    	 Bug popEyes= new Bug();
    	 world.add(new Location(8,7), popEyes);
    	 
    	 
    	 
    	 
    	 world.show();
    	 
    }
    
    
    
}