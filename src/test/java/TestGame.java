import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestGame {
	@Test
	public void testIsLegalMove01(){
		Game game = new Game();
		assertTrue(game.isLegalMove(0, 1));
	}
	@Test
	public void testIsLegalMove02(){
		Game game = new Game();
		game.move(0, 1);
		game.move(1, -1);
		assertFalse(game.isLegalMove(2, -1));
		assertFalse(game.isLegalMove(1, 1));
	}
	@Test
	public void testIsGameEnded01(){
		Game game = new Game();
		game.move(0, 1);
		game.move(4, -1);
		game.move(1, 1);
		assertFalse(game.isGameEnded());
	}
	@Test
	public void testIsGameEnded02(){
		Game game = new Game();
		game.move(0, 1);
		game.move(4, -1);
		game.move(1, 1);
		game.move(7, -1);
		game.move(2, 1);
		assertTrue(game.isGameEnded());
	}
}
