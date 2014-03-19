public class SetofPlayers
{
	
	public Player[] players;
	
	SetofPlayers()
	{
		players = new Player[0];
	}
	
	SetofPlayers(int numplayers)
	{
		players = new Player[numplayers];
	}
	
	public void add(Player player)
	{
		Player[] temp = new Player[this.players.length+1];
		for(int i=0; i< players.length; i++)
			temp[i] = players[i];
		
		temp[players.length] = player;
		
		this.players = temp;
		
		                        
	}
}