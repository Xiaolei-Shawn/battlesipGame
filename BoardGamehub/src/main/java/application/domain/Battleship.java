/**
 * 
 */
package application.domain;

/**
 * @author XiaDu
 *
 */
public class Battleship extends Game{
	
	
	private BattleshipBoard board;
	
	public Battleship (String source){
		this.board = loadBoard(source);
	}
	

	public BattleshipBoard getBoard() {
		return board;
	}

	public void setBoard(BattleshipBoard board) {
		this.board = board;
	}

	@Override
	public BattleshipBoard loadBoard(String source) {
		return new BattleshipBoard().initBoard(source);
	}

}
