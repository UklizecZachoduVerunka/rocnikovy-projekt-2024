/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readers;

import characters.Category;
import characters.Move;
import characters.Type;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author veron
 * reads move from a file
 */
public class MoveReader {
    /** 
     * 
     * @param sc
     * @return
     * @throws ReaderException 
     */
    public ArrayList ReadMove(Scanner sc) throws ReaderException{
       try{
           var allMoves = new ArrayList<Move>();
           
           while(sc.hasNext()){
            String name = sc.next();
            Type type = Type.valueOf(sc.next());
            Category cat = Category.valueOf(sc.next());
            int D = sc.nextInt();
            int A = sc.nextInt();
            int PP = sc.nextInt();

            allMoves.add(new Move(name, D, A, PP, type, cat));
           }
           
           Random rand = new Random();
           int help = allMoves.size();
           int numberOfMoves = rand.nextInt(3,4);
           
           var moves = new ArrayList<Move>();
           
           for(int i = 0; i < numberOfMoves; i++){
                moves.add(allMoves.get(rand.nextInt(0,help)));
                
           }
           
           return moves;
           }
           
       
        catch(NoSuchElementException a){
            throw new ReaderException("haha move"); //where im gonna call the method i have to do try and catch
        }
        
        catch(IllegalStateException b){
            throw new ReaderException("haha move2");
        }
       
    }
}
