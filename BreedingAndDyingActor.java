package Game;
import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/********************************************************************
 * Written by: Billy Wang
 * Period: PD 4 Comp Sci
 * 
 * ASSIGNMENT:  Write a class that extends Actor and adds breeding &
 * dying.  Your BAD Actor should try to breed.  If it breeds it 
 * should breed into every empty location 1 space around it.
 * It creates new BADActors of the same color when it breeds.  If it
 * doesn't breed it moves into a random empty space 1 space around it.
 * If there are no spaces it does nothing. After breeding or moving
 * it should have a chance of dying.
 * .
 * 
 * You will need to add attributes for chanceOfBreeding, 
 * chanceOfDying, age and ageCanBreed
 * 
 * The default values these attributes are: 	
 *	It has 1 in 3 chance of breeding starting at step (age) 3.
 *	It has .1 chance of dying at age 0 and it goes up .1 each step.
 *
 * You should not have a default constructor.  Why?
 * 
 *  You should have a parameter constructor that lets the user send
 *  in the color.
 * 
 * You should have a second parameter constructor that lets the user
 * send in values for all of the attributes except age. Age, of 
 * course, should always start at 0. 
 * 
 * You should have an act method patterned after the act method in
 * Critter - all of the work should be done in methods.
 * 
 * GRADING:  50 points
 * 
 * ____  You have a useful picture for your BADActor (5 points)
 * ____  Your BADActor works, runs smoothly and follows all of the
 * 			directions (15 points)
 * ____  Your code is well written - your methods make sense and you
 * 			use inheritance correctly.  (15 points)
 * ____  Your runner tests all possible situations (15 points)
 * 
 * 
 * HAND IN:  Create a jar file, put it in my hand in folder and print
 * your BADActor and your runner.
 * 
 ********************************************************************/
public class BreedingAndDyingActor extends Actor
{
	private double breedingChance;
	private double dyingChance;
	private int legalBreedingAge;
	private int age;
	
	public double getBreedingChance() {
		return breedingChance;
	}

	public void setBreedingChance(double breedingChance) {
		this.breedingChance = breedingChance;
	}

	public double getDyingChance() {
		return dyingChance;
	}

	public void setDyingChance(double dyingChance) {
		this.dyingChance = dyingChance;
	}

	public int getLegalBreedingAge() {
		return legalBreedingAge;
	}

	public void setLegalBreedingAge(int legalBreedingAge) {
		this.legalBreedingAge = legalBreedingAge;
	}

	public int getAge() {
		return age;
	}

	public BreedingAndDyingActor(Color actorColor)
	{
		setColor(actorColor);
		breedingChance=0.33;
		dyingChance=0.1;
		legalBreedingAge=3;
		age=0;
	}

	public BreedingAndDyingActor(double chanceOfBreeding, double chanceOfDying,
			int ageCanBreed, Color badColor)
	{
		setBreedingChance(chanceOfBreeding);
		setDyingChance(chanceOfDying);
		setLegalBreedingAge(ageCanBreed);
		age=0;
		setColor(badColor);
	}
	public void act()
	{
		boolean lucky=makingLife();
		dimmingTheLight();
		ArrayList<Location> moveLocs = getMoveLocations();
		Location loc = selectMoveLocation(moveLocs);
		feetofFury(lucky,loc);
		acceptingFate();
	}
	public boolean makingLife()
	{
		boolean lucky = false;
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if(Math.random()<=breedingChance && (age>=legalBreedingAge))
		{

			ArrayList<Location> emptyLocationsAround = 
				gr.getEmptyAdjacentLocations(loc);
			for(Location i : emptyLocationsAround)
			{
				BreedingAndDyingActor coray= new BreedingAndDyingActor
						(this.getColor());
				coray.putSelfInGrid(gr, i);
				lucky=true;
			}

		}
		return lucky;


	}
	public void dimmingTheLight()
	{

		if(dyingChance+0.1<1.0)
		{
			dyingChance=dyingChance+0.1;
		}
		age++;

	}
	public void acceptingFate()
	{

		if((Math.random())<=(dyingChance))
		{
			this.removeSelfFromGrid();
		}

	}
	public ArrayList<Location> getMoveLocations()
	{
		return getGrid().getEmptyAdjacentLocations(getLocation());
	}
	public Location selectMoveLocation(ArrayList<Location> locs)
	{
		int n = locs.size();
		if (n == 0)
			return getLocation();
		int r = (int) (Math.random() * n);
		return locs.get(r);
	}
	public void feetofFury(boolean lucky,Location loc)
	{
		if(lucky==false)
		{
			moveTo(loc);
		}
	}



}
