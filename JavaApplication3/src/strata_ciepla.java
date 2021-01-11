/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomek2
 */
public class strata_ciepla {
    double L = 3122.5; // srednia roczna liczba stopniodni grzania
    public double A; // powierzchnia przegrody
    public double U; // wspolczynnik przenikania ciepla
    
    
    
    public strata_ciepla(double a,double u){
        A=a;
        U=u;
    }
    
    
    public double strata() {
        double strata = (0.024 * U * A * L) / 1000;
        System.out.println(strata);
        return strata;
    }
            
}
