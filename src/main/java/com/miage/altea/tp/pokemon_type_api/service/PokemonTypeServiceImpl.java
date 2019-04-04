package com.miage.altea.tp.pokemon_type_api.service;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepository;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepositoryImpl;
import com.miage.altea.tp.pokemon_type_api.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService{
    @Autowired
    public  PokemonTypeRepository pokemonTypeRepository;
    public TranslationRepository translationRepository;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository,TranslationRepository translationRepository){
       this.pokemonTypeRepository = pokemonTypeRepository;
        this.translationRepository =translationRepository;
    }

    public PokemonTypeServiceImpl() {

    }

    @Override
    public PokemonType getPokemonType(int id) {
        PokemonType pokemonById = pokemonTypeRepository.findPokemonTypeById(id);
        return pokemonById;
    }

    @Override
    public PokemonType getPokemonTypeByName(String name) {
        PokemonType pokemonByName = pokemonTypeRepository.findPokemonTypeByName(name);
        return pokemonByName;
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        List<PokemonType> listPokemon = pokemonTypeRepository.findAllPokemonType();
        return listPokemon;
    }



    public void setPokemonTypeRepository(PokemonTypeRepository pokemonTypeRepository) {
        this.pokemonTypeRepository = pokemonTypeRepository;
    }
    public void setTranslationRepository(TranslationRepository translationRepository){
        this.translationRepository = translationRepository;
    }
}