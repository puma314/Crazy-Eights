public class Card
{
	
	public String suit;
	public int number;
	
	Card(String suit, int number)
	{
		
		this.suit = suit;
		this.number = number;
		
	}
	
	public boolean equals(Card card1, Card card2)
	{
		if (card1.suit.equals(card2.suit) && card1.number == card2.number)
			return true;
		
		return false;
	}
	
	//implement tostring method
	
	
}