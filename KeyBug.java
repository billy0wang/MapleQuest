package Game;
/*
 * Written By: Sam Gross & Thomas Dorsey
 * 
 * This class is the code for a bug that responds to the arrow keys
 * on the right of the main keyboard body, but not those in the number
 * pad to the far right hand side.
 * 
 * This code can be modified to respond to any keys from the main
 * section of the keyboard, including the block above the arrow keys.
 * The spacebar, windows key, and menu key are not usable, nor are any
 * combinations of the control key. 
 * 
 * This class, and the others contaiend within the package 
 * "KeyBugDistro" may not be sold or commercialized in any way. If
 * published, attribution must be made to the authors of the work.
 * Do not remove this message when modifying or distributing this code.
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
public class KeyBug extends Actor implements KeyboardControllable
{	
	public void actionToPerform(String description)
	{
		if(description.equals("UP"))
			setDirection(0);
		else if(description.equals("DOWN"))
			setDirection(180);
		else if(description.equals("LEFT"))
			setDirection(270);
		else if(description.equals("RIGHT"))
			setDirection(90);
	}
}