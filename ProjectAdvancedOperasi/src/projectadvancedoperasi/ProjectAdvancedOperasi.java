/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author asus
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intansiasi class Operasi
        Operasi op = new Operasi();
        System.out.println("a. 3 + 4 = " + op.jumlahkan(3, 4));
        System.out.println("b. 4 + 7 + (-9) = " + op.jumlahkan(4, 7, -9));
        System.out.println("c. 3.4 + (-0.002) + 0.12313 = "+ op.jumlahkan(3.4, -0.002, 0.12313));
    }
    
}
