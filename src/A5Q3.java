/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonah
 */
public class A5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringStack bob = new StringStack();
        boolean temp = false;
        temp = bob.word("cat$cac");
        if(temp == false){
            System.out.println("false");
        }else
        System.out.println("true");
    }
}
