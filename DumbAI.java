
public class DumbAI extends Player {
	@Override
	public int makeMove(int sticksRemaining) {
		return (int)(Math.random() * 3) + 1;
	}

}
