
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		new Human().play(game);
		new AI().play(game);
	}
}
