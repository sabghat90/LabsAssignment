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
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		
		double a;
                ApparelClass obj1 = new ApparelClass();
                Book obj2 = new Book();
                SummerApparel obj3 = new SummerApparel();
                WinterApparel obj4 = new WinterApparel();
                SalaryEmployee obj5 = new SalaryEmployee();
                ApparelClass obj6 = new ApparelClass();
                Book obj7 = new Book();
                SummerApparel obj8 = new SummerApparel();
                WinterApparel obj9 = new WinterApparel();
                SalaryEmployee obj10 = new SalaryEmployee();
		Payable[] products = {obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10};
                
		
		for(int i=0; i<products.length; i++){
			
			
				
                            System.out.println(products[i].toString()+
				"\n\n--------------------------------------------------\n"+
				"--------------------------------------------------\n"+
				"--------------------------------------------------\n"+
				"[Object ("+i+") is given above so dont worry, be happy.]\n"+
				"---------------------------------------------------\n"

                            );
                          
            }
    
    }
}
