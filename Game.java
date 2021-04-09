import java.util.logging.Logger;

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
			System.out.println("Waiting for the second player...");
		} else if (players[1] == null) {  // Add the second player
			players[1] = player;
			mainloop(); // Start the actual game
		} else {
			throw new ArrayIndexOutOfBoundsException("Only 2 players can play at once");
		}
	}
	
	public void mainloop() {
		System.out.println("Game started with " + players[0] + " and " + players[1]);
		int turnNum = 0;
		while (stickCount > 0) {
			int removeSticks = players[turnNum % 2].makeMove(stickCount);
			if (removeSticks < 1 || removeSticks > 3)  // Ensure the player only removes 0-3 sticks
				throw new AssertionError(players[turnNum % 2].toString() + " can only remove 1-3 sticks, tried to remove " + removeSticks);
			if (stickCount - removeSticks < 0) {
				Logger logger = Logger.getLogger("");
		        logger.warning(String.format("Cannot remove more sticks (%d) than avalible (%d), retrying...", removeSticks, stickCount));
		        continue;
			}
			stickCount -= removeSticks;
			System.out.println(String.format("%s removed %d stick%s, %d remaining",
					players[turnNum  % 2], removeSticks, removeSticks > 1 ? "s" : "", stickCount));
			turnNum++;
		}
		
		System.out.println("Game over in " + turnNum + " moves, " + players[turnNum % 2] + " won!");
		players[turnNum % 2].won();
	}
}
