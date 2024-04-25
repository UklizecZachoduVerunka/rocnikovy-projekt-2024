/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 

import characters.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author veron
 */
public abstract class Type {
    protected String name; 
    protected ArrayList<Type> badAgainst;
    protected ArrayList<Type> goodAgainst;
    
    public abstract Double isEfective(Pokemon alfred);
}
