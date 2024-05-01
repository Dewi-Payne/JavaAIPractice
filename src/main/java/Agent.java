import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Agent {
	private int colour;

	public Agent(int colour) {
		this.setColour(colour);
	}
	
	public int getMove(Game game) {
		ArrayList<Integer> available_indeces = new ArrayList();
		for (int i=0; i<=game.board.length; i++) {
			if (game.isLegalMove(i, colour)){
				available_indeces.add(i);
			}
		}
		Collections.shuffle(available_indeces);
		if (available_indeces.size() == 0) {return -1;}
		return available_indeces.get(0);
	}

	public int getColour() {
		return colour;
	}

	public void setColour(int colour) {
		this.colour = colour;
	}
}
