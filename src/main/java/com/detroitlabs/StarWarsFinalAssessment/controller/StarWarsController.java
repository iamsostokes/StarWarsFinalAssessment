package com.detroitlabs.StarWarsFinalAssessment.controller;

import com.detroitlabs.StarWarsFinalAssessment.model.StarWarsCharacter;
import com.detroitlabs.StarWarsFinalAssessment.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StarWarsController {

    @Autowired
    StarWarsService starWarsService;

    @RequestMapping("/")
    public String displayStarWarsEpisode5Page(ModelMap modelMap) {
        StarWarsCharacter starWarsCharacter = starWarsService.fetchAllCharacters();

        modelMap.put("title", starWarsCharacter.getTitle());
        return "home";
    }

}
