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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Persegi Panjang dengan Panjang = 10 dan Lebar = 5");
        System.out.println("Luasnya : "+pp.hitungLuas(10,5));
        System.out.println("Kelilingnya :"+pp.hitungKeliling(10,5)+"\n");
        
        System.out.println("Persegi Panjang dengan Panjang = 3.6 dan Lebar = 8");
        System.out.println("Luasnya : "+pp.hitungLuas(3.6,8));
        System.out.println("Kelilingnya :"+pp.hitungKeliling(3.6,8)+"\n");
        
        System.out.println("Persegi Panjang dengan Panjang = 6 dan Lebar = 8.3");
        System.out.println("Luasnya : "+pp.hitungLuas(6,8.3));
        System.out.println("Kelilingnya :"+pp.hitungKeliling(6,8.3)+"\n");
    
        System.out.println("Persegi Panjang dengan Panjang = 5.6 dan Lebar = 8.8");
        System.out.println("Luasnya : "+pp.hitungLuas(5.6,8.8));
        System.out.println("Kelilingnya :"+pp.hitungKeliling(5.6,8.8)+"\n");
        
        //Persegi
        Persegi p = new Persegi();
        System.out.println("Persegi dengan sisi = 4.5");
        System.out.println("Luasnya : "+p.hitungLuas(4.5));
        System.out.println("Kelilingnya : "+p.hitungKeliling(4.5)+"\n");
        
        System.out.println("Persegi dengan sisi = 7");
        System.out.println("Luasnya : "+p.hitungLuas(7));
        System.out.println("Kelilingnya : "+p.hitungKeliling(7)+"\n");
    
        //Lingkaran
        Lingkaran L = new Lingkaran();
        System.out.println("Lingkaran dengan jejari = 5");
        System.out.println("Luasnya : "+L.hitungLuas(5));
        System.out.println("Kelilingnya : "+L.hitungKeliling(5)+"\n");
        
        System.out.println("Lingkaran dengan jejari = 7.4");
        System.out.println("Luasnya : "+L.hitungLuas(7.4));
        System.out.println("Kelilingnya : "+L.hitungKeliling(7.4)+"\n");
        
        //Segitiga
        Segitiga sg = new Segitiga();
        System.out.println("segitiga dengan alas = 8 dan tinggi = 10");
        System.out.println("Luasnya : "+sg.hitungLuas(8, 10));
        System.out.println("Kelilingnya "+sg.hitungKeliling(8, 10)+"\n");
        
        System.out.println("segitiga dengan alas = 8 dan tinggi = 11.5");
        System.out.println("Luasnya : "+sg.hitungLuas(8, 11.5));
        System.out.println("Kelilingnya "+sg.hitungKeliling(8, 11.5)+"\n");
        
        System.out.println("segitiga dengan alas = 12.2 dan tinggi = 9");
        System.out.println("Luasnya : "+sg.hitungLuas(12.2, 9));
        System.out.println("Kelilingnya "+sg.hitungKeliling(12.2, 9)+"\n");
        
        System.out.println("segitiga dengan alas = 13.9 dan tinggi = 20.7");
        System.out.println("Luasnya : "+sg.hitungLuas(13.9, 20.7));
        System.out.println("Kelilingnya "+sg.hitungKeliling(13.9, 20.7)+"\n");
        
        
    }
    
    
}
