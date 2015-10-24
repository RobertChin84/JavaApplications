/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackscholes;
import org.apache.commons.math3.distribution.NormalDistribution;
/*
/ * @author DrChin
 */
public class EuropeanCall extends BlackScholesBase{
    
    private double b = 0.0;
    public EuropeanCall(double _sigma, double _r,double _X,double _S,double _T)
    {
        OptionName = "European Call";
        sigma = _sigma;
        r = _r;
        S = _S;
        X = _X;
        T = _T;
    }
    
    public EuropeanCall(double _sigma, double _r,double _X,double _S,double _T, double _b)
    {
        OptionName = "modified European Call";
        sigma = _sigma;
        r = _r;
        S = _S;
        X = _X;
        T = _T;
        b = _b;
    }
    
    public double ValuationMethod()
    {
        NormalDistribution N = new NormalDistribution();
        double _b = r - b;
        double d1 = (Math.log(S/X)+(b+0.5*Math.pow(sigma, 2))*T)/(sigma*Math.sqrt(T));
        double d2 = d1 - sigma*Math.sqrt(T);
        
        double Nd1 = N.cumulativeProbability(d1);
        double Nd2 = N.cumulativeProbability(d2);
        return S*Nd1 - X*Nd2*Math.exp((b-r)*T);
    }
}
