
public class CPlayer extends Player
{
	public void makemove(Pile drawingpile, Pile discardpile)
	{

		
		int move=0; //move changes to 1 when move is made
		int index = -1;
		
		for(int i=0; i< hand.size(); i++)
		{
			if( hand.get(i).suit.equals(discardpile.topCard().suit) || (hand.get(i).number == discardpile.topCard().number))
			{
				index = i;
				turn(drawingpile, discardpile, hand.get(index));
				return;
			}				
		}
		
		//if index still = -1
		
		emptyturn(drawingpile, discardpile);
			
	
	}
}
