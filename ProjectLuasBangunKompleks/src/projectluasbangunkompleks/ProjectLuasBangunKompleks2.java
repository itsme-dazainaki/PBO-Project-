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
public class ProjectLuasBangunKompleks2 {
    public static void main(String[] args) {
        //Project 2
        //objek persegi
        Persegi x = new Persegi();        
        //objek setengah lingkaran
        Lingkaran y = new Lingkaran();
        //objek seperempat persegi
        Lingkaran z = new Lingkaran();
        
        //luas total persegi
        double LuasTotalPersegi = (x.hitungLuas(14)*2);
        //luas total lingkaran Y
        double LuasLingkaranKecil = (y.hitungLuas(14)) * 22/7;
        //luas total lingkaran Z
        double LuasLingkaranBesar = 0.5*((z.hitungLuas(28))*22/7);
        //luas bangun project 2 
        double luasAll = LuasTotalPersegi + LuasLingkaranKecil - LuasLingkaranBesar;
        System.out.println("Luas Bangun Abu-Abu Project 2 : " + luasAll);
                
    }
}
