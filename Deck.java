public class Deck
{
	public Card[] CardsinDeck;
	
	
	
	Deck()
	{
		
		for(int n=0; n<13; n++)
		{
			for(int m=0; m<4; m++)
			{
				CardsinDeck[n].number = (n+1);
				CardsinDeck[n].suit = Suit.shape[m];
			}
			
		}
	}
	
	//Ace is low (regarded as 1), face cards: J=11, Q=12, K=13
	
	
	public Deck Shuffle(Deck origdeck)
	{
		Deck shuffledeck = new Deck();
		
		
		
		return shuffledeck;
	}
	
}