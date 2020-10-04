/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

/**
 *
 * @author User
 */
public class Date {
        private int Day , Month , Year;
    private static final int[] daysPerMonth = {0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
    
    public Date(int day, int month, int year) {
        if (month <= 0 || month >= 12)
            throw new IllegalArgumentException("Month value is invalid");
        if (day <= 0 || day > daysPerMonth[month] && ! (day == 29 && month == 2))
            throw new IllegalArgumentException("Day is Invalid");        
        if (day == 29 && month == 2 && ! (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("There is no 29 in year " + year);
        this.Day = day;
        this.Month = month;
        this.Year = year;

    }
    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.Day, this.Month, this.Year);
    }
}
