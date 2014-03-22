
public class Player 
{
	public Pile hand;
	
	//works
	Player()
	{
		hand = new Pile();
	}
	
	
	//works
	public void addtoHand(Card card)
	{
		hand.addtoTop(card);
	}
	
	
	//works
	public String toString()
	{
		String temp = ""; 
		
		for(int i=0; i<hand.size(); i++)
			temp = temp+ hand.get(i) + "\n";
		
		return temp;
	}
	
	//works
	public void removefromHand(Card card)
	{
		hand.remove(card);
	}
	
	public boolean turn(Pile drawingpile, Pile discardpile, Card card)
	{
		System.out.println("entered turn func");
		
		if(hand.indexOf(card) == -1)
		{
			System.out.println("card not in hand");
			return false;
		}
		
		System.out.println("Passed the check to see if in hand");
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
	
	//works
	public void emptyturn (Pile drawingpile, Pile discardpile)
	{
		hand.addtoTop(drawingpile.topCard());
		drawingpile.draw();
	}
	
	
	//so that inheritance works
	public void makemove()
	{
		return;
	}


}
