package za.co.itlab.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import za.co.itlab.dto.CardRequest;
import za.co.itlab.dto.CardUsageResponse;

@Component
public class EnrolmentProcessor implements Processor {

	@Override
	public void process(Exchange request) throws Exception {
		CardRequest cardRequest = (CardRequest) request.getIn().getBody();
		cardRequest.setAccount("1234");
		CardUsageResponse cardUsageResponse = new CardUsageResponse();
		cardUsageResponse.setAccountId("1234");
		request.getIn().setBody(cardUsageResponse);
	}

}
