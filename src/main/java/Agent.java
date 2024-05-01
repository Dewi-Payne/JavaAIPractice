import java.util.Random;

public class Agent {
	private int colour;

	public Agent(int colour) {
		this.setColour(colour);
	}
	
	public int getMove(Game game) {
		int rnd = new Random().nextInt(game.board.length) -1;
		if (game.isLegalMove(rnd, colour)){
			return rnd;
		}
		return getMove(game);
	}

	public int getColour() {
		return colour;
	}

	public void setColour(int colour) {
		this.colour = colour;
	}
}
