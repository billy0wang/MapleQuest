package Game;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;
import info.gridworld.grid.BoundedGrid;

/**
 * Generated  by SaveWorld
 * By Eric Rosenberg and Steven Miller.
 */

//Billy Wang 
// PD 4 Comp Sci
public class BreedingAndDyingActorRunner{
	public static void main(String[] args){
		ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
		Actor nActor0 = new info.gridworld.actor.Rock();
		nActor0.setColor(new Color(0,0,0));
		world.add(new Location(0, 2), nActor0);
		Actor nActor1 = new info.gridworld.actor.Rock();
		nActor1.setColor(new Color(0,0,0));
		world.add(new Location(0, 6), nActor1);
		Actor nActor2 = new BreedingAndDyingActor(1,0,0,null);
		nActor2.setColor(new Color(245,214,6));
		world.add(new Location(0, 8), nActor2);
		Actor nActor3 = new info.gridworld.actor.Rock();
		nActor3.setColor(new Color(0,0,0));
		world.add(new Location(0, 10), nActor3);
		Actor nActor4 = new info.gridworld.actor.Rock();
		nActor4.setColor(new Color(0,0,0));
		world.add(new Location(1, 2), nActor4);
		Actor nActor5 = new info.gridworld.actor.Rock();
		nActor5.setColor(new Color(0,0,0));
		world.add(new Location(1, 6), nActor5);
		Actor nActor6 = new info.gridworld.actor.Rock();
		nActor6.setColor(new Color(0,0,0));
		world.add(new Location(1, 10), nActor6);
		Actor nActor7 = new info.gridworld.actor.Rock();
		nActor7.setColor(new Color(0,0,0));
		world.add(new Location(1, 13), nActor7);
		Actor nActor8 = new info.gridworld.actor.Rock();
		nActor8.setColor(new Color(0,0,0));
		world.add(new Location(1, 14), nActor8);
		Actor nActor9 = new info.gridworld.actor.Rock();
		nActor9.setColor(new Color(0,0,0));
		world.add(new Location(1, 15), nActor9);
		Actor nActor10 = new info.gridworld.actor.Actor();
		nActor10.setColor(new Color(0,0,255));
		world.add(new Location(2, 2), nActor10);
		Actor nActor11 = new info.gridworld.actor.Rock();
		nActor11.setColor(new Color(0,0,0));
		world.add(new Location(2, 3), nActor11);
		Actor nActor12 = new info.gridworld.actor.Rock();
		nActor12.setColor(new Color(0,0,0));
		world.add(new Location(2, 4), nActor12);
		Actor nActor13 = new info.gridworld.actor.Rock();
		nActor13.setColor(new Color(0,0,0));
		world.add(new Location(2, 5), nActor13);
		Actor nActor14 = new info.gridworld.actor.Rock();
		nActor14.setColor(new Color(0,0,0));
		world.add(new Location(2, 6), nActor14);
		Actor nActor15 = new info.gridworld.actor.Rock();
		nActor15.setColor(new Color(0,0,0));
		world.add(new Location(2, 7), nActor15);
		Actor nActor16 = new info.gridworld.actor.Rock();
		nActor16.setColor(new Color(0,0,0));
		world.add(new Location(2, 8), nActor16);
		Actor nActor17 = new info.gridworld.actor.Rock();
		nActor17.setColor(new Color(0,0,0));
		world.add(new Location(2, 9), nActor17);
		Actor nActor18 = new info.gridworld.actor.Rock();
		nActor18.setColor(new Color(0,0,0));
		world.add(new Location(2, 10), nActor18);
		Actor nActor19 = new info.gridworld.actor.Rock();
		nActor19.setColor(new Color(0,0,0));
		world.add(new Location(2, 13), nActor19);
		Actor nActor20 = new BreedingAndDyingActor(1,0,0,null);
		nActor20.setColor(new Color(0,0,255));
		world.add(new Location(2, 14), nActor20);
		Actor nActor21 = new info.gridworld.actor.Rock();
		nActor21.setColor(new Color(0,0,0));
		world.add(new Location(2, 15), nActor21);
		Actor nActor22 = new info.gridworld.actor.Actor();
		nActor22.setColor(new Color(0,0,255));
		world.add(new Location(3, 2), nActor22);
		Actor nActor23 = new info.gridworld.actor.Rock();
		nActor23.setColor(new Color(0,0,0));
		world.add(new Location(3, 6), nActor23);
		Actor nActor24 = new info.gridworld.actor.Rock();
		nActor24.setColor(new Color(0,0,0));
		world.add(new Location(3, 13), nActor24);
		Actor nActor25 = new info.gridworld.actor.Rock();
		nActor25.setColor(new Color(0,0,0));
		world.add(new Location(3, 14), nActor25);
		Actor nActor26 = new info.gridworld.actor.Rock();
		nActor26.setColor(new Color(0,0,0));
		world.add(new Location(3, 15), nActor26);
		Actor nActor27 = new BreedingAndDyingActor(Color.DARK_GRAY);
		nActor27.setColor(new Color(128,128,128));
		world.add(new Location(4, 0), nActor27);
		Actor nActor28 = new info.gridworld.actor.Rock();
		nActor28.setColor(new Color(0,0,0));
		world.add(new Location(4, 2), nActor28);
		Actor nActor29 = new BreedingAndDyingActor(1,0,0,null);
		nActor29.setColor(new Color(0,0,0));
		world.add(new Location(4, 4), nActor29);
		Actor nActor30 = new info.gridworld.actor.Rock();
		nActor30.setColor(new Color(0,0,0));
		world.add(new Location(4, 6), nActor30);
		Actor nActor31 = new info.gridworld.actor.Rock();
		nActor31.setColor(new Color(0,0,0));
		world.add(new Location(5, 0), nActor31);
		Actor nActor32 = new info.gridworld.actor.Rock();
		nActor32.setColor(new Color(0,0,0));
		world.add(new Location(5, 1), nActor32);
		Actor nActor33 = new info.gridworld.actor.Rock();
		nActor33.setColor(new Color(0,0,0));
		world.add(new Location(5, 2), nActor33);
		Actor nActor34 = new info.gridworld.actor.Rock();
		nActor34.setColor(new Color(0,0,0));
		world.add(new Location(5, 6), nActor34);
		Actor nActor35 = new info.gridworld.actor.Rock();
		nActor35.setColor(new Color(0,0,0));
		world.add(new Location(6, 2), nActor35);
		Actor nActor36 = new info.gridworld.actor.Rock();
		nActor36.setColor(new Color(0,0,0));
		world.add(new Location(6, 3), nActor36);
		Actor nActor37 = new info.gridworld.actor.Rock();
		nActor37.setColor(new Color(0,0,0));
		world.add(new Location(6, 4), nActor37);
		Actor nActor38 = new info.gridworld.actor.Rock();
		nActor38.setColor(new Color(0,0,0));
		world.add(new Location(6, 5), nActor38);
		Actor nActor39 = new info.gridworld.actor.Rock();
		nActor39.setColor(new Color(0,0,0));
		world.add(new Location(6, 6), nActor39);
		Actor nActor40 = new info.gridworld.actor.Rock();
		nActor40.setColor(new Color(0,0,0));
		world.add(new Location(6, 10), nActor40);
		Actor nActor41 = new info.gridworld.actor.Rock();
		nActor41.setColor(new Color(0,0,0));
		world.add(new Location(6, 11), nActor41);
		Actor nActor42 = new info.gridworld.actor.Rock();
		nActor42.setColor(new Color(0,0,0));
		world.add(new Location(6, 12), nActor42);
		Actor nActor43 = new info.gridworld.actor.Rock();
		nActor43.setColor(new Color(0,0,0));
		world.add(new Location(6, 13), nActor43);
		Actor nActor44 = new info.gridworld.actor.Rock();
		nActor44.setColor(new Color(0,0,0));
		world.add(new Location(6, 14), nActor44);
		Actor nActor45 = new info.gridworld.actor.Rock();
		nActor45.setColor(new Color(0,0,0));
		world.add(new Location(6, 15), nActor45);
		Actor nActor46 = new info.gridworld.actor.Rock();
		nActor46.setColor(new Color(0,0,0));
		world.add(new Location(7, 10), nActor46);
		Actor nActor47 = new info.gridworld.actor.Rock();
		nActor47.setColor(new Color(0,0,0));
		world.add(new Location(7, 15), nActor47);
		Actor nActor48 = new info.gridworld.actor.Rock();
		nActor48.setColor(new Color(0,0,0));
		world.add(new Location(8, 10), nActor48);
		Actor nActor49 = new BreedingAndDyingActor(1,0,0,null);
		nActor49.setColor(new Color(255,0,255));
		world.add(new Location(8, 12), nActor49);
		Actor nActor50 = new BreedingAndDyingActor(1,0,0,null);
		nActor50.setColor(new Color(255,200,0));
		world.add(new Location(8, 13), nActor50);
		Actor nActor51 = new info.gridworld.actor.Rock();
		nActor51.setColor(new Color(0,0,0));
		world.add(new Location(8, 15), nActor51);
		Actor nActor52 = new info.gridworld.actor.Rock();
		nActor52.setColor(new Color(0,0,0));
		world.add(new Location(9, 4), nActor52);
		Actor nActor53 = new info.gridworld.actor.Rock();
		nActor53.setColor(new Color(0,0,0));
		world.add(new Location(9, 5), nActor53);
		Actor nActor54 = new info.gridworld.actor.Rock();
		nActor54.setColor(new Color(0,0,0));
		world.add(new Location(9, 6), nActor54);
		Actor nActor55 = new info.gridworld.actor.Rock();
		nActor55.setColor(new Color(0,0,0));
		world.add(new Location(9, 7), nActor55);
		Actor nActor56 = new info.gridworld.actor.Rock();
		nActor56.setColor(new Color(0,0,0));
		world.add(new Location(9, 8), nActor56);
		Actor nActor57 = new info.gridworld.actor.Rock();
		nActor57.setColor(new Color(0,0,0));
		world.add(new Location(9, 10), nActor57);
		Actor nActor58 = new info.gridworld.actor.Rock();
		nActor58.setColor(new Color(0,0,0));
		world.add(new Location(9, 15), nActor58);
		Actor nActor59 = new info.gridworld.actor.Rock();
		nActor59.setColor(new Color(0,0,0));
		world.add(new Location(10, 0), nActor59);
		Actor nActor60 = new info.gridworld.actor.Rock();
		nActor60.setColor(new Color(0,0,0));
		world.add(new Location(10, 1), nActor60);
		Actor nActor62 = new info.gridworld.actor.Rock();
		nActor62.setColor(new Color(0,0,0));
		world.add(new Location(10, 4), nActor62);
		Actor nActor63 = new info.gridworld.actor.Rock();
		nActor63.setColor(new Color(0,0,0));
		world.add(new Location(10, 8), nActor63);
		Actor nActor64 = new info.gridworld.actor.Rock();
		nActor64.setColor(new Color(0,0,0));
		world.add(new Location(10, 10), nActor64);
		Actor nActor65 = new info.gridworld.actor.Rock();
		nActor65.setColor(new Color(0,0,0));
		world.add(new Location(10, 11), nActor65);
		Actor nActor66 = new info.gridworld.actor.Rock();
		nActor66.setColor(new Color(0,0,0));
		world.add(new Location(10, 12), nActor66);
		Actor nActor67 = new info.gridworld.actor.Rock();
		nActor67.setColor(new Color(0,0,0));
		world.add(new Location(10, 13), nActor67);
		Actor nActor68 = new info.gridworld.actor.Rock();
		nActor68.setColor(new Color(0,0,0));
		world.add(new Location(10, 14), nActor68);
		Actor nActor69 = new info.gridworld.actor.Rock();
		nActor69.setColor(new Color(0,0,0));
		world.add(new Location(10, 15), nActor69);
		Actor nActor70 = new info.gridworld.actor.Rock();
		nActor70.setColor(new Color(0,0,0));
		world.add(new Location(11, 1), nActor70);
		Actor nActor71 = new info.gridworld.actor.Rock();
		nActor71.setColor(new Color(0,0,0));
		world.add(new Location(11, 4), nActor71);
		Actor nActor72 = new BreedingAndDyingActor(1,1,0,Color.green);
		nActor72.setColor(new Color(0,255,0));
		world.add(new Location(11, 6), nActor72);
		Actor nActor73 = new info.gridworld.actor.Rock();
		nActor73.setColor(new Color(0,0,0));
		world.add(new Location(11, 8), nActor73);
		Actor nActor74 = new BreedingAndDyingActor(1,0,0,null);
		nActor74.setColor(new Color(255,0,0));
		world.add(new Location(12, 0), nActor74);
		Actor nActor75 = new info.gridworld.actor.Rock();
		nActor75.setColor(new Color(0,0,0));
		world.add(new Location(12, 1), nActor75);
		Actor nActor76 = new info.gridworld.actor.Rock();
		nActor76.setColor(new Color(0,0,0));
		world.add(new Location(12, 4), nActor76);
		Actor nActor77 = new info.gridworld.actor.Rock();
		nActor77.setColor(new Color(0,0,0));
		world.add(new Location(12, 8), nActor77);
		Actor nActor78 = new info.gridworld.actor.Rock();
		nActor78.setColor(new Color(0,0,0));
		world.add(new Location(13, 1), nActor78);
		Actor nActor79 = new info.gridworld.actor.Rock();
		nActor79.setColor(new Color(0,0,0));
		world.add(new Location(13, 4), nActor79);
		Actor nActor80 = new info.gridworld.actor.Rock();
		nActor80.setColor(new Color(0,0,0));
		world.add(new Location(13, 5), nActor80);
		Actor nActor81 = new info.gridworld.actor.Rock();
		nActor81.setColor(new Color(0,0,0));
		world.add(new Location(13, 6), nActor81);
		Actor nActor82 = new info.gridworld.actor.Rock();
		nActor82.setColor(new Color(0,0,0));
		world.add(new Location(13, 7), nActor82);
		Actor nActor83 = new info.gridworld.actor.Rock();
		nActor83.setColor(new Color(0,0,0));
		world.add(new Location(13, 8), nActor83);
		Actor nActor84 = new info.gridworld.actor.Rock();
		nActor84.setColor(new Color(0,0,0));
		world.add(new Location(14, 0), nActor84);
		Actor nActor85 = new info.gridworld.actor.Rock();
		nActor85.setColor(new Color(0,0,0));
		world.add(new Location(14, 1), nActor85);
		Actor nActor87 = new BreedingAndDyingActor(0,0,0,Color.cyan);
		nActor87.setColor(new Color(0,255,255));
		world.add(new Location(14, 13), nActor87);
		Actor nActor88 = new info.gridworld.actor.Actor();
		nActor88.setColor(new Color(0,0,255));
		world.add(new Location(15, 5), nActor88);
		Actor nActor89 = new info.gridworld.actor.Actor();
		nActor89.setColor(new Color(0,0,255));
		world.add(new Location(15, 6), nActor89);
		Actor nActor90 = new info.gridworld.actor.Actor();
		nActor90.setColor(new Color(0,0,255));
		world.add(new Location(15, 7), nActor90);
		Actor nActor91 = new info.gridworld.actor.Actor();
		nActor91.setColor(new Color(0,0,255));
		world.add(new Location(15, 8), nActor91);
		Actor nActor92 = new info.gridworld.actor.Actor();
		nActor92.setColor(new Color(0,0,255));
		world.add(new Location(15, 9), nActor92);
		Actor nActor93 = new info.gridworld.actor.Actor();
		nActor93.setColor(new Color(0,0,255));
		world.add(new Location(15, 10), nActor93);
		Actor nActor94 = new info.gridworld.actor.Actor();
		nActor94.setColor(new Color(0,0,255));
		world.add(new Location(16, 5), nActor94);
		Actor nActor95 = new info.gridworld.actor.Actor();
		nActor95.setColor(new Color(0,0,255));
		world.add(new Location(16, 10), nActor95);
		Actor nActor96 = new info.gridworld.actor.Actor();
		nActor96.setColor(new Color(0,0,255));
		world.add(new Location(17, 5), nActor96);
		Actor nActor97 = new info.gridworld.actor.Actor();
		nActor97.setColor(new Color(0,0,255));
		world.add(new Location(17, 10), nActor97);
		Actor nActor98 = new info.gridworld.actor.Actor();
		nActor98.setColor(new Color(0,0,255));
		world.add(new Location(18, 5), nActor98);
		Actor nActor99 = new BreedingAndDyingActor(Color.cyan);
		nActor99.setColor(new Color(6,197,224));
		world.add(new Location(18, 7), nActor99);
		Actor nActor100 = new info.gridworld.actor.Actor();
		nActor100.setColor(new Color(0,0,255));
		world.add(new Location(18, 10), nActor100);

		world.show();
	}
}