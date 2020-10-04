package Lab09;
public class SummerApparel extends ApparelClass{

	public double season_profit, season_sale_price;

    public SummerApparel() {
    }
    
    public SummerApparel(double season_profit, double season_sale_price, String season_name, double season_price, double season_percent_discount, String product_name, double product_price, Date product_purchased_on, double product_percent_profit, double product_percent_discount) {
        super(season_name, season_price, season_percent_discount, product_name, product_price, product_purchased_on, product_percent_profit, product_percent_discount);
        this.season_profit = season_profit;
        this.season_sale_price = season_sale_price;
    }

	
	public void calculating_price(){
		season_profit = super.season_price - season_sale_price;
		super.season_price += season_profit;
	}

	public String toString(){
		calculating_price();
		System.out.println(super.toString());
		return "Summer Apparel {"+
		"\n\tseason_profit :"+season_profit+
		"\n\tseason_sale_price :"+season_sale_price+
		"\n}";
	}
}