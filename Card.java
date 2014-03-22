//class tested and works.
public class Card
{
	
	public String suit;
	public int number;
	
	Card(String suit, int number)
	{
		
		this.suit = suit;
		this.number = number;
		
	}
	
	//function works
	public boolean equals(Card card1)
	{
		if (suit.equals(card1.suit) && number == card1.number)
			return true;
		
		return false;
	}
	
	//function works
	public String toString()
	{
		return (number + " of " + suit );
		
		
	}
	
	
}