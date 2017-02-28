package Game;
//Billy Wang
//PD 4 Comp Sci
import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
	private int sideLength;
	private int steps;
	private int[] danceStuff;


	/**
	 * Constructs a box bug that traces a square of a given side length
	 * @param length the side length
	 */
	public DancingBug(int length, int[] jams)
	{
		steps=0;
		danceStuff=jams;
		sideLength = length;
		System.out.println(danceStuff);

	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act()
	{
		if (steps< danceStuff.length)
		{
			for(int i=0; i<danceStuff[steps]; i++)
			{
				turn();	
			}
			steps++;
			super.act();
		}
		else steps=0;

	}


}




