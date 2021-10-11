/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Radaza Putri
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Project 1
        
        //objek setengah lingkaran
        Lingkaran x = new Lingkaran();
        //objek persegi
        Persegi y = new Persegi();
        
        //hitung luas keseluruhan lingkaran
        double LuasLingkaranAll = 2*(x.hitungLuas(42)*22/7);
        //hitung keseluruhan 
        double luasAll = LuasLingkaranAll + y.hitungLuas(42);
        System.out.println("Luas total seluruh bangun Project 1 : " + luasAll);
        
        //Project 2
        
    }
    
}
