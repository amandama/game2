/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game2;
import java.util.*;
import javalib.worldimages.*;

/**
 *
 * @author AmandaMa
 */
public class MysteryObj {
    
    //0 = battle 
    //1 = red shield
    //2 = blue shield
    //3 = yellow shield
    //4 = nothing happens 
    //5 = spacebar not yet hit
    int event; 
    boolean spaceBar;
    
    static Random rand = new Random();
    
    //returns a random int from start with a range of range 
    private static int randInt(int start, int range) {
        return rand.nextInt(range) + start ;
    }
    
    
    public MysteryObj(){
        this.event = 5;
        this.spaceBar = false;
    }
    public MysteryObj(int event, boolean spaceBar){
        this.event = event;
        this.spaceBar = spaceBar;
    }
    
    public MysteryObj onKey(String key){
        if (key.equals("space")){
            if (!this.spaceBar){
                int choice = randInt(0, 3);
                if (choice == 0){
                    return new MysteryObj(0, true);
                } else if (choice == 1){
                    return new MysteryObj(randInt(1,3), true);
                } else {
                    return new MysteryObj(4, true);
                }
            } else {
                return this;
            }
        } else {
            return this;
        }
    }
}