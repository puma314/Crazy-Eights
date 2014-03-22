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
		String temp="";
		if(number==0)
			temp = "Ace of " + suit;
		if(number>0 && number<10)
			temp = (number+1) + " of " + suit;
		if(number == 10)
			temp = "Jack of " + suit;
		if(number == 11)
			temp = "Queen of " + suit;
		if(number == 12)
			temp = "King of " + suit;
		
		return temp;

		
		
	}
	
	
}