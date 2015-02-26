package za.co.itlab.route;

import org.apache.camel.Processor;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidateRouteBuilder extends SpringRouteBuilder {

	@Autowired
	Processor enrolmentProcessor;
	
	@Override
	public void configure() throws Exception {
		from("direct:validate")
		.bean(ValidateRequest.class)
		.process(enrolmentProcessor)
		.end();
	}

}
