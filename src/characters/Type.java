/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package characters;

/**
 *
 * @author veron, Daniel Tweedy 
 * @see  https://github.com/DanielTweedy/Pokemon-Simple-Type-Chart/blob/master/PokeTypes.java
 * deals with problem of many pokemon types by table (two dimensional field)
 */

 public enum Type {
    NORMAL, 
    FIGHTING, 
    FLYING, 
    POISON, 
    GROUND, 
    ROCK, 
    BUG, 
    GHOST, 
    STEEL, 
    FIRE, 
    WATER, 
    GRASS, 
    ELECTRIC, 
    PSYCHIC, 
    ICE, 
    DRAGON, 
    DARK,
    NON; //should deal with only one type pokemon

    private static final double norm = 1;
    private static final double weak = 0.5;
    private static final double str = 2;
    private static final double inef = 0;

    private static final double table[][] =
    {
             // norm  fght  fly   pois  grnd  rock  bug   ghst  stel  fire  wter  grss  elec  psyc  ice   drag  dark
    /* norm */ {norm, str , norm, norm, norm, norm, norm, inef, norm, norm, norm, norm, norm, norm, norm, norm, norm},
    /* fght */ {norm, norm, str , norm, norm, norm, norm, inef, norm, norm, norm, norm, norm, norm, norm, norm, norm},
    /* fly  */ {norm, weak, norm, norm, inef, str , weak, norm, norm, norm, norm, weak, str , norm, str , norm, norm},
    /* pois */ {norm, weak, norm, weak, str , norm, weak, norm, norm, norm, norm, weak, norm, str , norm, norm, norm},
    /* grnd */ {norm, norm, norm, weak, norm, weak, norm, norm, norm, norm, str , str , inef, norm, str , norm, norm},
    /* rock */ {weak, str , weak, weak, str , norm, norm, norm, norm, norm, str , str , norm, norm, norm, norm, norm},
    /* bug  */ {norm, weak, str , norm, weak, str , norm, norm, norm, str , norm, weak, norm, norm, norm, norm, norm},
    /* ghst */ {inef, inef, norm, weak, norm, norm, weak, norm, norm, norm, norm, norm, norm, norm, norm, norm, str },
    /* stel */ {weak, str , weak, inef, str , weak, weak, weak, weak, str , norm, weak, norm, weak, weak, weak, weak},
    /* fire */ {norm, norm, norm, norm, str , str , weak, norm, weak, weak, str , weak, norm, norm, weak, norm, norm},
    /* wter */ {norm, norm, norm, norm, norm, norm, norm, norm, weak, weak, weak, str , str , norm, weak, norm, norm},
    /* grss */ {norm, norm, str , str , weak, norm, str , norm, norm, str , weak, weak, weak, norm, str , norm, norm},
    /* elec */ {norm, norm, weak, norm, str , norm, norm, norm, weak, norm, norm, norm, weak, norm, norm, norm, norm},
    /* psyc */ {norm, weak, norm, norm, norm, norm, str , str , norm, norm, norm, norm, norm, weak, norm, norm, str },
    /* ice  */ {norm, str , norm, norm, norm, str , norm, norm, str , str , norm, norm, norm, norm, weak, norm, norm},
    /* drag */ {norm, norm, norm, norm, norm, norm, norm, norm, norm, weak, weak, weak, weak, norm, str , str , norm},
    /* dark */ {norm, str , norm, norm, norm, str , weak, norm, norm, norm, norm, norm, norm, inef, norm, norm, weak}
             // norm  fght  fly   pois  grnd  rock  bug   ghst  stel  fire  wter  grss  elec  psyc  ice   drag  dark
    };
    /**
     * 
     * @param move
     * @return number, which represends efectivity of move to a pokemon
     */
    public double getEfectivityAgainst(Type move){ 
        return this.table[move.ordinal()][this.ordinal()]; //ordinal returns order of the one element (special for enum 
    } //doesnt work change the order

}
