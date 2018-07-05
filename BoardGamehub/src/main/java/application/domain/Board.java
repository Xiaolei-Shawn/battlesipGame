/**
 * 
 */
package application.domain;

import java.util.List;

/**
 * @author XiaDu
 *
 */
public abstract class Board {

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}

	private List<String> rows;
	
	public abstract Board initBoard(String level);
	
	public abstract void draw(int x, int y);

}
