/**
 * 
 */
package application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaDu
 *
 */
@RestController
public class HubController {
	
	@Value("${hub.games}")
	private String[] games;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String[] launchGameHub() {
		return games;
	}

}
