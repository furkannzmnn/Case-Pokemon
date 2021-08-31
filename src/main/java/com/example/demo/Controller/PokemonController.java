package com.example.demo.Controller;

import com.example.demo.Service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pokemon/")
public class PokemonController {


    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @GetMapping("fullListPokemon")
    public ResponseEntity<?> listPokemon(){

        return ResponseEntity.ok(pokemonService.listPokemon());
    }


    @GetMapping("list/{pokemonName}")
    public ResponseEntity<?> find(@PathVariable String pokemonName){
        return ResponseEntity.ok(this.pokemonService.findPokemon(pokemonName));
    }
}
