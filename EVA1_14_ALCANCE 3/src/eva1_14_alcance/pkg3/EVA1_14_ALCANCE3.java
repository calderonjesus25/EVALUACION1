/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_alcance.pkg3;

/**
 *
 * @author yisus
 */
public class EVA1_14_ALCANCE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int x = 100;no se puede existe en el main
        System.out.println("x");//visible en todo el main
        for(int i = 0; i < 10; i++){
            System.out.println("i");
            if(i == 5){
                System.out.println("x");
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println("i");
    }
    }
}
