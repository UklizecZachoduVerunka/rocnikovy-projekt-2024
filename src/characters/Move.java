/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characters;

/**
 *
 * @author veron
 * class for storing and using moves
 */
public class Move {
    protected String name;
    protected int damage;
    protected int accuracy;
    protected int maxPP;
    protected int realPP;
    protected Type type;
    protected Category cat;
    
    public Move(String name, int damage, int accuracy, int maxPP, Type type, Category cat) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.maxPP = maxPP;
        this.type = type;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getMaxPP() {
        return maxPP;
    }

    public int getRealPP() {
        return realPP;
    }

    public Type getType() {
        return type;
    }

    public Category getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "Move{" + "name=" + name + ", damage=" + damage + ", accuracy=" + accuracy + ", maxPP=" + maxPP + ", realPP=" + realPP + ", type=" + type + ", cat=" + cat + '}';
    }
    
    
}
