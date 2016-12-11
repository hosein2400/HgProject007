/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hgproject007;

import java.util.*;

/**
 *
 * @author HgH
 */
public class HgProject007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(""+tabdil.digit02(5));
      
        
        String result = "";
        
        long a ;
        int numSize;
      Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:" );
      try{
      a = input.nextLong();
      
      }catch(Exception e){
          System.err.println("please enter a valid number");
          a = 0;
      }
      numSize = tabdil.numSize(a);
      switch(numSize){
          case 1: result = tabdil.digit01(a);
            break;
          case 2: result = tabdil.digit02(a);
            break;
          case 3: result = tabdil.digit03(a);
            break;
          case 4: result = tabdil.digit04(a);
          break;
          case 5: result = tabdil.digit05(a);
          break;
      }
        System.out.println("" + result);  
        
   }
}
