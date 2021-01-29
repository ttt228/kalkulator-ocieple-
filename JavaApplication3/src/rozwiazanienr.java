/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomek2
 */
public class rozwiazanienr {
         int nr_o_dachu = -1;
         int nr_o_scian = -1;
         int nr_o_fundamentow = -1; 
        public double lonczne_przewodnictwo = 400000;
        public double koszt = 0;
         
         public rozwiazanienr (int a, int b, int c, double lp,double kosztt)
         {
         nr_o_dachu = a;
         nr_o_scian = b;
         nr_o_fundamentow = c;
         lonczne_przewodnictwo = lp;
         koszt = kosztt;
         }
         
         public void wyswietl()
         {
          System.out.println();
          System.out.println("lonczne przewodnictwo:" + lonczne_przewodnictwo + "koszt:"+koszt +"      nrdachu" +nr_o_dachu+"       no"+nr_o_scian+"       fun"+nr_o_fundamentow);

         }
         
         
         double koszttt()
         {
             return koszt;
         }
         
         double lonczneprzewodnictwo()
         {
             return lonczne_przewodnictwo;
         }




}
