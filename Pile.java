import java.util.*;


public class Pile 

{
	List<Card> cards; //array of cards
	
	
	//works
	Pile()
	{
		cards = new ArrayList<Card>();
	}
	
	//works
	public Card get(int i)
	{
		if(i < 0 || i >= cards.size())
		{
			Card temp = new Card("0",0);
			return temp;
		}
		
		return cards.get(i);
	}
	
	//works
	public int size()
	{
		return cards.size();
	}
	
	//works
	public void addtoBottom (Card card)
	{
		cards.add(card);
	}
	
	//works
	public void addtoTop (Card card)
	{
		cards.add(0,card);
	}
	
	//works
	public Card topCard()
	{
		
		if(cards.isEmpty())
		{
			Card temp = new Card("0",0);
			return temp;
		}
		
	
			return cards.get(0);
		
	}
	
	public Card draw() //default draws top card
	
	{
		if(cards.isEmpty())
		{
			Card temp = new Card("0",0);
			return temp;
		}
		
		
		Card temp = cards.get(0);
		cards.remove(0);
		
		return temp;	
		
	}
	
	public int indexOf(Card card) 
	{
		//System.out.println("etnered indexof");
	    for (int i=0; i< cards.size(); i++)
	    {
	    	if (card.equals(cards.get(i)))
	    		return i;
	    }
	    
	   //System.out.println("Will return -1");
	    
	    return -1;
	}
	
	public void remove(Card card)
	{
		//System.out.println("Entered remove");
		indexOf(card);
		//System.out.println("After caalling index of");
		//System.out.println(indexOf(card));
		cards.remove(indexOf(card));
	}
	
	public void remove(int i)
	{
		cards.remove(i);
	}
	

	public void shuffle()
	{
		List<Card> temp = new ArrayList<Card>();
		
		//System.out.println("Cards size is:" + cards.size());
		
		int cardssize = cards.size();
		
		for(int i=0; i<cardssize; i++)
		{
			
			int index = (int)(Math.random()*cards.size());
			//System.out.println(index);
			temp.add(cards.get(index));
			cards.remove(index);
			
			//System.out.println("end of for loop it");
			
		}
		
		cards = temp;	
		
	}
	
	Pile(String fulldeck) //makes full deck
	{
		
		cards = new ArrayList<Card>();
		
		String[] suits = new String[4];
		suits[0] = "HEARTS";
		suits[1] = "DIAMONDS";
		suits[2] = "CLUBS";
		suits[3] = "SPADES";
		
		for(int n=0; n<13; n++)
		{
			for(int m=0; m<4; m++)
			{
				cards.add(new Card(suits[m], n));
			}
			
		}
	}
	
	public String toString()
	{
		String temp = "";
		for(int i=0; i<cards.size(); i++)
			temp = temp + cards.get(i) + "\n";
		
		return temp;
	}

	
	
	
	

	
	
	
	
}
