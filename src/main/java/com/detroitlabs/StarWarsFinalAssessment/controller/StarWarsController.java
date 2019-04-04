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
        setEmpireStrikesBackCharacters(modelMap);
        return "home";
    }

    @RequestMapping("/finalDetail")
    public String displayCharacterDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "details";
    }

    @RequestMapping("/C3PODetails")
    public String displayC3PODetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "c3podetails";
    }

    @RequestMapping("/R2D2Details")
    public String displayR2D2Details(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "r2d2details";
    }

    @RequestMapping("/DarthDetails")
    public String displayDarthDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "darthdetails";
    }

    @RequestMapping("/LeiaDetails")
    public String displayLeiaDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "leiadetails";
    }

    @RequestMapping("/ObiWanDetails")
    public String displayObiWanDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "obiWandetails";
    }

    @RequestMapping("/ChewbaccaDetails")
    public String displayChewbaccaDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "chewbaccadetails";
    }

    @RequestMapping("/HanDetails")
    public String displayHanDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "handetails";
    }

    @RequestMapping("/WedgeDetails")
    public String displayWedgeDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "wedgedetails";
    }

    @RequestMapping("/YodaDetails")
    public String displayYodaDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "yodadetails";
    }

    @RequestMapping("/PalpatineDetails")
    public String displayPalpatineDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "palpatinedetails";
    }

    @RequestMapping("/BobaDetails")
    public String displayBobaDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "bobadetails";
    }

    @RequestMapping("/IG88Details")
    public String displayIG88Details(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "ig88details";
    }

    @RequestMapping("/BosskDetails")
    public String displayBosskDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "Bosskdetails";
    }

    @RequestMapping("/LandoDetails")
    public String displayLandoDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "Landodetails";
    }

    @RequestMapping("/LobotDetails")
    public String displayLobotDetails(ModelMap modelMap) {
        setEmpireStrikesBackCharacters(modelMap);
        setCharactersHomeWorld(modelMap);
        return "Lobotdetails";
    }

    public void setEmpireStrikesBackCharacters(ModelMap modelMap) {
        modelMap.put("luke", starWarsService.fetchCharacterDetails(1));
        modelMap.put("C3PO", starWarsService.fetchCharacterDetails(2));
        modelMap.put("R2D2", starWarsService.fetchCharacterDetails(3));
        modelMap.put("Darth", starWarsService.fetchCharacterDetails(4));
        modelMap.put("Leia", starWarsService.fetchCharacterDetails(5));
        modelMap.put("ObiWan", starWarsService.fetchCharacterDetails(10));
        modelMap.put("Chewbacca", starWarsService.fetchCharacterDetails(13));
        modelMap.put("Han", starWarsService.fetchCharacterDetails(14));
        modelMap.put("Wedge", starWarsService.fetchCharacterDetails(18));
        modelMap.put("Yoda", starWarsService.fetchCharacterDetails(20));
        modelMap.put("Palpatine", starWarsService.fetchCharacterDetails(21));
        modelMap.put("Boba", starWarsService.fetchCharacterDetails(22));
        modelMap.put("IG88", starWarsService.fetchCharacterDetails(23));
        modelMap.put("Bossk", starWarsService.fetchCharacterDetails(24));
        modelMap.put("Lando", starWarsService.fetchCharacterDetails(25));
        modelMap.put("Lobot", starWarsService.fetchCharacterDetails(26));
    }

    public void setCharactersHomeWorld(ModelMap modelMap) {
        modelMap.put("lukeWorld", starWarsService.fetchHomeWorldDetails(1));
        modelMap.put("C3POWorld", starWarsService.fetchHomeWorldDetails(2));
        modelMap.put("R2D2World", starWarsService.fetchHomeWorldDetails(3));
        modelMap.put("DarthWorld", starWarsService.fetchHomeWorldDetails(4));
        modelMap.put("LeiaWorld", starWarsService.fetchHomeWorldDetails(5));
        modelMap.put("ObiWanWorld", starWarsService.fetchHomeWorldDetails(10));
        modelMap.put("ChewbaccaWorld", starWarsService.fetchHomeWorldDetails(13));
        modelMap.put("HanWorld", starWarsService.fetchHomeWorldDetails(14));
        modelMap.put("WedgeWorld", starWarsService.fetchHomeWorldDetails(18));
        modelMap.put("YodaWorld", starWarsService.fetchHomeWorldDetails(20));
        modelMap.put("PalpatineWorld", starWarsService.fetchHomeWorldDetails(21));
        modelMap.put("BobaWorld", starWarsService.fetchHomeWorldDetails(22));
        modelMap.put("IG88World", starWarsService.fetchHomeWorldDetails(23));
        modelMap.put("BosskWorld", starWarsService.fetchHomeWorldDetails(24));
        modelMap.put("LandoWorld", starWarsService.fetchHomeWorldDetails(25));
        modelMap.put("LobotWorld", starWarsService.fetchHomeWorldDetails(26));
    }

//    private String determineDetails(StarWarsCharacter starWarsCharacter) {
//       if(starWarsCharacter.getName().equals(starWarsService.fetchCharacterDetails(1).getName())) {
//           return "LukeDetails";
//       } else if (starWarsCharacter.getName().equals(starWarsService.fetchCharacterDetails(2).getName())){
//           return "C3PODetails";
//       } else return "/";
//
//    }




}
