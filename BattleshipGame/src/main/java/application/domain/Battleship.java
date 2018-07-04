/**
 * 
 */
package application.domain;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author XiaDu
 *
 */
public class Battleship extends Game{
	
	private Integer turnsleft;
	private Board board;
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Integer getTurnsleft() {
		return turnsleft;
	}

	public void setTurnsleft(Integer turnsleft) {
		this.turnsleft = turnsleft;
	}


	@Override
	public void loadBoard(String level) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		InputStream is = Battleship.class.getResourceAsStream(level);
		Board board = null;
		try {
			board = objectMapper.readValue(is, Board.class);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			is.close();
		}

		this.setBoard(board);
	}

}
