
public class Game{
	public int[] board = {0,0,0,0,0,0,0,0,0};
	public int turn = 1;

	public boolean isLegalMove(int square, int player) {
		if (isGameEnded()) {return false;}
		if (player != this.turn) {return false;}
		return this.board[square] != 0;
	}
	
	public boolean isGameEnded() {
		for (int i=0; i<=6; i+=3) {
			if (this.board[i]==this.board[i+1] && this.board[i]==this.board[i+2] && this.board[i] != 0) {
				return true;
			}
		}
		for (int i=0; i<=3; i++) {
			if (this.board[i]==this.board[i+3] && this.board[i]==this.board[i+6]&& this.board[i] != 0) {
				return true;
			}
		}
		if (this.board[0]==this.board[4] && this.board[0] == this.board[8] && this.board[0] != 0) {
			return true;
		}
		if (this.board[2]==this.board[4] && this.board[2] == this.board[6] && this.board[2] != 0) {
			return true;
		}
		return false;
	}
	
	public void move(int square, int player) {
		if (this.isLegalMove(square, player)) {
			this.board[square] = player;
		}
	}
	
	public void changeTurn() {
		this.turn = this.turn *= -1;
	}
	
	public int[] getBoard(){
		return this.board;
	}
	
	public void setBoard(int[] newBoard) {
		this.board = newBoard;
	}
}
