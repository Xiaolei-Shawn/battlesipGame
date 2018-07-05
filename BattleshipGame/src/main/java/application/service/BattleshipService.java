/**
 * 
 */
package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.domain.Game;
import application.gameFactory.GameFactory;

/**
 * @author XiaDu
 *
 */
@Service
public class BattleshipService {
	
	@Autowired
	GameFactory gameFactory;
	
	public Game startGame(String level) {
		return gameFactory.startGame("battleship", level);
	}

}
