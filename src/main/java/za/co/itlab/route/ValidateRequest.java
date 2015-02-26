package za.co.itlab.route;

import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import za.co.itlab.dto.CardRequest;

@Component
public class ValidateRequest {

	@Handler
	public void process(CardRequest request) throws Exception {
		if (request.getTransactionId() == 0) {
			throw new Exception("Invalid Request");
		}
	}
}
