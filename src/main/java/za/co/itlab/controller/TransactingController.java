/**
 * 
 */
package za.co.itlab.controller;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.apache.logging.log4j.core.appender.routing.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.itlab.dto.CardRequest;
import za.co.itlab.dto.CardUsageResponse;

/**
 * @author poovanpillay
 *
 */
@RestController
@RequestMapping("/card")
public class TransactingController {
	
	@Autowired
	private CamelContext camelContext;

	
	@RequestMapping(value="/get", method = RequestMethod.POST,produces="application/json", consumes="application/json")
	public CardUsageResponse validateRequest(@RequestBody CardRequest request) {
		ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
		CardUsageResponse response =(CardUsageResponse) producerTemplate.sendBody("direct:validate",ExchangePattern.InOut,request );
		return response;
		
	}
}
