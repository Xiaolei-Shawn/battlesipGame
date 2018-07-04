/**
 * 
 */
package application.domain;

import java.util.List;

/**
 * @author XiaDu
 *
 */
public class Board {
	
	private Integer turns;
	private Integer targets;
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

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}

	private List<String> rows;
	
	public Board initBoard() {
		return null;
	}
	
	public void draw(int x, int y) {
		
	}

}
