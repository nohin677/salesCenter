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
public class Manager extends Employee{
    double yearlySalary;
    
    public Manager(String fName, String lName, double salary){
        super(fName, lName);
        yearlySalary = salary;
    }
    
    public double getSalary(){
        return yearlySalary;
    }
    
    public double Pay(double weeks){
        double payEarned;
        payEarned = (yearlySalary / 52) * weeks;
        return payEarned;
    }
    
    public String toString(){
        return(super.toString() + ", Manager");
    }
}
