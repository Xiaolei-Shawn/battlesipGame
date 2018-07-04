/**
 * 
 */
package application.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.domain.Game;
import application.gameFactory.GameFactory;

/**
 * @author XiaDu
 *
 */
@RestController
public class HubController {

	@RequestMapping(method = RequestMethod.GET, path = "/battleship/{level}")
	public Game startBattleshipGame(@PathVariable("level") String level) {
		return GameFactory.startBattleship(level);
	}
}
