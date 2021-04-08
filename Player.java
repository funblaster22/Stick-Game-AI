
public abstract class Player {
	private final int ID;
	
	public Player(int ID) {
		this.ID = ID;
	}
	
	public Player() {
		this.ID = (int)(Math.random() * 99) + 1;
	}
	
	public void play(Game game) {
		game.registerPlayer(this);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ID;
	}
	
	/**
	 * Performs any logic necessary to determine the next move to make for this Player
	 * @return number 1-3 representing how many sticks to remove
	 */
	public abstract int makeMove(int sticksRemaining);
	
	/** An optional function that tells the Player what to do if it has won */
	public void won() {}
}
