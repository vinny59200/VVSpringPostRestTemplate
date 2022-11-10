package com.vv.pocRestTemplate.controller;

import com.vv.pocRestTemplate.Model.Joke;
import com.vv.pocRestTemplate.client.JokeClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping( "/api/jokes" )
public class JokeController {

    @Autowired
    private JokeClient jokeClient;

    @PostMapping
    public Joke postOneJoke() {
        return jokeClient.saveNewJoke2( Joke.builder()
                                            .id( 11L )
                                            .content( "Moving to Paris would be In-Seine." )
                                            .build() );
    }


    //    @GetMapping
    //    public List<Joke> getAllJokes() {
    //        return jokeDao.findAll();
    //    }
    //
    //    @GetMapping( "/{id}" )
    //    public ResponseEntity<Joke> getJokeById( @PathVariable( value = "id" ) Long jokeId ) {
    //
    //        Joke joke = jokeDao.findById( jokeId )
    //                           .orElseThrow( () -> new NoSuchElementException( "Joke not availbele for Id :" + jokeId ) );
    //
    //        return ResponseEntity.ok()
    //                             .body( joke );
    //    }
    //
    //    @PostMapping
    //    public Joke createJoke( @Valid @RequestBody Joke joke ) {
    //
    //        System.out.println( joke ); // Just to inspect values for demo
    //        return jokeDao.save( joke );
    //    }

}