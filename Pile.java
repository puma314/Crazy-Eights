import java.util.*;

//Drawing pile and discard pile are both types of piles. 
//convention is that 0 is at top of pile and last index is at bottom.
//Deck is also a type of pile.

public class Pile 

{
	List<Card> cards; //array of cards
	
	
	Pile()
	{
		cards = new ArrayList<Card>();
	}
	
	public void addtoBottom (Card card)
	{
		cards.add(card);
	}
	
	public void addtoTop (Card card)
	{
		cards.add(0,card);
	}
	
	
	
	public Card draw() //default draws top card
	
	{
		Card temp = cards.get(0);
		cards.remove(0);
		
		return temp;
		
		
	}
	
	public int indexOf(Card card) 
	{
	    for (int i=0; i< cards.size(); i++)
	    {
	    	if (card.equals(cards.get(i)))
	    		return i;
	    }
	    
	    return -1;
	}
	
	public void remove(Card card)
	{
		cards.remove(cards.indexOf(card));
	}
	

	public Card topCard()
	{
		return cards.get(0);
	}
	
	public void shuffle()
	{
		List<Card> temp = new ArrayList<Card>();
		
		for(int i=0; i<cards.size(); i++)
		{
			
			int index = (int)(Math.random()*cards.size());
			temp.add(cards.get(index));
			cards.remove(index);
		}
		
		cards = temp;	
		
	}
	
	
	
}
