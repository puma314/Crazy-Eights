import java.lang.Math;
import java.util.*;
import java.util.Scanner;


public class main
{
	
	public static void main(String[] args)
	{
		
		/*
		//test for card class
		Card test = new Card("SPADES", 13);
		Card test1 = new Card("SPADES", 12);
		Card test2 = new Card("SPADES", 10);
		

		Pile drawingpile = new Pile("full");
		Pile discardpile = new Pile();
		
		Player testplayer = new Player();
		
		testplayer.addtoHand(test);
		testplayer.addtoHand(test1);
		testplayer.addtoHand(test2);
		
		System.out.println(testplayer);
		
		drawingpile.shuffle();
		discardpile.addtoTop(drawingpile.topCard());
		drawingpile.draw();
		
		Card topcard = new Card("DIAMONDS", 9);
		
		discardpile.addtoTop(topcard);
		testplayer.addtoHand(topcard);
		
		
		System.out.println("The top card in the discard pile is: " + discardpile.topCard());
		
		
		Card movecard = new Card("DIAMONDS", 9);
		testplayer.turn(drawingpile, discardpile, movecard);
		
		System.out.print(discardpile + " \n // \n");
		System.out.print(drawingpile + " \n // \n");
		System.out.print(testplayer + " \n // \n"); */
		
		
		
		Scanner sc = new Scanner(System.in);
		Scanner scstring = new Scanner(System.in);
   
		System.out.println("Hello, welcome to the card game Crazy Eights!");	
		
		int numhplayers=0;
		System.out.println("How many human players do you want? Enter a number: "); 
		//get user input
		numhplayers = sc.nextInt();
		
		int numcplayers=0;
		System.out.println("How many computer players do you want? Enter a number: ");
		//get user input
		numcplayers = sc.nextInt();
		
		int totalplayers = numhplayers + numcplayers;		
		//totalplayers cannot be > 10
		
		Player[] setofplayers = new Player[totalplayers];
		
		for(int i=0; i<numcplayers; i++)
		{
			String name = "Computer Player number " + (i+1);
			CPlayer compplayer = new CPlayer(name);
			setofplayers[i] = compplayer;
			
		}
		
		for(int j=numcplayers; j<totalplayers; j++)
		{
			System.out.println("Enter the name of human player number " + (j-numcplayers + 1));
			String name = scstring.nextLine();		
			HPlayer humanplayer = new HPlayer(name);
			setofplayers[j] = humanplayer;
		}
		
		System.out.println("This is the order the players will go in from first to last: ");
		for(int i=0; i<totalplayers; i++)
		{
			System.out.println(setofplayers[i].name);
		}
		
		Pile drawingpile = new Pile("fulldeck");
		//System.out.print(drawingpile);
		Pile discardpile = new Pile();
		
		drawingpile.shuffle();
		
		//Gives each player 5 cards
		for(int i=0; i<5*totalplayers; i++)
		{
			
			setofplayers[i%totalplayers].addtoHand(drawingpile.topCard());
			drawingpile.draw();
		}
		
		//Adds the top card of the drawing pile to the discard pile
		discardpile.addtoTop(drawingpile.topCard());
		drawingpile.draw();
		
		System.out.println("The top card in the discard pile is: " + discardpile.topCard() + "\n");	
		
		/*for(int i=0; i<totalplayers; i++)
		{
			System.out.println(setofplayers[i]);
		}*/
		
		int playernum = 0;
		
		do {
			
			System.out.println("It is " + setofplayers[playernum%totalplayers].name + "'s move.");
			System.out.println("The top card in the discard pile is: " + discardpile.topCard());
			System.out.println(setofplayers[playernum%totalplayers]);
			setofplayers[playernum%totalplayers].makemove(drawingpile, discardpile);
			playernum++;
			
			for(int i=0; i < setofplayers.length; i++)
			{
				if(setofplayers[i].hand.size() == 0) //end game when 1 person had hand = 0 	
				{
					System.out.print("Player " + setofplayers[i].name + " has won!");
					return;
				
				}
			}
			
			//System.out.println(drawingpile.size());
		}while(drawingpile.size() > 0);
	
		System.out.println("The drawing pile is empty. The game is over.");
		
					
		
		
		
	}
	
}