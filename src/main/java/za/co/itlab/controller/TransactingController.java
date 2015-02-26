/**
 * 
 */
package za.co.itlab.controller;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




/**
 * @author poovanpillay
 *
 */
@RestController
public class TransactingController {
	
	@Autowired
	private CamelContext camelContext;

	@RequestMapping(value="/greeting", method = RequestMethod.GET,produces="application/json")
	Boolean home() {
		if (camelContext == null) 
			return  false; 
	    else return true;
		
	}
}
