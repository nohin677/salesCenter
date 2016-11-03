/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salescenter;

/**
 *
 * @author nohin6777
 */
public class Associate extends Employee{
    double hourlyPayRate;
    
    public Associate(String fName, String lName, double rate){
        super(fName, lName);
        hourlyPayRate = rate;
    }
    
    public double getRate(){
        return hourlyPayRate;
    }
    
    public double Pay(double hours){
        double payEarned;
        
        payEarned = hourlyPayRate * hours;
        return payEarned;
    }
    
    public String toString(){
        return(super.toString() + ",Associate");
    }
}
