package Game;


//Billy Wang
//PD 4 Comp Sci
/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */

import info.gridworld.actor.Bug;
public class ZBug extends Bug
{
	private int steps;
	private int sideLength;
	private int theSide;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * @param length the side length
	 */
	public ZBug(int length)
	{
		steps = 0;
		theSide=1;
		sideLength = length;
		setDirection(90);
	}

	/**
	 * Moves to the next location of the square.
	 * @param stuff 
	 */

	public void act()
	{

		if (steps < sideLength && canMove())
		{
			move();
			steps++;
		}
		else if(theSide==1)
		{
			turn();
			turn();
			turn();
			steps=0;
			theSide++;
		}
		else if (theSide==2)
			{
				turn();
				turn();
				turn();
				turn();
				turn();
				steps=0;
				theSide++;
			}


		}
	}



