/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author asus
 */
public class Project_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instansiasi Class Operasi
        Operasi op = new Operasi();
        //pemanggilan method
        System.out.println("a. 3 x 3 = " + op.perkalian(3,3));
        System.out.println("b. 3 x 3.3 = " + op.perkalian(3,3.3));
        System.out.println("c. 4.2 x 4 = " + op.perkalian(4.2,4));
        System.out.println("d. 3.3 x 3.3 = " + op.perkalian(3.3,3.3));
        System.out.println("e. 4 x 3 x 2.5 = " + op.perkalian(4,3,2.5));
        System.out.println("f. 5.5 x 3 x 2.1 = " + op.perkalian (5.5,3,2.1));
        System.out.println("g. 10 x 3.75 x 1.1 = " + op.perkalian (10,3.75,1.1));
    }
    
}
