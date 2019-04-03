package com.detroitlabs.StarWarsFinalAssessment.controller;

import com.detroitlabs.StarWarsFinalAssessment.model.StarWarsCharacter;
import com.detroitlabs.StarWarsFinalAssessment.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StarWarsController {

    @Autowired
    StarWarsService starWarsService;

    @RequestMapping("/")
    public String displayStarWarsEpisode5Page(ModelMap modelMap) {
        StarWarsCharacter starWarsCharacter = starWarsService.fetchAllCharacters();
        setEmpireStrikesBackCharacters(modelMap);




        return "home";
    }

    public void setEmpireStrikesBackCharacters(ModelMap modelMap) {
        modelMap.put("luke", starWarsService.fetchCharacterDetails(1));
        starWarsService.fetchCharacterDetails(2);
        starWarsService.fetchCharacterDetails(3);
        starWarsService.fetchCharacterDetails(4);
        starWarsService.fetchCharacterDetails(5);
        starWarsService.fetchCharacterDetails(10);
        starWarsService.fetchCharacterDetails(13);
        starWarsService.fetchCharacterDetails(14);
        starWarsService.fetchCharacterDetails(18);
        starWarsService.fetchCharacterDetails(20);
        starWarsService.fetchCharacterDetails(21);
        starWarsService.fetchCharacterDetails(22);
        starWarsService.fetchCharacterDetails(23);
        starWarsService.fetchCharacterDetails(24);
        starWarsService.fetchCharacterDetails(25);
        starWarsService.fetchCharacterDetails(26);
    }




}
