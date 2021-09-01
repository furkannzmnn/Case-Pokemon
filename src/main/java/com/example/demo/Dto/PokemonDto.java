package com.example.demo.Dto;

import com.example.demo.Model.Pokemon;

import java.util.List;

public class PokemonDto {
    private Integer count;
    private String next;
    private String previous;

    private List<Pokemon> results;

    public PokemonDto() {
    }

    public PokemonDto(Integer count, String next, String previous, List<Pokemon> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
