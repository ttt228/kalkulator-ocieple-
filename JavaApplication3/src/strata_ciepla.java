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
    public double R; // roznica temperatur
    
    
    
    public strata_ciepla(double a,double u, double rr){
        A=a;
        U=u;
        R=rr;
    }
    
    
    public double strata() {
        double strata = U * A * R;
        System.out.println(strata);
        return strata;
    }
            
}
