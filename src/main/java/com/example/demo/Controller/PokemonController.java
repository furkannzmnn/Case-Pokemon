package com.example.demo.Controller;

import com.example.demo.Service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pokemon/")
public class PokemonController {


    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @GetMapping("fullListPokemon")
    public ResponseEntity<?> listPokemon(@RequestParam Integer limit){
        return ResponseEntity.ok(pokemonService.listPokemon(limit));
    }

    @GetMapping("pokemonWithAbility/{id}")
    public ResponseEntity<?> pokemonWithAbility(@PathVariable Integer id ){
        return ResponseEntity.ok(pokemonService.pokemonWithAbility(id));
    }


    @GetMapping("list/{pokemonName}")
    public ResponseEntity<?> find(@PathVariable String pokemonName){
        return ResponseEntity.ok(this.pokemonService.findPokemon(pokemonName));
    }


}
