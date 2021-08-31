package com.example.demo.Model

data class Ability(
    val id : Int?,
    val name: String?,
    val pokemon: List<Pokemon>



) {
    override fun toString(): String {
        return "Ability(id=$id, name=$name, pokemon=$pokemon)"
    }
}
