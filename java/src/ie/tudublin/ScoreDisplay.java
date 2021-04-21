package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();
	
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";



	public void loadNotes()
	{
		char tempNote;
		char NoteCheck;
		int tempDuration = 1;
		String type = "Quaver";

		for(int i=0; i<score.length(); i++)
		{
			tempNote = score.charAt(i);
			if(i <(score.length()-1))
			{
				NoteCheck = score.charAt((i+1));
			

				if(!Character.isDigit(NoteCheck))
				{
					tempDuration = 1;
					type = "Quaver";
				}
				else{
					tempDuration = 2;
					type = "Crotchet";
				}
			}

			if(!Character.isDigit(tempNote))
			{
				Note note = new Note(tempNote, tempDuration, type);
				notes.add(note);
			}
		}
	}

	public void printScores()
	{
		for(Note n: notes)
		{
			printArray(n);
		}


	}

	private float border = 20;
	private float topBorder = 150;

	public void staveLines()
	{
		float x = topBorder;
		stroke(20);
		for(int i = 0; i < 5; i++)
		{
			x += (float)30;
			line(border, x, width - border, x );
			fill(255);
		}
	}
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		colorMode(HSB);
		loadNotes();
		printScores();
	}

	public void draw()
	{
		background(255);
		staveLines();
		drawNotes();
		
	}

	void drawNotes()
	{
		int temp;
		char val;
		int noteType;

		for(Note n: notes)
		{
			val = n.getNote();
			noteType = n.getDuration();
			temp = val - 0;
			

			if (val == 'A')
			{
				temp = 66;
			}
			else if(val == 'B')
			{
				temp = 67;
			}
			else if(val == 'c')
			{
				temp = 72;
			}
			else if(val == 'd')
			{
				temp = 73;
			}

			stroke(128);
			for(int j=0; j<score.length(); j++)
			{
				float x = map(temp, 66, 76, border+40, width-border);
				float y = map(temp, 66, 76, height-200, 150);
				ellipse(x, y, 30, 30);
				line(x+15, y, x+15, y-60);
				if(noteType == 2)
				{
					line(x+15, y-60, x+30, y-45);
				}
				fill(255);
			}
		}
	}
}
