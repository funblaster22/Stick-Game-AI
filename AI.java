import java.util.ArrayList;

/** This AI is Capable of training itself and play against itself at the same time.
 * Contributors: add your name to this header
 *  
 * @author Ethan Dawes
 */
public class AI extends Player {
	private static ArrayList<Integer>[] bestBrainMatrix;
	private ArrayList<Integer>[] brainMatrix;

	public AI(int ID, int startingSticks) {
		super(ID);
		if (bestBrainMatrix == null) {
			bestBrainMatrix = new ArrayList[startingSticks];
			for (int i=0; i<bestBrainMatrix.length; i++) {
				bestBrainMatrix[i] = new ArrayList<Integer>();
				bestBrainMatrix[i].add(1);
				bestBrainMatrix[i].add(2);
				bestBrainMatrix[i].add(3);
			}
		}
		brainMatrix = bestBrainMatrix.clone();
		// In the brain matrix, TODO: explain structure
	}
	
	private void printMatrix() {
		System.out.println(brainMatrix);
		int i = 0;
		for (ArrayList<Integer> hat : brainMatrix) {
			System.out.println("    " + i++ + ": " + hat);
		}
	}

	@Override
	public int makeMove(int sticksRemaining) {
		// TODO implement your code HERE
		
		return 1;
	}
	
	@Override
	public void won() {
		System.out.print(this.toString() + " winning brain matrix:  ");
		printMatrix();
		bestBrainMatrix = brainMatrix;
	}

}
