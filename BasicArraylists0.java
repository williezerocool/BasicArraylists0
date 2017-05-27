/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarraylists0;

import java.util.ArrayList;
/**
 *
 * @author kendrabooker
 */
public class BasicArraylists0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Integer> arrList = new ArrayList<>();
        
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        arrList.add(-113);
        
       
        
            for(int i=0; i<10; i++){
            
                System.out.println("Slot " + i + " contains " + arrList.get(i) );
            }
        
        
    }
    
}
