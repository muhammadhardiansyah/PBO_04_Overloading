/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author asus
 */
public class Lingkaran {
    //menentukan jenis pi yang digunakan
    static double pi(double r){
        double pi;
        if (r % 7 == 0){
            pi = 22. / 7.;
        } 
        else{
            pi = 3.14;
        }
        return pi;
    }
    //mencari luas lingkaran
    double hitungLuas(double r){
        double luas = pi(r) * (r*r);
        return luas;
    }
    double hitungLuas(int r){
        double luas = pi(r) * (r*r);
        return luas;
    }
    double hitungKeliling(double r){
        return (2. * pi(r) * r);
    }
    double hitungKeliling(int r){
        return (2. * pi(r) * r);
    }
    
}
