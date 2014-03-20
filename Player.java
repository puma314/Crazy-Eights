
public class Player 
{
	public Pile hand;
	
	Player()
	{
		hand = new Pile();
	}
	
	public void addtoHand(Card card)
	{
		hand.addtoTop(card);
	}
	
	
	public void removefromHand(Card card)
	{
		hand.remove(card);
	}
	
	public void turn(Pile drawingpile, Pile discardpile)
	{
		int move=0; //move changes to 1 when move is made
		if (discardpile.topCard().number != 8)
		{
			
		}
		
		else 
		{
			
			
		}
		
		if(move == 0)
		{
			this.addtoHand(drawingpile.topCard());
			drawingpile.draw();
	
		}
	}
	
	
	//if(discardpile.top().number == 8)

	
	//if(discardpile.topcard().number != 8)
	//{
		//interate through hand and first card that matches suit or number of discardpile.topcard(), play that card
		//keep track of move made
		
	//	if(move == false )
		//{
			//iterate through deck and play 8 if possible, nominate suit
			//change turn objects suit
		//}
		


}
