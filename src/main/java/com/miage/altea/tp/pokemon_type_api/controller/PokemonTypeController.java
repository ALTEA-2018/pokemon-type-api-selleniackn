package com.miage.altea.tp.pokemon_type_api.controller;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.service.PokemonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping(value = "/pokemon-types")
class PokemonTypeController {

    public PokemonTypeService service;
    @Autowired
    public PokemonTypeController(PokemonTypeService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    PokemonType getPokemonTypeFromId(int id){
        PokemonType pokeId = service.getPokemonType(id);
        return pokeId;

    }

    @GetMapping(value = "/")
    public List<PokemonType> getAllPokemonTypes() {
        List<PokemonType> listPoke = service.getAllPokemonTypes();
        return listPoke;

    }
}



