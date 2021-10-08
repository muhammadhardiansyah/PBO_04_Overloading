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
public class Segitiga {
    //luas
    double hitungLuas(int a, int t){
        return (a * t * 0.5);
    }
    double hitungLuas(int a, double t){
        return (a * t * 0.5);
    }
    double hitungLuas(double a, int t){
        return (a * t * 0.5);
    }
    double hitungLuas(double a, double t){
        return (a * t * 0.5);
    }
    //Keliling
    double hitungKeliling (int a, int t){ 
        double s = Math.sqrt((a * a)+(t * t));
        return (a + s + t);
    }
    double hitungKeliling (int a, double t){ 
        double s = Math.sqrt((a * a)+(t * t));
        return (a + s + t);
    }
    double hitungKeliling (double a, int t){ 
        double s = Math.sqrt((a * a)+(t * t));
        return (a + s + t);
    }
    double hitungKeliling (double a, double t){ 
        double s = Math.sqrt((a * a)+(t * t));
        return (a + s + t);
    }
}
