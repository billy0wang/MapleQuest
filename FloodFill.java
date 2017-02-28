package Game;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/********************************************************************
 * Written by: Billy Wang
 *
 * Period: 7 Comp Sci
 * 
 * ASSIGNMENT:  To write a program that asks the user to input the
 * name of a datafile contining the outline of a figure.  Then ask
 * for the row and column where the user would like to begin the 
 * floodfill and print the final figure.  You will need:
 * 
 * -  a fill method that asks the user for a file name and reads a 
 * ‘shape’ from a data file into a 2D array of chars.
 * 
 * -  a print method that prints the empty shape and asks the user
 * for a starting point. If the point is inside the shape, you 
 * should recursively floodfill the shape. If the point is outside
 * the shape the ‘background’ should be floodfilled.  If the point
 * is on a line nothing should happen.  Error check the row & 
 * column to make sure they are in the 2D array.
 * 
 * -  a second print method that prints the floodfilled shape
 * and asks the user if (s)he would like to fill another shape.
 * 
 * -  a recursive floodFill method that does the floodfill.
 * 
 * You should use either 'Simhei' or 'Lucida Console' font to make
 * your characters print out evenly. 
 * 
 * Your program should continue reading data files and floodfilling 
 * until the user wants to quit.  

 * The data file will be in the form:
 * 
 * 		#rows #cols 
 * 		row col (for each point in shape)
 * 		row col
 * 		etc…
 * 
 * There is an example text file, ff.txt, on hand out, but your
 * program should work with any shape.
  * 
 *******************************************************************/
public class FloodFill
{
	public static void changeJOP()
	{
		UIManager.put("Label.font", new FontUIResource
				(new Font("Simhei", Font.BOLD, 28)));
		UIManager.put("OptionPane.messageForeground",new Color(50,50,50));
		UIManager.put("Panel.background", Color.CYAN);
		UIManager.put("OptionPane.background",new Color(34,159,34));	  
		UIManager.put("TextField.background",Color.yellow);
		UIManager.put("TextField.foreground", new Color(34,159,34));
		UIManager.put("TextField.font", new FontUIResource
				(new Font("Tempus Sans ITC", Font.BOLD, 14)));	 
		UIManager.put("Button.background",new Color(255,145,20));
		UIManager.put("Button.foreground", new Color(4,109,4));
		UIManager.put("Button.font", new FontUIResource
				(new Font("Tempus Sans ITC", Font.BOLD, 14)));
	}
	
	public static char[][] readIn()
	{
		char[][] picture = null;
				
		try{
			Scanner inFile = new Scanner(new File(JOptionPane.
					showInputDialog("What's the name of the file?")));
			
			picture = new char[inFile.nextInt()][inFile.nextInt()];
			
			for(int r=0; r<picture.length; r++)
				for(int c=0; c<picture[0].length; c++)
					picture[r][c]=' ';     
			
			while (inFile.hasNext()) {
				int row = inFile.nextInt();
				int col = inFile.nextInt();
				picture[row][col] = '*';
			}
			
			inFile.close();
			
		}catch (Exception e){
			System.out.println("error reading file: "+e);
		}
		return picture;
	}
	
	public static String printEmptyShape(char[][] picture)
	{
		String show = "  ";
		for(int i=0; i<picture[0].length; i++)
			show+=i%10+" ";
		for(int r = 0; r < picture.length; r++)
		{
			show+="\n"+r%10+" ";
			for(int c = 0; c < picture[0].length; c++)
				show+=""+picture[r][c]+' ';
		}
		return JOptionPane.showInputDialog(show+"\nInput numbers");
	}
	
	public static void floodFill(char[][] picture, int sRow, int sCol)
	{
		if(picture[sRow][sCol]!='*')
		{
			picture[sRow][sCol]='*';
			if(sRow-1>=0 && picture[sRow-1][sCol]!='*')
				floodFill(picture,sRow-1,sCol);
			if(sCol-1>=0 && picture[sRow][sCol-1]!='*')
				floodFill(picture,sRow,sCol-1);
			if(sRow+1<picture.length && picture[sRow+1][sCol]!='*')
				floodFill(picture,sRow+1,sCol);
			if(sCol+1<picture[0].length && picture[sRow][sCol+1]!='*')
				floodFill(picture,sRow,sCol+1);
		}
	}
	
	public static int printFilledShape(char[][] picture)
	{
		String show = "  ";
		for(int i=0; i<picture[0].length; i++)
			show+=i%10+" ";
		for(int r = 0; r < picture.length; r++)
		{
			show+="\n"+r%10+" ";
			for(int c = 0; c < picture[0].length; c++)
				show+=""+picture[r][c]+' ';
		}
		String[] again = {"Yes","No"};
		return JOptionPane.showOptionDialog(null, show+"\nAgain?", 
				"Hi there", 0, 3, null, again, null);
	}
	
	public static void main(String[] args)
	{
		changeJOP();
		int again=0;
		char[][] picture;
		do{
			picture = readIn();
			String start = printEmptyShape(picture);
			String[] pieces = start.split(" ");
			int startRow = Integer.parseInt(pieces[0]);
			int startCol = Integer.parseInt(pieces[1]);
	
			floodFill(picture, startRow, startCol);
			again = printFilledShape(picture);
		}while (again == 0);
	}
}


