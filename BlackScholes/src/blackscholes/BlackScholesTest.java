package blackscholes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrChin
 */
public class BlackScholesTest {
    public static void main(String[] args) {
        double sigma = 0.02;
        double r = 0.01/365;
        double X = 105;
        double S = 100;
        double T =20;
        EuropeanCall E1 = new EuropeanCall(sigma,r,X,S,T);
        System.out.println("Price of option: "+E1.ValuationMethod());
    }
}
