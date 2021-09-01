package com.example.demo.Service;

import com.example.demo.Dto.AbilityDto;
import com.example.demo.Dto.Converter.AbilityDtoConverter;
import com.example.demo.Dto.Converter.PokemonDtoConverter;
import com.example.demo.Dto.PokemonDto;
import com.example.demo.Model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;
    private final AbilityDtoConverter abilityDtoConverter;
    private final PokemonDtoConverter pokemonDtoConverter;


    public PokemonService(RestTemplate restTemplate, AbilityDtoConverter abilityDtoConverter, PokemonDtoConverter pokemonDtoConverter) {

        this.restTemplate = restTemplate;
        this.abilityDtoConverter = abilityDtoConverter;
        this.pokemonDtoConverter = pokemonDtoConverter;
    }




    //bu method belirtilen sayıda tüm pokemon listesini döner
    public PokemonDto listPokemon(Integer limit) {
        PokeApiNamedResourceList pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?limit=" + limit, PokeApiNamedResourceList.class);
    return pokemonDtoConverter.converToPokemon(pokemon);
    }

    // bu method pokemon listesi ile birlikte ability değişkenini de döner
    public AbilityDto pokemonWithAbility(Integer id) {

        Ability ability = restTemplate.getForObject("https://pokeapi.co/api/v2/ability/" + id, Ability.class);
        return abilityDtoConverter.convertToAbility(ability);
    }

    public Pokemon findPokemon(String pokemonName) {

        return restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + pokemonName, Pokemon.class);
    }

}
