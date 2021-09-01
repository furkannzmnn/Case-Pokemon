package com.example.demo.Exception;

public class PokemonInvalidException extends RuntimeException{
    public PokemonInvalidException(String message) {
        super(message);
    }
}
