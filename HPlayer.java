
public class HPlayer extends Player
{
	public void makemove(Pile discardpile, Pile drawingpile)
	{
		
		
		boolean move = true;
		
		{
		//ask uses for input and makes sure input is valid
		int indofinput = 0;
		{
			
				boolean draw = false;
				//ask if they want to enter card or draw from pile.
				if (draw == true)
				{
					emptyturn(discardpile, drawingpile);
					return;
				}
		
				String inputstring = ""; //ask for input
				int inputint = 0; // ask for input
		
				Card inputcard = new Card(inputstring, inputint);
		
				indofinput = hand.indexOf(inputcard);
				
		}while(indofinput == -1);
		
		move = turn(discardpile, drawingpile, hand.get(indofinput));
		
		}while(move == false);
		
		
	}
	

		
		
}
