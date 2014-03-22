import java.lang.Math;
import java.util.*;

public class main
{
	
	public static void main(String[] args)
	{
		
		
		//test for card class
		Card test = new Card("SPADES", 13);
		Card test1 = new Card("SPADES", 12);
		Card test2 = new Card("SPADES", 10);
		

		Pile drawingpile = new Pile("full");
		Pile discardpile = new Pile();
		
		Player testplayer = new Player();
		
		testplayer.addtoHand(test);
		testplayer.addtoHand(test1);
		testplayer.addtoHand(test2);
		
		System.out.println(testplayer);
		
		drawingpile.shuffle();
		discardpile.addtoTop(drawingpile.topCard());
		drawingpile.draw();
		
		Card topcard = new Card("DIAMONDS", 9);
		
		discardpile.addtoTop(topcard);
		testplayer.addtoHand(topcard);
		
		
		System.out.println("The top card in the discard pile is: " + discardpile.topCard());
		
		
		Card movecard = new Card("DIAMONDS", 9);
		testplayer.turn(drawingpile, discardpile, movecard);
		
		System.out.print(discardpile + " \n // \n");
		System.out.print(drawingpile + " \n // \n");
		System.out.print(testplayer + " \n // \n");
		
		
		/*System.out.println("Hello, welcome to the card game Crazy Eights!");
		
		int numhplayers=0;
		System.out.println("How many human players do you want? Enter a number"); 
		//get user input
		numhplayers = 3;
		
		int numcplayers=0;
		System.out.println("How many computer players do you want? Enter a number");
		numcplayers = 3;
		
		int totalplayers = numhplayers + numcplayers;		
		
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
		
		
		
		
		
		
		
		*/
		
		
		
	}
	
}