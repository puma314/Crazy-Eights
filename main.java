import java.lang.Math;
import java.util.*;

public class main
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Hello, welcome to the card game Crazy Eights!");
		
		int numhplayers=0;
		System.out.println("How many human players do you want? Enter a number"); 
		
		int numcplayers=0;
		System.out.println("How many computer players do you want? Enter a number");
		
		int totalplayers = numhplayers + numcplayers;
		//If total number of players > 10 then throw error. If the total number of plays < 2 throw error. Prompt for new number. 
		
		//SetofPlayers setofplayers = new SetofPlayers();
		
		Player[] setofplayers = new Player[totalplayers];
		
		for(int i=0; i<numcplayers; i++)
		{
			CPlayer compplayer = new CPlayer();
			setofplayers[i] = compplayer;
			
		}
		
		for(int j=numcplayers; j<totalplayers; j++)
		{
			HPlayer humanplayer = new HPlayer();
			setofplayers[j] = humanplayer;
		}
		
		
		Pile drawingpile = new Pile();
		
		Pile discardpile = new Pile();
		
		drawingpile.shuffle();
		
		
		//if totalplayers > 2	
		//Gives each player 5 cards
		for(int i=0; i<5*totalplayers; i++)
		{
			
			setofplayers[i%totalplayers].addtoHand(drawingpile.topCard());
			drawingpile.draw();
		}
		
		//if totalplayers = 2
		//implement code to deal with this annoyance.
		
		
		discardpile.addtoTop(drawingpile.topCard());
		drawingpile.draw();
		
		System.out.println("The top card in the discard pile is: " + discardpile.topCard());
		
		
		
		
		
		//Do same thing with human except with prompts
		
		//Also need case for if drawing pile is empty, just proceed without drawing.
		//If all players have drawn in a row, then game stops.
		
		//end game when 1 person had hand = 0 
		//method: setofplayers.endgame() and then have while loop while false
		
		
		
		
		
		
		
		
		
		
		
	}
	
}