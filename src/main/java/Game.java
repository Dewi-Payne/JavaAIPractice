
public class Game{
	public int[] board = {0,0,0,0,0,0,0,0,0};
	public int turn = 1;

	public boolean isLegalMove(int square, int player) {
		if (isGameEnded()) {return false;}
		if (player != turn) {return false;}
		return board[square] != 0;
	}
	public boolean isGameEnded() {
		for (int i=0; i<=6; i+=3) {
			if (board[i]==board[i+1] && board[i]==board[i+2] && board[i] != 0) {
				return true;
			}
		}
		for (int i=0; i<=3; i++) {
			if (board[i]==board[i+3] && board[i]==board[i+6]&& board[i] != 0) {
				return true;
			}
		}
		if (board[0]==board[4] && board[0] == board[8] && board[0] != 0) {
			return true;
		}
		if (board[2]==board[4] && board[2] == board[6] && board[2] != 0) {
			return true;
		}
		return false;
	}
	public void move(int square, int player) {
		if (this.isLegalMove(square, player)) {
			board[square] = player;
		}
	}
}
