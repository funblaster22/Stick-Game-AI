
public class DumbAI extends Player {
	@Override
	public int makeMove() {
		return (int)(Math.random() * 3) + 1;
	}

}
