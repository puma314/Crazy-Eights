
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
	
	public boolean turn(Pile drawingpile, Pile discardpile, Card card)
	{
		//case of if top card is 8 is implicitly taken care of.
			if(card.suit.equals(discardpile.topCard().suit) || card.number == discardpile.topCard().number)
			{
				hand.remove(card);
				Card addcard = card;
				
				//clause if card added to discard has number 8
				if(card.number == 8)
				{
					String nomsuit = ""; //readuserinput, check if valid or not.
					addcard = new Card(nomsuit, 8);
					//output original card and output nominated suit if necesary
					
					
				}
				
				discardpile.addtoTop(addcard);
				
				return true;
			}
			
			else 
				return false;

	}
	
	public void emptyturn (Pile drawingpile, Pile discardpile)
	{
		hand.addtoTop(drawingpile.topCard());
		drawingpile.draw();
	}
	
	public void makemove()
	{
		return;
	}


}
