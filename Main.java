import java.util.Scanner;

public class Main {
	public static final int ITERS = 100;
	public static final int STARTING_STICK_COUNT = 20;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many humans are playing? (0-2, 0=train)");
		System.out.print("?:  ");
		int players = input.nextInt();
		
		for (int i=0; i<ITERS; i++) {
			Game game = new Game(STARTING_STICK_COUNT);
			if (players >= 1) {
				new Human(1).play(game);
				if (players == 2) new Human(2).play(game);
			}
			if (players <= 1) {
				new AI(1, STARTING_STICK_COUNT).play(game);
				if (players == 0) new AI(2, STARTING_STICK_COUNT).play(game);
			}
			if (players < 0 || players > 2)
				throw new AssertionError("Only 0-2 players can play");
			System.out.println();
		}
	}
}
