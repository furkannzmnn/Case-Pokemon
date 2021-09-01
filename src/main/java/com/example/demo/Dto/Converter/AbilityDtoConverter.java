package com.example.demo.Dto.Converter;

import com.example.demo.Dto.AbilityDto;
import com.example.demo.Model.Ability;
import org.springframework.stereotype.Component;

@Component
public class AbilityDtoConverter {

    public AbilityDto convertToAbility(Ability from){
        return new AbilityDto(
                from.getPokemon(),
                from.getId(),
                from.getName()
        );
    }
}
