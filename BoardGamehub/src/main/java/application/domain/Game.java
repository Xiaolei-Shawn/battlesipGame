/**
 * 
 */
package application.domain;

import java.io.IOException;

/**
 * @author XiaDu
 *
 */
public abstract class Game {

	public abstract Board loadBoard(String level) throws IOException;
}
