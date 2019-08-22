
import java.util.ArrayList;
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
public class Tanecny_Bankget {
    int M_alebo_Z=0;
    int Max=0;
    LinkedList Muzi=new LinkedList();
    LinkedList Zeny=new LinkedList();

    
    public Tanecny_Bankget() {
   
    
    }
    
    public void Ako_prichadzali_hostia(LinkedList vsetci){
         Max=(int)(Math.random()*30)+1;
        vsetci.clear();
        Zeny.clear();
        Muzi.clear();
       for(int i=1;i<Max+1;i++){
           int pohlavie=(int)(Math.random()*2)+1;
           if(pohlavie==1){
               vsetci.addFirst("Z"+i);
               Zeny.addFirst("Z"+i);
           }else {
                   vsetci.addFirst("M"+i);
                   Muzi.addFirst("M"+i);
                   
          
           }
       }
    }

    public LinkedList getMuzi() {
        return Muzi;
    }

    public LinkedList getZeny() {
        return Zeny;
    }
       
       
    public void Vytvor_Pary(LinkedList Pary ){

        Pary.clear();
        int pocetM=Muzi.size();
        int pocetZ=Zeny.size();
         if(Zeny.size()>Muzi.size()){
             for(int i=1;i<pocetM+1;i++){
               Pary.addLast(Muzi.getLast()+" "+String.valueOf(Zeny.getLast()));
                 Muzi.removeLast();
                 Zeny.removeLast();
               
             }
         }else{
              for(int i=1;i<pocetZ+1;i++){
               Pary.addLast(Zeny.getLast()+" "+String.valueOf(Muzi.getLast()));
                 Muzi.removeLast();
                 Zeny.removeLast();
              
                 
             }
         }
               
    }
    

    
    
    
    
}


