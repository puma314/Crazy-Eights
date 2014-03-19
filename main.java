import java.lang.Math;

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
		
		SetofPlayers setofplayers = new SetofPlayers();
		
		for(int i=0; i<numcplayers; i++)
		{
			CPlayer compplayer = new CPlayer();
			setofplayers.add(compplayer);
			
		}
		
		for(int j=numcplayers; j<totalplayers; j++)
		{
			HPlayer humanplayer = new HPlayer();
			setofplayers.add(humanplayer);
		}
		
		//NOTE TO SELF: create discard pile, drawing pile objects
		
		DrawingPile drawingpile = new DrawingPile();
		
		DiscardPile discardpile = new DiscardPile(); //implement discard pile constructor
		
		drawingpile.shuffle();
		
		Dealer dealer = new Dealer();
		
		//if totalplayers > 2
		
		//Gives each player 5 cards
		for(int i=0; i<totalplayers; i++)
		{
			dealer.deal(drawingpile, setofplayers[i]; 5);
		}
		
		//if totalplayers = 2
		dealer.deal(drawingpile, setofplayers[1], 7);
		deal.deal(drawingpile, setofplayers[1], 7);
		
		discardpile.add(drawingpile[0]);
		drawingpile.remove(0);
		
		System.out.println("The top card in the discard pile is: " + discardpile.topcard());
		
		//Turn for computer player
		
		//NOTE TO SELF: make turn object with current suit, number (the top card of the discard pile), current player whos turn it is
		if(discardpile.top().number == 8)
		{
			//either play 8 or access suit of turn object and play card with that suit. 
			//change move to true if move made
		}
		
		if(discardpile.topcard().number != 8)
		{
			//interate through hand and first card that matches suit or number of discardpile.topcard(), play that card
			//keep track of move made
			
			if(move == false )
			{
				//iterate through deck and play 8 if possible, nominate suit
				//change turn objects suit
			}
			
		}
		
		if (move == false)
			compplayer.draw(drawingpile);
		
		//Do same thing with human except with prompts
		
		//Also need case for if drawing pile is empty, just proceed without drawing.
		//If all players have drawn in a row, then game stops.
		
		//end game when 1 person had hand = 0 
		//method: setofplayers.endgame() and then have while loop while false
		
		
		
		
		
		
		
		
		
		
		
	}
	
}