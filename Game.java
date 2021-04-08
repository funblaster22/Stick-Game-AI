public class Game {
	private int stickCount;
	private Player[] players = new Player[2];
	
	public Game() {
		this(20);
	}
	
	public Game(int startingStickCount) {
		this.stickCount = startingStickCount;
	}
	
	public void registerPlayer(Player player) {
		if (players[0] == null) { // Add the first player
			players[0] = player;
		} else if (players[1] == null) {  // Add the second player
			players[1] = player;
			mainloop(); // Start the actual game
		} else {
			throw new ArrayIndexOutOfBoundsException("Only 2 players can play at once");
		}
	}
}
