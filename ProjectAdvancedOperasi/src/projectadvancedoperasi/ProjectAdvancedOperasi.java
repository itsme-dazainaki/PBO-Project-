/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Radaza Putri
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi p = new Operasi();
        System.out.println(p.jumlahkan(3,4));
        
        Operasi q = new Operasi();
        System.out.println(q.jumlahkan(4, 7, -9));
        
        Operasi r = new Operasi();
        System.out.println(r.jumlahkan(3.4, -0.002, 0.12313));
        
        //prohject 1
        Operasi x = new Operasi();
        System.out.println(x.perkalian(8, 4.9, 9.238));
    }
    
}
