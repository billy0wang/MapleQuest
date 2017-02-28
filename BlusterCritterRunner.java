package Game;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.grid.BoundedGrid;

/**
 * Generated  by SaveWorld
 * By Eric Rosenberg and Steven Miller.
 */
public class BlusterCritterRunner{
	public static void main(String[] args){
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(10,10));
		Actor nActor0 = new info.gridworld.actor.Rock();
		nActor0.setColor(new Color(0,0,0));
		world.add(new Location(1, 1), nActor0);
		Actor nActor1 = new info.gridworld.actor.Rock();
		nActor1.setColor(new Color(0,0,0));
		world.add(new Location(1, 2), nActor1);
		Actor nActor2 = new info.gridworld.actor.Rock();
		nActor2.setColor(new Color(0,0,0));
		world.add(new Location(1, 3), nActor2);
		Actor nActor3 = new info.gridworld.actor.Rock();
		nActor3.setColor(new Color(0,0,0));
		world.add(new Location(1, 4), nActor3);
		Actor nActor4 = new info.gridworld.actor.Rock();
		nActor4.setColor(new Color(0,0,0));
		world.add(new Location(1, 5), nActor4);
		Actor nActor5 = new info.gridworld.actor.Rock();
		nActor5.setColor(new Color(0,0,0));
		world.add(new Location(1, 6), nActor5);
		Actor nActor6 = new info.gridworld.actor.Rock();
		nActor6.setColor(new Color(0,0,0));
		world.add(new Location(1, 7), nActor6);
		Actor nActor7 = new info.gridworld.actor.Rock();
		nActor7.setColor(new Color(0,0,0));
		world.add(new Location(2, 1), nActor7);
		Actor nActor8 = new info.gridworld.actor.Critter();
		nActor8.setColor(new Color(0,0,255));
		world.add(new Location(2, 2), nActor8);
		Actor nActor9 = new info.gridworld.actor.Critter();
		nActor9.setColor(new Color(0,0,255));
		world.add(new Location(2, 3), nActor9);
		Actor nActor10 = new info.gridworld.actor.Critter();
		nActor10.setColor(new Color(0,0,255));
		world.add(new Location(2, 4), nActor10);
		Actor nActor11 = new info.gridworld.actor.Critter();
		nActor11.setColor(new Color(0,0,255));
		world.add(new Location(2, 5), nActor11);
		Actor nActor12 = new info.gridworld.actor.Critter();
		nActor12.setColor(new Color(0,0,255));
		world.add(new Location(2, 6), nActor12);
		Actor nActor13 = new info.gridworld.actor.Rock();
		nActor13.setColor(new Color(0,0,0));
		world.add(new Location(2, 7), nActor13);
		Actor nActor14 = new info.gridworld.actor.Flower();
		nActor14.setColor(new Color(0,0,126));
		world.add(new Location(2, 8), nActor14);
		Actor nActor15 = new info.gridworld.actor.Rock();
		nActor15.setColor(new Color(0,0,0));
		world.add(new Location(3, 1), nActor15);
		Actor nActor16 = new info.gridworld.actor.Critter();
		nActor16.setColor(new Color(0,0,255));
		world.add(new Location(3, 2), nActor16);
		Actor nActor17 = new info.gridworld.actor.Critter();
		nActor17.setColor(new Color(0,0,255));
		world.add(new Location(3, 3), nActor17);
		Actor nActor18 = new info.gridworld.actor.Critter();
		nActor18.setColor(new Color(0,0,255));
		world.add(new Location(3, 4), nActor18);
		Actor nActor19 = new info.gridworld.actor.Critter();
		nActor19.setColor(new Color(0,0,255));
		world.add(new Location(3, 5), nActor19);
		Actor nActor20 = new info.gridworld.actor.Critter();
		nActor20.setColor(new Color(0,0,255));
		world.add(new Location(3, 6), nActor20);
		Actor nActor21 = new info.gridworld.actor.Rock();
		nActor21.setColor(new Color(108,237,168));
		world.add(new Location(3, 7), nActor21);
		Actor nActor22 = new info.gridworld.actor.Rock();
		nActor22.setColor(new Color(0,0,0));
		world.add(new Location(4, 1), nActor22);
		Actor nActor23 = new info.gridworld.actor.Critter();
		nActor23.setColor(new Color(0,0,255));
		world.add(new Location(4, 2), nActor23);
		Actor nActor24 = new info.gridworld.actor.Critter();
		nActor24.setColor(new Color(0,0,255));
		world.add(new Location(4, 3), nActor24);
		Actor nActor25 = new BlusterCritter(24);
		nActor25.setColor(new Color(255,255,255));
		world.add(new Location(4, 4), nActor25);
		Actor nActor26 = new info.gridworld.actor.Critter();
		nActor26.setColor(new Color(0,0,255));
		world.add(new Location(4, 5), nActor26);
		Actor nActor27 = new info.gridworld.actor.Critter();
		nActor27.setColor(new Color(0,0,255));
		world.add(new Location(4, 6), nActor27);
		Actor nActor28 = new info.gridworld.actor.Rock();
		nActor28.setColor(new Color(0,0,0));
		world.add(new Location(4, 7), nActor28);
		Actor nActor29 = new info.gridworld.actor.Rock();
		nActor29.setColor(new Color(0,0,0));
		world.add(new Location(5, 1), nActor29);
		Actor nActor30 = new info.gridworld.actor.Critter();
		nActor30.setColor(new Color(0,0,255));
		world.add(new Location(5, 2), nActor30);
		Actor nActor31 = new info.gridworld.actor.Critter();
		nActor31.setColor(new Color(0,0,255));
		world.add(new Location(5, 3), nActor31);
		Actor nActor32 = new info.gridworld.actor.Critter();
		nActor32.setColor(new Color(0,0,255));
		world.add(new Location(5, 4), nActor32);
		Actor nActor33 = new info.gridworld.actor.Critter();
		nActor33.setColor(new Color(0,0,255));
		world.add(new Location(5, 5), nActor33);
		Actor nActor34 = new info.gridworld.actor.Critter();
		nActor34.setColor(new Color(0,0,255));
		world.add(new Location(5, 6), nActor34);
		Actor nActor35 = new info.gridworld.actor.Rock();
		nActor35.setColor(new Color(0,0,0));
		world.add(new Location(5, 7), nActor35);
		Actor nActor36 = new info.gridworld.actor.Rock();
		nActor36.setColor(new Color(0,0,0));
		world.add(new Location(6, 1), nActor36);
		Actor nActor37 = new info.gridworld.actor.Critter();
		nActor37.setColor(new Color(0,0,255));
		world.add(new Location(6, 2), nActor37);
		Actor nActor38 = new info.gridworld.actor.Critter();
		nActor38.setColor(new Color(0,0,255));
		world.add(new Location(6, 3), nActor38);
		Actor nActor39 = new info.gridworld.actor.Critter();
		nActor39.setColor(new Color(0,0,255));
		world.add(new Location(6, 4), nActor39);
		Actor nActor40 = new info.gridworld.actor.Critter();
		nActor40.setColor(new Color(0,0,255));
		world.add(new Location(6, 5), nActor40);
		Actor nActor41 = new info.gridworld.actor.Critter();
		nActor41.setColor(new Color(0,0,255));
		world.add(new Location(6, 6), nActor41);
		Actor nActor42 = new info.gridworld.actor.Rock();
		nActor42.setColor(new Color(0,0,0));
		world.add(new Location(6, 7), nActor42);
		Actor nActor43 = new info.gridworld.actor.Rock();
		nActor43.setColor(new Color(0,0,0));
		world.add(new Location(7, 1), nActor43);
		Actor nActor44 = new info.gridworld.actor.Rock();
		nActor44.setColor(new Color(0,0,0));
		world.add(new Location(7, 2), nActor44);
		Actor nActor45 = new info.gridworld.actor.Rock();
		nActor45.setColor(new Color(0,0,0));
		world.add(new Location(7, 3), nActor45);
		Actor nActor46 = new info.gridworld.actor.Rock();
		nActor46.setColor(new Color(0,0,0));
		world.add(new Location(7, 4), nActor46);
		Actor nActor47 = new info.gridworld.actor.Rock();
		nActor47.setColor(new Color(0,0,0));
		world.add(new Location(7, 5), nActor47);
		Actor nActor48 = new info.gridworld.actor.Rock();
		nActor48.setColor(new Color(0,0,0));
		world.add(new Location(7, 6), nActor48);
		Actor nActor49 = new info.gridworld.actor.Rock();
		nActor49.setColor(new Color(0,0,0));
		world.add(new Location(7, 7), nActor49);
		Actor nActor50 = new info.gridworld.actor.Rock();
		nActor50.setColor(new Color(0,0,0));
		world.add(new Location(7, 8), nActor50);
		Actor nActor51 = new info.gridworld.actor.Rock();
		nActor51.setColor(new Color(0,0,0));
		world.add(new Location(8, 4), nActor51);

		world.show();
	}
}
