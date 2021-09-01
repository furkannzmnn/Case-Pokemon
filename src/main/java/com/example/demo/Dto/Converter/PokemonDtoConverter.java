package com.example.demo.Dto.Converter;

import com.example.demo.Dto.PokemonDto;
import com.example.demo.Model.PokeApiNamedResourceList;
import org.springframework.stereotype.Component;

@Component
public class PokemonDtoConverter {

    public PokemonDto converToPokemon(PokeApiNamedResourceList from){
        return new PokemonDto(
                from.getCount(),
                from.getNext(),
                from.getPrevious(),
                from.getResults()
        );
    }
}
