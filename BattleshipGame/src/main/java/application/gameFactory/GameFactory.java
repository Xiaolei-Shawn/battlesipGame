/**
 * 
 */
package application.gameFactory;

import java.io.IOException;

import application.domain.Battleship;
import application.domain.Game;

/**
 * @author XiaDu
 *
 */
public class GameFactory {
	
	public static Game startBattleship(String level) {
		Game battleship = new Battleship();
		
		try {
			battleship.loadBoard(level);
		} catch (IOException e) {
			System.err.println("Loading board failed!");
			e.printStackTrace();
		}
		return battleship;
	}

}
