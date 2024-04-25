/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characters;

import java.util.ArrayList;

/**
 *
 * @author veron
 * class of that makes pokemon with all his elements
 */
public class Pokemon {
    public String name;
    protected int HP;
    //protected int level;
    //protected int xp;
    
    protected int maxHP;
    protected int attack;
    protected int specialAttack;
    protected int defence;
    protected int specialDefence;
    protected int speed;
    
    protected Type type1; 
    protected Type type2;
    
    protected ArrayList <Move> moves;
    private static final int maxMoves = 4;
    protected boolean alive;
    
    //protected String about;
    /**
     * 
     * @param name
     * @param maxHP
     * @param attack
     * @param specialAttack
     * @param defence
     * @param specialDefence
     * @param speed
     * @param type1
     * @param type2 
     */
    public Pokemon(String name, int maxHP, int attack, int specialAttack, int defence, int specialDefence, int speed, Type type1, Type type2, ArrayList<Move> moves) {
        this.name = name;
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defence = defence;
        this.specialDefence = specialDefence;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.moves = moves;
        this.alive = true;
    }

   

    public String getName() {
        return name;
    }

    public int getHealth() {
        return HP;
    }

    public int getMaxHealth() {
        return maxHP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public static int getMaxMoves() {
        return maxMoves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.HP = health;
    }
    /**
     * 
     * @return 
     */
    public boolean hasFainted()
    {
        if(HP <= 0){
            alive = false;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", HP=" + HP + ", maxHP=" + maxHP + ", attack=" + attack + ", specialAttack=" + specialAttack + ", defence=" + defence + ", specialDefence=" + specialDefence + ", speed=" + speed + ", type1=" + type1 + ", type2=" + type2 + ", moves=" + moves + ", alive=" + alive + "}\n";
    }
    
    

}
