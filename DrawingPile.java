public class DrawingPile

{
	
	
	Deck deck;
	
	DrawingPile()
	{
		deck = new Deck();
	}
	
	public void shuffle()
	{
		Deck temp;
		temp = deck.Shuffle(deck);
		deck = temp;
		
	}


	
	
}