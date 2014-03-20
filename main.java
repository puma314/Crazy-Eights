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
		
		String fulldeck = "";
		Pile drawingpile = new Pile(fulldeck);
		
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
		
		
		int playernum =0;
		{
			setofplayers[playernum%7].makemove();
			playernum++;
			
			for(int i=0; i < setofplayers.length; i++)
			{
				if(setofplayers[i].hand.size() == 0)
				{
					System.out.print("Player" + i + "has won!");
					break;
				
				}
			}
			
			
		}while(drawingpile.size() > 0);
	
		System.out.println("The drawing pile is empty. The game has to stop.");
		
		//end game when 1 person had hand = 0 
		//method: setofplayers.endgame() and then have while loop while false
		
		
		
		
		
		
		
		
		
		
		
	}
	
}