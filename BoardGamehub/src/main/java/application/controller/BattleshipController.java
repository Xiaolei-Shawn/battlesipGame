/**
 * 
 */
package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.domain.Battleship;
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

	@RequestMapping(method = RequestMethod.GET, path = "/{level}")
	public Battleship startBattleshipGame(@PathVariable("level") String level) {
		return (Battleship) battleshipService.startGame(level);
	}

}