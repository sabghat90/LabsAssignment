/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class SalaryEmployee extends Employee{
    
    private double weeklySalary;

    public SalaryEmployee() {
    }

    
    public SalaryEmployee(String id, String name, String department,double weeklySalary) {
        super(id, name, department);
        
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be more than 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
         if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be more than 0.0");
        }
        this.weeklySalary = weeklySalary;
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "SalaryEmployee{" + "weeklySalary=" + getWeeklySalary() + '}';
    }
    
    
    
    

   
    
    
    
}
