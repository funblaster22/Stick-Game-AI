import java.util.Scanner;

public class Human extends Player {
	private static Scanner input = new Scanner(System.in);
	
	public Human(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int makeMove(int sticksRemaining) {
		System.out.print("How many sticks to remove (1-3):  ");
		return input.nextInt();
	}

}
