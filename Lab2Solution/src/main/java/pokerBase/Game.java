package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	
	private UUID GameID;
	private int TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID gameID, int tableID, ArrayList<Player> gamePlayers) {
		super();
		GameID = gameID;
		TableID = tableID;
		GamePlayers = gamePlayers;
	}
	
	public UUID getGameID() {
		return GameID;
	}
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}
	public int getTableID() {
		return TableID;
	}
	public void setTableID(int tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	public void AddPlayerToGame(Table t, Player p){
		t.AddPlayerToTable(p);
	}
}
