package com.vv.pocRestTemplate.client;


import com.vv.pocRestTemplate.Model.Joke;
import com.vv.pocRestTemplate.Model.Json;
import com.vv.pocRestTemplate.Model.PostResponse;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class JokeClient {

    public final String JOKE_PATH_V1 = "https://httpbin.org/post ";

    private final RestTemplate restTemplate;

    public JokeClient( RestTemplateBuilder restTemplateBuilder ) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Joke saveNewJoke2( Joke joke ) {
        Json result = restTemplate.postForObject( JOKE_PATH_V1, joke, PostResponse.class )
                                  .getJson();
        return Joke.builder()
                   .id( Long.valueOf( result.getId() ) )
                   .content( result.getContent() )
                   .build();
    }
}
