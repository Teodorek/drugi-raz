/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odandrzeajpętle;


//import java.util.Arrays;
public class OdAndrzeajPętle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*    1 zadanie
            for(int i = 8; i <= 50; i++)
            {System.out.println(i);
    }
   */ 

// 2 zadanie
  /*          for(int i = 2; i <= 50; i++)
            {
                if(i % 2 != 0)
                    continue;
           
                System.out.println(i);
            }
*/
  //3 zadanie
   /*         for(int i = 1; i<= 100; i++)
            {
                if(i % 8 != 0)
                        continue;
                System.out.println(i);
                
            }
*/

 /*      4 zadanie
             for(int i = 100; i > 0; i--)
            {
                if(i % 5 != 0)
                    continue;
                System.out.println(i
                );
            }*/
                    
 // 5 zadanie
 
        for(int j = 99; j >= 0; j--)
            
        {  int i = j - 1;

//            for(int i = j - 1; i >= 0; i--) 
            {
               if(i == 0)
                   break;
                System.out.print(j + " bootles of beer on the wall, " + j + " bottles of beer " + "Take one down and pass it around, " + i + " bottles of beer on the wall");
            }
               System.out.println();
           }
}
}
