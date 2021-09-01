package com.example.demo.Model;

import java.io.Serializable;
import java.util.List;
//pokemon ve ability değişkenlerinin döndüğü sınıf
public class PokeApiAbilityResourceList implements Serializable {
    private boolean is_hidden;
    private Integer slot;
    private Pokemon pokemon;

    public PokeApiAbilityResourceList() {
    }

    public PokeApiAbilityResourceList(boolean is_hidden, Integer slot, Pokemon pokemon) {
        this.is_hidden = is_hidden;
        this.slot = slot;
        this.pokemon = pokemon;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }


    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
