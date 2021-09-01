package com.example.demo.Dto;

import com.example.demo.Model.PokeApiAbilityResourceList;

import java.util.List;

public class AbilityDto  {

    private List<PokeApiAbilityResourceList> pokemon;
    private Integer id;
    private String name;

    public AbilityDto() {
    }

    public AbilityDto(List<PokeApiAbilityResourceList> pokemon, Integer id, String name) {
        this.pokemon = pokemon;
        this.id = id;
        this.name = name;
    }

    public List<PokeApiAbilityResourceList> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokeApiAbilityResourceList> pokemon) {
        this.pokemon = pokemon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
