package com.example.demo.Model;


import java.io.Serializable;
import java.util.List;

public class Ability implements Serializable {
    private List<PokeApiAbilityResourceList> pokemon;
    private Integer id;
    private String name;

    public Ability() {
    }

    public Ability(Integer id, String name, List<PokeApiAbilityResourceList> pokemon) {
        this.id = id;
        this.name = name;
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


    public List<PokeApiAbilityResourceList> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokeApiAbilityResourceList> pokemon) {
        this.pokemon = pokemon;
    }
}
