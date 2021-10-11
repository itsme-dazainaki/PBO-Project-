/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Radaza Putri
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegiPanjang x = new persegiPanjang();
        System.out.println("1. Luas dan Keliling Persegi Panjang : "
                + "\nLuas Persegi panjang 1 = " + x.luasPP(10, 5) + ", Keliling 1 = " + x.kelilingPP(10, 5)
                + "\nLuas Persegi panjang 2 = " + x.luasPP(3.6, 8) + ", Keliling 2 = " + x.kelilingPP(3.6, 8)
                + "\nLuas Persegi panjang 3 = " + String.format("%.2f", x.luasPP(6, 8.3)) + ", Keliling 3 = " + x.kelilingPP(6, 8.3)
                + "\nLuas Persegi panjang 4 = " + x.luasPP(5.6, 8.8) + ", Keliling 4 = " + x.kelilingPP(5.6, 8.8)
        );
        
        persegi y = new persegi();
        System.out.println("2. Luas dan Keliling Persegi  : "
                + "\nLuas Persegi 1 = " + y.luasP(4.5) + ", Keliling 1 = " + y.kelilingP(4.5)
                + "\nLuas Persegi 2 = " + y.luasP(7) + ", Keliling 2 = " + y.kelilingP(7)
        );
        
        lingkaran z = new lingkaran();
        System.out.println("3. Luas dan Keliling Lingkaran : "
               + "\nLuas Lingkaran 1 = " + z.luasL(5) + ", Keliling 1 = " + z.kelilingL(5) 
               + "\nLuas Lingkaran 2 = " + String.format("%.2f", z.luasL(7.4)) + ", Keliling 2 = " +  String.format("%.2f", z.kelilingL(7.4))
        );
        
        segitiga w = new segitiga();
        System.out.println("4. Luas dan Keliling Segitiga : "
                + "\nLuas Segitiga 1 = " + w.luasS(8, 10) + ", Keliling 1 = " + String.format("%.2f", w.kelilingS(8, 10))
                + "\nLuas Segitiga 2 = " + w.luasS(8, 11.5) + ", Keliling 2 = " + String.format("%.2f", w.kelilingS(8, 11.5))
                + "\nLuas Segitiga 3 = " + w.luasS(12.2, 9) + ", Keliling 3 = " + String.format("%.2f", w.kelilingS(12.2, 9))
                + "\nLuas Segitiga 4 = " + String.format("%.2f", w.luasS(13.9, 20.7)) + ", Keliling 4 = " + String.format("%.2f", w.kelilingS(13.9, 20.7))
         );
    }
    
}

