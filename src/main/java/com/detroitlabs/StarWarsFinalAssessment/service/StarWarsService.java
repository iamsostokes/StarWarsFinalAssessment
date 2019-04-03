package com.detroitlabs.StarWarsFinalAssessment.service;

import com.detroitlabs.StarWarsFinalAssessment.model.StarWarsCharacter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StarWarsService {

    public StarWarsCharacter fetchAllCharacters() {
        System.setProperty("http.agent", "StarWars");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://swapi.co/api/films/2", StarWarsCharacter.class);
    }

    public StarWarsCharacter fetchCharacterDetails(int characterID) {
        System.setProperty("http.agent", "StarWars");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://swapi.co/api/people/" + characterID + "/", StarWarsCharacter.class);
    }

}
