/**
 * 
 */
package application.domain;

/**
 * @author XiaDu
 *
 */
public class Battleship extends Game{
	
	private Integer turnsleft;
	private BattleshipBoard board;
	
	public Battleship (String source){
		this.board = loadBoard(source);
		this.turnsleft = this.board.getTurns();
	}

	public Integer getTurnsleft() {
		return turnsleft;
	}

	public void setTurnsleft(Integer turnsleft) {
		this.turnsleft = turnsleft;
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
