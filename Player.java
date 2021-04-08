
public abstract class Player {
	private final int ID;
	
	public Player(int ID) {
		this.ID = ID;
	}
	
	public void play(Game game) {
		game.registerPlayer(this);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ID;
	}
	
	public abstract int makeMove();
}
