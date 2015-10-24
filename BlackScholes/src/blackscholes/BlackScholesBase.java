/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackscholes;

/**
 *
 * @author DrChin
 */
public abstract class BlackScholesBase
{
    public String OptionName;
    public double sigma;//vol
    public double r;//interest rate
    public double T;//maturity
    public double S;//Current price
    public double X; //Strike price
    
    public abstract double ValuationMethod();
}