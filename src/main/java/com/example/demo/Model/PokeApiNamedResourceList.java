package com.example.demo.Model;

import java.io.Serializable;
import java.util.List;

//tüm pokemon listesinin döneceği sınıf
public class PokeApiNamedResourceList implements Serializable {

    private Integer count;
    private String next;
    private String previous;

    private List<Pokemon> results;

    public PokeApiNamedResourceList() {
    }

    public PokeApiNamedResourceList(Integer count, String next, String previous, List<Pokemon> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }
}
