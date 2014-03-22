import java.util.Scanner;
public class Player 
{
	public Pile hand;
	public String name;
	
	//works
	Player()
	{
		hand = new Pile();
		name = "";
	}
	
	Player(String name)
	{
		hand = new Pile();
		this.name = name;
	}
	
	//works
	public void addtoHand(Card card)
	{
		hand.addtoTop(card);
	}
	
	
	//works
	public String toString()
	{
		String temp = name + " has the following cards: \n"; 
		
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
		Scanner scturn = new Scanner(System.in);
		//System.out.println("entered turn func");
		
		if(hand.indexOf(card) == -1)
		{
			System.out.println("Card is not in hand!");
			return false;
		}
		
		//System.out.println("Passed the check to see if in hand");
		//System.out.println(hand.indexOf(card));
		//case of if top card is 8 is implicitly taken care of.
			
		if(card.suit.equals(discardpile.topCard().suit) || card.number == discardpile.topCard().number)
			{
				
				//hand.remove(hand.indexOf(card));
				hand.remove(card);
				System.out.println(card + " was placed in the discard pile.");
				Card addcard = card;
				
				//clause if card added to discard has number 8
				if(card.number == 7)
				{
					System.out.println("Looks like you played an 8. Tell us which suit you would like to nominate: ");
					String nomsuit = scturn.nextLine(); //read user input
					System.out.println("The nominated suit is: " + nomsuit);
					addcard = new Card(nomsuit, 7);
							
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
		System.out.println(this.name + " just drew from the drawing pile. Nothing was added to the discard pile.");
		hand.addtoTop(drawingpile.topCard());
		drawingpile.draw();
		System.out.println(this);
		
	}
	
	
	//so that inheritance works
	public void makemove(Pile drawingpile, Pile discardpile)
	{
		System.out.println("Entered player makemove");
		
		
		return;
	}


}
