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
public class segitiga {
    //rumus luas segitiga
    int luasS(int a, int t){
        return (a*t)/2;
    }    
    double luasS(double a, int t){
        return (a*t)/2;
    }    
    double luasS(int a, double t){
        return (a*t)/2;
    }        
    double luasS(double a, double t){
        return (a*t)/2;
    }
    
    //rumus keliling segitiga
    double kelilingS(int a, int b){
        //sisi miring
        double c = ((a*a) + (b*b));
        double kell = a + b + (Math.sqrt(c));
        return kell;
    }    
    double kelilingS(double a, int b){
        //sisi miring
        double c = ((a*a) + (b*b));
        double kell = a + b + (Math.sqrt(c));
        return kell;
    }    
    double kelilingsS(int a, double b){
        //sisi miring
        double c = ((a*a) + (b*b));
        double kell = a + b + (Math.sqrt(c));
        return kell;
    }        
    double kelilingS(double a, double b){
        //sisi miring
        double c = ((a*a) + (b*b));
        double kell = a + b + (Math.sqrt(c));
        return kell;
    }
}
