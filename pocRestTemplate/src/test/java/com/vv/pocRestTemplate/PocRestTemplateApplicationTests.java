package com.vv.pocRestTemplate;

import com.vv.pocRestTemplate.Model.Joke;
import com.vv.pocRestTemplate.client.JokeClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PocRestTemplateApplicationTests {

	@Autowired
	JokeClient client;

	@Test
	void postShouldReturnJoke() {
		Joke joke = Joke.builder().id( 11L ).content( "Moving to Paris would be In-Seine." ).build();

		Joke result = client.saveNewJoke2( joke );

		Assertions.assertEquals( joke.getContent(), result.getContent() );
	}

}
