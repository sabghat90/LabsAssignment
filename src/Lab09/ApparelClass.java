package Lab09;
public class ApparelClass extends ProductClass{
	public  String season_name;
	public double season_price, season_percent_discount, season_discount_price;

    public ApparelClass() {
    }

    
        
    
    public ApparelClass(String season_name, double season_price, double season_percent_discount, String product_name, double product_price, Date product_purchased_on, double product_percent_profit, double product_percent_discount) {
        super(product_name, product_price, product_purchased_on, product_percent_profit, product_percent_discount);
        this.season_name = season_name;
        this.season_price = season_price;
        this.season_percent_discount = season_percent_discount;
    }

    public String getSeason_name() {
        return season_name;
    }

    public void setSeason_name(String season_name) {
        this.season_name = season_name;
    }

    public double getSeason_price() {
        return season_price;
    }

    public void setSeason_price(double season_price) {
        this.season_price = season_price;
    }

    public double getSeason_percent_discount() {
        return season_percent_discount;
    }

    public void setSeason_percent_discount(double season_percent_discount) {
        this.season_percent_discount = season_percent_discount;
    }

    public double getSeason_discount_price() {
        return season_discount_price;
    }

    public void setSeason_discount_price(double season_discount_price) {
        this.season_discount_price = season_discount_price;
    }

    public double calculate_season_discount(double percentDiscount){
         double dis, price;
            price = getSeason_price();
            dis = ((price/100)* percentDiscount);
            price = price-dis;
            setSeason_price(price);
            return price;
    }

    @Override
    public double getPaymentAmount() {
        return getSeason_price();
    }

    @Override
    public String toString() {
        return "ApparelClass{" + "season_name=" + season_name + ", season_price=" + season_price + ", season_discount_price=" + calculate_season_discount(getSeason_price()) + ", season_discount_price=" + season_discount_price + '}';
    }
    
    
    
	
   
	

   
}