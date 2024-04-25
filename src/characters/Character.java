/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characters;

import java.util.ArrayList;

/**
 *
 * @author veron
 * makes a player and oponent 
 */
public class Character {
    protected String name;
    protected ArrayList<Pokemon> pokeballs;
    protected static final int maxPokemon = 6;
    //protected int realPokemon; //maybe don't need that

    public Character(String name, ArrayList<Pokemon> pokeballs) {
        this.name = name;
        this.pokeballs = pokeballs;
    }

    
    
    
}
