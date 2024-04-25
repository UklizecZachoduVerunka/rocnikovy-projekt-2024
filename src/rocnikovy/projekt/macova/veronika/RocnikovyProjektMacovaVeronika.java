/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocnikovy.projekt.macova.veronika;

import characters.Pokemon;
import java.util.Scanner;
import readers.PokemonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import readers.MoveReader;
import readers.ReaderException;
import characters.Character;
import java.util.Random;


/**
 *
 * @author veron
 * where the magic is called
 */
public class RocnikovyProjektMacovaVeronika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ReaderException {
        // TODO code application logic here
        PokemonReader a = new PokemonReader();
        MoveReader b = new MoveReader();
        
        /*try(Scanner sc = new Scanner(new FileInputStream("src//data//Bulbasaur-moves.txt")))//"src//data//all-pokemon.txt"
        {
            //ArrayList<Move> move = b.ReadMove(sc);
            //System.out.println( move.toString());
           
        }
        
        catch(FileNotFoundException e)
        {
            
        System.out.println("haha does not function");
        
        }*/
        
        try(Scanner sc = new Scanner(new FileInputStream("src//data//all-pokemon.txt")))//"src//data//all-pokemon.txt"
        {
            ArrayList<Pokemon> pokemon = a.ReadPokemon(sc);
            System.out.println( pokemon.toString());
           
            System.out.println("what's your name?");
            Scanner scc = new Scanner(System.in);
            String name = scc.nextLine();
            Random rand = new Random();
            int help = pokemon.size();
            
            for(int i = 0; i < 10; i++)
            {
                System.out.println(i);
                System.out.println(pokemon.get(rand.nextInt(0,help-1)));
            }
            
            Character player = new Character(name, pokemon);
        }
        
        catch(FileNotFoundException e)
        {
            
        System.out.println("haha does not function");
        
        }
        
        
    }
    
}
