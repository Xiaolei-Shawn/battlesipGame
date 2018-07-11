/**
 * 
 */
package application.domain;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import application.BoardGameHubLauncher;

/**
 * @author xiaolei.shawn
 *
 */
public class BattleshipBoard extends Board {

	private Integer turns;
	private Integer targets;
	private Integer turnsleft;
	public Integer getTurnsleft() {
		return turnsleft;
	}

	public void setTurnsleft(Integer turnsleft) {
		this.turnsleft = turnsleft;
	}

	public Integer getTurns() {
		return turns;
	}

	public void setTurns(Integer turns) {
		this.turns = turns;
	}

	public Integer getTargets() {
		return targets;
	}

	public void setTargets(Integer targets) {
		this.targets = targets;
	}

	@Override
	public BattleshipBoard initBoard(String source) {
		ObjectMapper objectMapper = new ObjectMapper();
		InputStream is = BoardGameHubLauncher.class.getResourceAsStream(source);
		BattleshipBoard board = null;
		try {
			board = objectMapper.readValue(is, BattleshipBoard.class);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		setTurnsleft(board.getTurns());
		return board;
	}

	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
