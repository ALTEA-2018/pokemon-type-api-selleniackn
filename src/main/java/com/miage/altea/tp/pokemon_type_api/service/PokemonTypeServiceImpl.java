package com.miage.altea.tp.pokemon_type_api.service;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepository;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService{
    @Autowired
    public  PokemonTypeRepository pokemonTypeRepository;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository){
       this.pokemonTypeRepository = pokemonTypeRepository;
    }

    @Override
    public PokemonType getPokemonType(int id) {
        PokemonType pokemonById = pokemonTypeRepository.findPokemonTypeById(id);
        return pokemonById;
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        List<PokemonType> listPokemon = pokemonTypeRepository.findAllPokemonType();
        return listPokemon;
    }
}