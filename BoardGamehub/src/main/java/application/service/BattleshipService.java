/**
 * 
 */
package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.domain.Battleship;
import application.domain.BattleshipBoard;
import application.gameFactory.GameFactory;

/**
 * @author XiaDu
 *
 */
@Service
public class BattleshipService {
	
	@Autowired
	GameFactory gameFactory;
	
	public Battleship startGame(String level) {
		return (Battleship) gameFactory.startGame("battleship", level);
	}

	public BattleshipBoard shootOccurs(BattleshipBoard gameBoard, Integer x, Integer y) {
		if(gameBoard.getTurnsleft() < 1) {
			//Game over
			return gameoverBoard();
		}
		return null;
	}

	private BattleshipBoard gameoverBoard() {
		// TODO Auto-generated method stub
		return null;
	}

}
