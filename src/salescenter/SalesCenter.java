/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salescenter;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author nohin6777
 */
public class SalesCenter {
    public static void payEmployee(Employee emp, double payArg){
        NumberFormat x = NumberFormat.getCurrencyInstance();
        double pay;
        
        System.out.println(emp);
        pay = emp.Pay(payArg);
        System.out.println(x.format(pay));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager emp1 = new Manager("Diego" , " Martin" , 55000);
        Associate emp2 = new Associate("Kylie", " Walter", 18.50);
        Associate emp3 = new Associate("Michael", " Rose", 16.75);
        
        Scanner input = new Scanner(System.in);
        String action;
        int empNum;
        double payArg;
        
        Employee emp = emp1;
        
        do{
            System.out.println("\nEmployee\\Pay\\Quit");
            System.out.print("Enter Choice: ");
            action = input.next();
            
            if(!action.equalsIgnoreCase("q")){
                System.out.print("Enter employee number (1,2,or 3):");
                empNum = input.nextInt();
                
                switch(empNum){
                    case 1: emp = emp1; break;
                    case 2: emp = emp2; break;
                    case 3: emp = emp3; break;
                }
            
            if(action.equalsIgnoreCase("e")){
                System.out.print(emp);
            }else if(action.equalsIgnoreCase("p")){
                System.out.print("Enter the hours for associate or pay period for manger: ");
                payArg = input.nextDouble();
                
                payEmployee(emp,payArg);
            }
        
            }
    }while(!action.equalsIgnoreCase("q"));
    
}
}
