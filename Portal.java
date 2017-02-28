package Game;




import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.gui.WorldFrame;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Portal extends Actor
{
	private int stage;
	private ActorWorld world;
	public Portal()
	{
		stage=1;
	}
	public Portal(int s)
	{
		stage=s;
	}
	public void act()
	{
		setColor(Color.GREEN);
		changeStage();
	}

	
	public void changeStage()
	{
		Grid<Actor> gr= getGrid();
		Location loc=getLocation();
		Location incoming= loc.getAdjacentLocation(-90);
		Location onTop= loc.getAdjacentLocation(0);
		ArrayList temp = gr.getOccupiedLocations();
		if(gr.get(incoming) instanceof WalkingFighterStance2
				|| gr.get(onTop)instanceof Fighter)
		{
			stage++;
			for (int i=0; i<temp.size(); i++)
			{
				Location los = (Location)temp.get(i);
				Actor stuff= gr.get(los);
				if(!(stuff instanceof Portal))
				{
					stuff.removeSelfFromGrid();

				}

			} 
			//JOptionPane.showMessageDialog(null, "You've made it to Level " +stage);
			
			loadStage(stage);
			

		}

	}
	public void loadStage(int stage)
	{
		
		switch (stage)
		{
		case 2:
			level2(); 
			break;
		case 3:
			level3();
			break;
		case 4:
			level4();
			break;
		case 5:
			level5();
			break;
		}
	}
	

	public void level2()
	{

		KeyWorld world= new KeyWorld();
		Grid<Actor> gr= getGrid();		
		moveTo(new Location(2,17)); //2 , 17
		CloudHeadQuarters hQ= new CloudHeadQuarters();
		hQ.putSelfInGrid(gr,new Location(0,4));
		Actor nActor2 = new Pig1();
		nActor2.putSelfInGrid(gr,new Location(3, 5));
		Actor nActor3 = new Pig1();
		nActor3.setColor(null);
		nActor3.putSelfInGrid(gr,new Location(3, 14));
		Actor nActor4 = new SummerGround();
		nActor4.putSelfInGrid(gr,new Location(3, 15));
		Actor nActor5 = new SummerGround();
		nActor5.setColor(null);
		nActor5.putSelfInGrid(gr,new Location(3, 16));
		Actor nActor6 = new SummerGround();
		nActor6.setColor(null);
		nActor6.putSelfInGrid(gr,new Location(3, 17));
		Actor nActor7 = new SummerGround();
		nActor7.setColor(null);
		nActor7.putSelfInGrid(gr,new Location(4, 1));
		Actor nActor8 = new SummerGround();
		nActor8.setColor(null);
		nActor8.putSelfInGrid(gr,new Location(4, 2));
		Actor nActor9 = new SummerGround();
		nActor9.setColor(null);
		nActor9.putSelfInGrid(gr,new Location(4, 3));
		Actor nActor10 = new SummerGround();
		nActor10.setColor(null);
		nActor10.putSelfInGrid(gr,new Location(4, 4));
		Actor nActor11 = new SummerGround();
		nActor11.setColor(null);
		nActor11.putSelfInGrid(gr,new Location(4, 5));
		Actor nActor12 = new Pig1();
		nActor12.setColor(null);
		nActor12.putSelfInGrid(gr,new Location(4, 10));
		Actor nActor13 = new SummerGround();
		nActor13.setColor(null);
		nActor13.putSelfInGrid(gr,new Location(4, 11));
		Actor nActor14 = new SummerGround();
		nActor14.setColor(null);
		nActor14.putSelfInGrid(gr,new Location(4, 12));
		Actor nActor15 = new SummerGround();
		nActor15.setColor(null);
		nActor15.putSelfInGrid(gr,new Location(4, 13));
		Actor nActor16 = new SummerGround();
		nActor16.setColor(null);
		nActor16.putSelfInGrid(gr,new Location(4, 14));
		Actor nActor17 = new SummerGround();
		nActor17.setColor(null);
		nActor17.putSelfInGrid(gr,new Location(4, 15));
		Actor nActor18 = new Fighter();
		nActor18.setColor(null);
		nActor18.putSelfInGrid(gr,new Location(5, 1));
		Actor nActor19 = new Pig1();
		nActor19.setColor(null);
		nActor19.putSelfInGrid(gr,new Location(5, 4));
		Actor nActor20 = new SummerGround();
		nActor20.setColor(null);
		nActor20.putSelfInGrid(gr,new Location(5, 6));
		Actor nActor21 = new SummerGround();
		nActor21.setColor(null);
		nActor21.putSelfInGrid(gr,new Location(5, 7));
		Actor nActor22 = new SummerGround();
		nActor22.setColor(null);
		nActor22.putSelfInGrid(gr,new Location(5, 8));
		Actor nActor23 = new SummerGround();
		nActor23.setColor(null);
		nActor23.putSelfInGrid(gr,new Location(5, 9));
		Actor nActor24 = new SummerGround();
		nActor24.setColor(null);
		nActor24.putSelfInGrid(gr,new Location(5, 10));
		Actor nActor25 = new SummerGround();
		nActor25.setColor(null);
		nActor25.putSelfInGrid(gr,new Location(6, 0));
		Actor nActor26 = new SummerGround();
		nActor26.setColor(null);
		nActor26.putSelfInGrid(gr,new Location(6, 1));
		Actor nActor27 = new SummerGround();
		nActor27.setColor(null);
		nActor27.putSelfInGrid(gr,new Location(6, 2));
		Actor nActor28 = new SummerGround();
		nActor28.setColor(null);
		nActor28.putSelfInGrid(gr,new Location(6, 3));
		Actor nActor29 = new SummerGround();
		nActor29.setColor(null);
		nActor29.putSelfInGrid(gr,new Location(6, 4));
		
	}
	public void level3()
	{
		KeyWorld world= new KeyWorld();
		Grid<Actor> gr= getGrid();
		moveTo(new Location(2,18)); // 6, 12
		CloudHeadQuarters hQ= new CloudHeadQuarters();
		hQ.putSelfInGrid(gr,new Location(0,4));
		Actor nActor0 = new Fighter();
		nActor0.setColor(null);
		nActor0.putSelfInGrid(gr,new Location(1, 1));
		Actor nActor1 = new Monkey100HP();
		nActor1.setColor(null);
		nActor1.putSelfInGrid(gr,new Location(1, 4));
		Actor nActor2 = new SummerGround();
		nActor2.setColor(null);
		nActor2.putSelfInGrid(gr,new Location(2, 0));
		Actor nActor3 = new SummerGround();
		nActor3.setColor(null);
		nActor3.putSelfInGrid(gr,new Location(2, 1) );
		Actor nActor4 = new SummerGround();
		nActor4.setColor(null);
		nActor4.putSelfInGrid(gr,new Location(2, 2));
		Actor nActor5 = new SummerGround();
		nActor5.setColor(null);
		nActor5.putSelfInGrid(gr,new Location(2, 3));
		Actor nActor6 = new SummerGround();
		nActor6.setColor(null);
		nActor6.putSelfInGrid(gr,new Location(2, 4));
		Actor nActor7 = new Monkey100HP();
		nActor7.setColor(null);
		nActor7.putSelfInGrid(gr,new Location(2, 9));
		Actor nActor9 = new SummerGround();
		nActor9.setColor(null);
		nActor9.putSelfInGrid(gr,new Location(3, 6));
		Actor nActor10 = new SummerGround();
		nActor10.setColor(null);
		nActor10.putSelfInGrid(gr,new Location(3, 7));
		Actor nActor11 = new SummerGround();
		nActor11.setColor(null);
		nActor11.putSelfInGrid(gr,new Location(3, 8));
		Actor nActor12 = new SummerGround();
		nActor12.setColor(null);
		nActor12.putSelfInGrid(gr,new Location(3, 9));
		Actor nActor13 = new SummerGround();
		nActor13.setColor(null);
		nActor13.putSelfInGrid(gr,new Location(3, 15));
		Actor nActor14 = new SummerGround();
		nActor14.setColor(null);
		nActor14.putSelfInGrid(gr,new Location(3, 16));
		Actor nActor15 = new SummerGround();
		nActor15.setColor(null);
		nActor15.putSelfInGrid(gr,new Location(3, 17));
		Actor nActor16 = new SummerGround();
		nActor16.setColor(null);
		nActor16.putSelfInGrid(gr,new Location(3, 18));
		Actor nActor17 = new SummerGround();
		nActor17.setColor(null);
		nActor17.putSelfInGrid(gr,new Location(4, 1));
		Actor nActor18 = new SummerGround();
		nActor18.setColor(null);
		nActor18.putSelfInGrid(gr,new Location(4, 14));
		Actor nActor19 = new SummerGround();
		nActor19.setColor(null);
		nActor19.putSelfInGrid(gr,new Location(4, 15));
		Actor nActor20 = new SummerGround();
		nActor20.setColor(null);
		nActor20.putSelfInGrid(gr,new Location(5, 2));
		Actor nActor21 = new Monkey100HP();
		nActor21.setColor(null);
		nActor21.putSelfInGrid(gr,new Location(5, 6));
		Actor nActor22 = new SummerGround();
		nActor22.setColor(null);
		nActor22.putSelfInGrid(gr,new Location(5, 13));
		Actor nActor23 = new SummerGround();
		nActor23.setColor(null);
		nActor23.putSelfInGrid(gr,new Location(6, 3));
		Actor nActor24 = new SummerGround();
		nActor24.setColor(null);
		nActor24.putSelfInGrid(gr,new Location(6, 4));
		Actor nActor25 = new SummerGround();
		nActor25.setColor(null);
		nActor25.putSelfInGrid(gr,new Location(6, 5));
		Actor nActor26 = new SummerGround();
		nActor26.setColor(null);
		nActor26.putSelfInGrid(gr,new Location(6, 6));
		Actor nActor27 = new Monkey100HP();
		nActor27.setColor(null);
		nActor27.putSelfInGrid(gr,new Location(6, 8));
		Actor nActor28 = new Monkey100HP();
		nActor28.setColor(null);
		nActor28.putSelfInGrid(gr,new Location(6, 11));
		Actor nActor29 = new SummerGround();
		nActor29.setColor(null);
		nActor29.putSelfInGrid(gr,new Location(6, 12));
		Actor nActor30 = new SummerGround();
		nActor30.setColor(null);
		nActor30.putSelfInGrid(gr,new Location(6, 13));
		Actor nActor31 = new SummerGround();
		nActor31.setColor(null);
		nActor31.putSelfInGrid(gr,new Location(7, 7));
		Actor nActor32 = new SummerGround();
		nActor32.setColor(null);
		nActor32.putSelfInGrid(gr,new Location(7, 8));
		Actor nActor33 = new SummerGround();
		nActor33.setColor(null);
		nActor33.putSelfInGrid(gr,new Location(7, 9));
		Actor nActor34 = new SummerGround();
		nActor34.setColor(null);
		nActor34.putSelfInGrid(gr,new Location(7, 10));
		Actor nActor35 = new SummerGround();
		nActor35.setColor(null);
		nActor35.putSelfInGrid(gr,new Location(7, 11));
		Actor nActor36 = new SummerGround();
		nActor36.setColor(null);
		Actor nActor37= new SummerGround();
		nActor37.putSelfInGrid(gr,new Location(7, 12));
	}	
	

	public void level4()
	{
		KeyWorld world= new KeyWorld();
		Grid<Actor> gr= getGrid();
		moveTo(new Location(5,17)); // 5, 17
		CloudHeadQuarters hQ= new CloudHeadQuarters();
		hQ.putSelfInGrid(gr,new Location(0,4));
		Actor nActor0 = new Tiger100HP();
		nActor0.setColor(null);
		nActor0.putSelfInGrid(gr,new Location(2, 5));
		Actor nActor1 = new Tiger100HP();
		nActor1.setColor(null);
		nActor1.putSelfInGrid(gr,new Location(2, 9));
		Actor nActor2 = new Fighter();
		nActor2.setColor(null);
		nActor2.putSelfInGrid(gr,new Location(3, 1));
		Actor nActor3 = new SummerGround();
		nActor3.setColor(null);
		nActor3.putSelfInGrid(gr,new Location(3, 2));
		Actor nActor4 = new SummerGround();
		nActor4.setColor(null);
		nActor4.putSelfInGrid(gr,new Location(3, 3));
		Actor nActor5 = new SummerGround();
		nActor5.setColor(null);
		nActor5.putSelfInGrid(gr,new Location(3, 5));
		Actor nActor6 = new SummerGround();
		nActor6.setColor(null);
		nActor6.putSelfInGrid(gr,new Location(3, 6));
		Actor nActor7 = new SummerGround();
		nActor7.setColor(null);
		nActor7.putSelfInGrid(gr,new Location(3, 7));
		Actor nActor8 = new SummerGround();
		nActor8.setColor(null);
		nActor8.putSelfInGrid(gr,new Location(3, 8));
		Actor nActor9 = new SummerGround();
		nActor9.setColor(null);
		nActor9.putSelfInGrid(gr,new Location(3, 9));
		Actor nActor10 = new SummerGround();
		nActor10.setColor(null);
		nActor10.putSelfInGrid(gr,new Location(4, 0));
		Actor nActor11 = new SummerGround();
		nActor11.setColor(null);
		nActor11.putSelfInGrid(gr,new Location(4, 1));
		Actor nActor12 = new SummerGround();
		nActor12.setColor(null);
		nActor12.putSelfInGrid(gr,new Location(5, 2));
		Actor nActor13 = new Tiger100HP();
		nActor13.setColor(null);
		nActor13.putSelfInGrid(gr,new Location(5, 6));
		Actor nActor14 = new Tiger100HP();
		nActor14.setColor(null);
		nActor14.putSelfInGrid(gr,new Location(5, 15));
		Actor nActor16 = new SummerGround();
		nActor16.setColor(null);
		nActor16.putSelfInGrid(gr,new Location(6, 3));
		Actor nActor17 = new SummerGround();
		nActor17.setColor(null);
		nActor17.putSelfInGrid(gr,new Location(6, 4));
		Actor nActor18 = new SummerGround();
		nActor18.setColor(null);
		nActor18.putSelfInGrid(gr,new Location(6, 5));
		Actor nActor19 = new SummerGround();
		nActor19.setColor(null);
		nActor19.putSelfInGrid(gr,new Location(6, 6));
		Actor nActor20 = new Tiger100HP();
		nActor20.setColor(null);
		nActor20.putSelfInGrid(gr,new Location(6, 8));
		Actor nActor21 = new Tiger100HP();
		nActor21.setColor(null);
		nActor21.putSelfInGrid(gr,new Location(6, 11));
		Actor nActor22 = new SummerGround();
		nActor22.setColor(null);
		nActor22.putSelfInGrid(gr,new Location(6, 12));
		Actor nActor23 = new SummerGround();
		nActor23.setColor(null);
		nActor23.putSelfInGrid(gr,new Location(6, 13));
		Actor nActor24 = new SummerGround();
		nActor24.setColor(null);
		nActor24.putSelfInGrid(gr,new Location(6, 14));
		Actor nActor25 = new SummerGround();
		nActor25.setColor(null);
		nActor25.putSelfInGrid(gr,new Location(6, 15));
		Actor nActor26 = new SummerGround();
		nActor26.setColor(null);
		nActor26.putSelfInGrid(gr,new Location(6, 16));
		Actor nActor27 = new SummerGround();
		nActor27.setColor(null);
		nActor27.putSelfInGrid(gr,new Location(6, 17));
		Actor nActor28 = new SummerGround();
		nActor28.setColor(null);
		nActor28.putSelfInGrid(gr,new Location(7, 7));
		Actor nActor29 = new SummerGround();
		nActor29.setColor(null);
		nActor29.putSelfInGrid(gr,new Location(7, 8));
		Actor nActor30 = new SummerGround();
		nActor30.setColor(null);
		nActor30.putSelfInGrid(gr,new Location(7, 9));
		Actor nActor31 = new SummerGround();
		nActor31.setColor(null);
		nActor31.putSelfInGrid(gr,new Location(7, 10));
		Actor nActor32 = new SummerGround();
		nActor32.setColor(null);
		nActor32.putSelfInGrid(gr,new Location(7, 11));
		Actor nActor33 = new SummerGround();
		nActor33.setColor(null);
	}
	public void level5()
	{
		KeyWorld world= new KeyWorld();
		Grid<Actor> gr= getGrid();
		CloudHeadQuarters hq= new CloudHeadQuarters();
		hq.putSelfInGrid(gr, new Location(0,4));
		Actor nActor0 = new Fighter();
		nActor0.setColor(null);
		nActor0.putSelfInGrid(gr,new Location(6, 4));
		Actor nActor1 = new SummerGround();
		nActor1.setColor(null);
		nActor1.putSelfInGrid(gr,new Location(7, 1));
		Actor nActor2 = new Ninja();
		nActor2.setColor(null);
	//	nActor2.putSelfInGrid(gr,new Location(6, 8));
		Actor nActor3 = new Ninja();
	//	nActor3.putSelfInGrid(gr,new Location(6, 11));
		Actor nActor4 = new BossReg();
		nActor4.putSelfInGrid(gr,new Location(6, 12));
		Actor nActor6 = new SummerGround();
		nActor6.putSelfInGrid(gr,new Location(7, 2));
		Actor nActor7 = new SummerGround();
		nActor7.setColor(null);
		nActor7.putSelfInGrid(gr,new Location(7, 3));
		Actor nActor8 = new SummerGround();
		nActor8.setColor(null);
		nActor8.putSelfInGrid(gr,new Location(7, 4));
		Actor nActor9 = new SummerGround();
		nActor9.setColor(null);
		nActor9.putSelfInGrid(gr,new Location(7, 5));
		Actor nActor10 = new SummerGround();
		nActor10.setColor(null);
		nActor10.putSelfInGrid(gr,new Location(7, 6));
		Actor nActor11 = new SummerGround();
		nActor11.setColor(null);
		nActor11.putSelfInGrid(gr,new Location(7, 7));
		Actor nActor12 = new SummerGround();
		nActor12.setColor(null);
		nActor12.putSelfInGrid(gr,new Location(7, 8));
		Actor nActor13 = new SummerGround();
		nActor13.setColor(null);
		nActor13.putSelfInGrid(gr,new Location(7, 9));
		Actor nActor14 = new SummerGround();
		nActor14.setColor(null);
		nActor14.putSelfInGrid(gr,new Location(7, 10));
		Actor nActor15 = new SummerGround();
		nActor15.setColor(null);
		nActor15.putSelfInGrid(gr,new Location(7, 11));
		Actor nActor16 = new SummerGround();
		nActor16.setColor(null);
		nActor16.putSelfInGrid(gr,new Location(7, 12));
		Actor nActor17 = new SummerGround();
		nActor17.setColor(null);
		nActor17.putSelfInGrid(gr,new Location(7, 13));
		Actor nActor18 = new SummerGround();
		nActor18.setColor(null);
		nActor18.putSelfInGrid(gr,new Location(7, 14));
		Actor nActor19= new SummerGround();
		Actor nActor20=new SummerGround();
		nActor20.putSelfInGrid(gr, new Location(7,15));
		Actor nActor21= new SummerGround();
		nActor21.putSelfInGrid(gr,new Location(7,16));
		nActor19.setColor(null);
		nActor19.putSelfInGrid(gr,new Location(7, 15));
		CloudHeadQuarters eyeInTheSky= new CloudHeadQuarters();
		eyeInTheSky.setColor(null);
		//eyeInTheSky.putSelfInGrid(gr,new Location(2,9));
//		eyeInTheSky.bossCount=1;
		removeSelfFromGrid();
	}
	
}





