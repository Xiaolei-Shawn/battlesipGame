/**
 * 
 */
package application.gameFactory;

import java.io.IOException;
import java.util.function.BiFunction;

import org.springframework.stereotype.Component;

import application.domain.Battleship;
import application.domain.Game;

/**
 * @author XiaDu
 *
 */
@Component
public class GameFactory {

	public BiFunction<String, String, String> nameResolver = (game, level) -> "/" + game + "-" + level + ".json";

	public Game startGame(String gameName, String gameLevel) {
		switch (gameName) {
			case "battleship":
				return startBattleshipGame(nameResolver.apply(gameName, gameLevel));
			default:
				System.err.println("No game found.");
				return null;
		}
	}

	private Game startBattleshipGame(String source) {
		Game battleship = new Battleship();

		try {
			battleship.loadBoard(source);
		} catch (IOException e) {
			System.err.println("Loading board failed!");
			e.printStackTrace();
		}
		return battleship;

	}

}
