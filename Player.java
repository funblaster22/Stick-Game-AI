
public abstract class Player {
	public void play(Game game) {
		game.registerPlayer(this);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
	public abstract int makeMove();
}
