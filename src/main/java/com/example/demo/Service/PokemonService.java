package com.example.demo.Service;

import com.example.demo.Model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    String BASE_URL = "https://pokeapi.co/api/v2/ability/";


    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Pokemon listPokemon(){
        return restTemplate.getForObject(BASE_URL, Pokemon.class);
    }


    public Pokemon findPokemon(String pokemonName){

        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + pokemonName, Pokemon.class);
        return pokemon;
    }

}
