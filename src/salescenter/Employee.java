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
abstract class Employee {
    String firstName, lastName;
    
    public Employee(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    
    abstract double Pay(double period);
    
    public String toString(){
        
        return (firstName + "" + lastName);
    }
}
