import java.util.Scanner;
public class HPlayer extends Player
{
	
	HPlayer(String name)
	{
		super(name);
	}
	

	public void makemove(Pile drawingpile, Pile discardpile)
	{
		Scanner scmove = new Scanner(System.in);
		boolean move = true;
		
		do {
		
		//this while loop ask uses for input and makes sure input is valid
		int indofinput = 0;
		do {
			
				if(indofinput == -1)
				{
					System.out.println("Looks like you entered a card that is not in your hand. Try again.");
				}
				boolean draw = false;
				System.out.println("Do you want to draw from the pile or enter a card to be played? ");
				String answer = scmove.nextLine();
				
				if(answer.equals("draw"))
					draw=true;
				else
					draw=false;
				
				if (draw == true)
				{
					emptyturn(drawingpile, discardpile);
					return;
				}
				
				//case where draw=false
				System.out.println("Enter the suit of the card you would like to be played: ");
				String inputstring = scmove.nextLine(); //ask for input
				System.out.println("Enter the number of the card you would like to be played: ");
				String inputint = scmove.nextLine(); // ask for input
				int inputintnum = -1;
				
				if(inputint.equals("Ace"))
				{
					inputintnum = 0;
				}
				else if(inputint.equals("Jack"))
				{
					inputintnum = 10;
				}
				else if(inputint.equals("Queen"))
				{
					inputintnum = 11;
				}
				else if(inputint.equals("King"))
				{
					inputintnum = 12;
				}
				else
				{
					inputintnum = Integer.parseInt(inputint);
					inputintnum = inputintnum - 1;
				}
		
				Card inputcard = new Card(inputstring, inputintnum);
		
				indofinput = hand.indexOf(inputcard);
				
		}while(indofinput == -1);
		
		move = turn(drawingpile, discardpile, hand.get(indofinput));
		if (move == false)
		{
			System.out.println("Looks like your card was in your hand but was not a valid move. Try again.");
		}
		
		}while(move == false);
		
		
	}
	

		
		
}
