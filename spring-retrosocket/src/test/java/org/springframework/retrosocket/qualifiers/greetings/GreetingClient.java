package org.springframework.retrosocket.qualifiers.greetings;

import static org.springframework.retrosocket.qualifiers.Constants.QUALIFIER_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.retrosocket.RSocketClient;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@RSocketClient
@Qualifier(QUALIFIER_2)
public interface GreetingClient {

	@MessageMapping("greetings-with-name")
	Mono<Greeting> greetMono(Mono<String> name);

}
