
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emre
 */
public class Snuky_Gulocky {
  protected int Pocet_gulicek;


    public Snuky_Gulocky() {
  
    }

  
    public int getPocet_gulicek() {
        return Pocet_gulicek;
    }

    public void setPocet_gulicek(int Pocet_gulicek) {
        this.Pocet_gulicek = Pocet_gulicek;
    } 

    public void Prehod_snurky(LinkedList snura1){
        Collections.sort(snura1);
     
    }
    
    public void RandomLinkedList1(LinkedList snura){
        snura.clear();
         for(int i=1;i<=Pocet_gulicek;i++){
         snura.add(i);
           }
          Collections.shuffle(snura);
    
            
    }
    
 
   
}
