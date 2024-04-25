/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readers;

import characters.Pokemon;
import characters.Type;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author veron
 * reads a pokemon from a file (now without any moves)
 */
public class PokemonReader {
    private MoveReader moveread = new MoveReader();
    private Scanner scm;
    
    public ArrayList<Pokemon> ReadPokemon(Scanner sc) throws ReaderException, FileNotFoundException {
        
        try{
            var allPokemon = new ArrayList<Pokemon>();
            
            while(sc.hasNext())
            {
                String name = sc.next();
                int mHP = sc.nextInt();
                int A = sc.nextInt();
                int D = sc.nextInt();
                int SA = sc.nextInt();
                int SD = sc.nextInt();
                int S = sc.nextInt();
                Type type = null;
                if(!(sc.hasNext("NON")))
                    type = Type.valueOf(sc.next());
                else
                    throw new ReaderException("haha pokemon can't have non as first type");
                Type type2 = Type.valueOf(sc.next()); 
                scm = new Scanner(new FileInputStream("src//data//" + name + "-moves.txt"));

                allPokemon.add(new Pokemon(name, mHP, A, SA, D, SD, S, type, type2, moveread.ReadMove(scm)));
            }
            
            return allPokemon;
        }
        catch(NoSuchElementException a){
            throw new ReaderException("haha pokemon");
        }
        
        catch(IllegalStateException b){
            throw new ReaderException("haha pokemon 2");
        }
       
    }
    
}

