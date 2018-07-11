/**
 * 
 */
package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.domain.Battleship;
import application.domain.BattleshipBoard;
import application.service.BattleshipService;

/**
 * @author XiaDu
 *
 */
@RestController
@RequestMapping("/battleship")
public class BattleshipController {
	
	@Autowired
	BattleshipService battleshipService;
	public static Battleship ongoingGame;

	@RequestMapping(method = RequestMethod.GET, path = "/{level}")
	public Battleship startBattleshipGame(@PathVariable("level") String level) {
		ongoingGame = battleshipService.startGame(level);
		return ongoingGame;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/shoot")
	public BattleshipBoard shoot(@RequestParam("x") Integer x, @RequestParam("y") Integer y) {
		return battleshipService.shootOccurs(ongoingGame.getBoard(), x, y);
	}
	
}
