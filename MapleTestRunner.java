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
public class MapleTestRunner{
	public static void main(String[] args){
		KeyWorld world = new KeyWorld(new BoundedGrid<Actor>(8,30));
		Actor nActor0 = new Fighter();
		nActor0.setColor(null);
		world.add(new Location(6, 2), nActor0);
		Actor nActor1 = new Ninja();
		nActor1.setColor(null);
		world.add(new Location(6, 5), nActor1);
		Actor nActor2 = new Ninja();
		nActor2.setColor(null);
		world.add(new Location(6, 8), nActor2);
		Actor nActor3 = new Ninja();
		nActor3.setColor(null);
		world.add(new Location(6, 11), nActor3);
		Actor nActor4 = new BossReg();
		nActor4.setColor(null);
		world.add(new Location(6, 14), nActor4);
		Actor nActor5 = new SummerGround();
		nActor5.setColor(null);
		world.add(new Location(7, 1), nActor5);
		Actor nActor6 = new SummerGround();
		nActor6.setColor(null);
		world.add(new Location(7, 2), nActor6);
		Actor nActor7 = new SummerGround();
		nActor7.setColor(null);
		world.add(new Location(7, 3), nActor7);
		Actor nActor8 = new SummerGround();
		nActor8.setColor(null);
		world.add(new Location(7, 4), nActor8);
		Actor nActor9 = new SummerGround();
		nActor9.setColor(null);
		world.add(new Location(7, 5), nActor9);
		Actor nActor10 = new SummerGround();
		nActor10.setColor(null);
		world.add(new Location(7, 6), nActor10);
		Actor nActor11 = new SummerGround();
		nActor11.setColor(null);
		world.add(new Location(7, 7), nActor11);
		Actor nActor12 = new SummerGround();
		nActor12.setColor(null);
		world.add(new Location(7, 8), nActor12);
		Actor nActor13 = new SummerGround();
		nActor13.setColor(null);
		world.add(new Location(7, 9), nActor13);
		Actor nActor14 = new SummerGround();
		nActor14.setColor(null);
		world.add(new Location(7, 10), nActor14);
		Actor nActor15 = new SummerGround();
		nActor15.setColor(null);
		world.add(new Location(7, 11), nActor15);
		Actor nActor16 = new SummerGround();
		nActor16.setColor(null);
		world.add(new Location(7, 12), nActor16);
		Actor nActor17 = new SummerGround();
		nActor17.setColor(null);
		world.add(new Location(7, 13), nActor17);
		Actor nActor18 = new SummerGround();
		nActor18.setColor(null);
		world.add(new Location(7, 14), nActor18);

		world.show();
	}
}
