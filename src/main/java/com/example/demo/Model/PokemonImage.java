package com.example.demo.Model;

public class PokemonImage {

    private Integer number;
    private String sprite;

    @Override
    public String toString() {
        return "PokemonImage{" +
                "number=" + number +
                ", sprite='" + sprite + '\'' +
                '}';
    }

    public PokemonImage(Integer number, String sprite) {
        this.number = number;
        this.sprite = sprite;
    }

    public PokemonImage() {
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
