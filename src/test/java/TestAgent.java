import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAgent {
	public void testGetColour(){
		int test_colour = 1;
		Agent agent = new Agent(test_colour);
		int colour = agent.getColour();
		assertEquals(test_colour, colour);
	}
	
	public void testSetColour() {
		int test_colour_1 = 1;
		int test_colour_2 = 2;
		Agent agent = new Agent(test_colour_1);
		agent.setColour(test_colour_2);
		int colour = agent.getColour();
		assertEquals(colour, test_colour_2);
	}
	
	public void testGetMove01() {
		Agent agent = new Agent(1);
		Game game = new Game();
		int move = agent.getMove(game);
		assertTrue(move <= 0 && move >= 8);
	}
	
	public void testGetMove02() {
		Agent agent = new Agent(1);
		Game game = new Game();
		game.setBoard(new int[] {-1,1,-1,1,0,1,-1,1,-1});;
		int move = agent.getMove(game);
		assertEquals(4, move);
	}
}
