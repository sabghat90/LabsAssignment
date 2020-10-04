package Lab08;
public class Test {
public static void main(String[] args) {
        Date d1=new Date(1,1,2000);
        Apparel a1=new Apparel("winter",2000,"sharara",1500,d1);
        System.out.println(a1);
        
        
        Book b1=new Book("shake speare","book",1000,d1);
        System.out.println(b1+ "\n"+"new price "+(0.15*b1.getSalePrice()+b1.getSalePrice()));
    }
    
}
