package Lab09;
public abstract class ProductClass implements Payable {

	public String product_name;
	public double product_price, product_percent_profit,sale_price=0.0,product_percent_discount,product_discount_price =0.0;
	Date product_purchased_on;

    public ProductClass() {
    }
        
	public ProductClass(String product_name,double product_price,Date product_purchased_on,double product_percent_profit,double product_percent_discount){
		if(product_price > 0){
			this.product_price = product_price;
		}
		this.product_name = product_name;
		this.product_purchased_on = product_purchased_on;
		this.product_percent_profit = product_percent_profit;
                this.product_percent_discount = product_percent_discount;
	}
	public void setproduct_name(String product_name)
	{
		this.product_name = product_name;
	}
	public void setproduct_price(double product_price)
	{
		this.product_price = product_price;
	}
	public void setproduct_purchased_on(Date product_purchased_on)
	{
		this.product_purchased_on = product_purchased_on;
	}
	public String getproduct_name()
	{
		return product_name ;
	}
	public double getproduct_price()
	{
		return product_price ;
	}
	public Date getproduct_purchased_on()
	{
		return product_purchased_on ;
	}

	public void setproduct_percent_profit(double product_percent_profit)
	{
		this.product_percent_profit = product_percent_profit;
	}
	public double getproduct_percent_profit()
	{
		return product_percent_profit ;
	}

        public double getProduct_percent_discount() {
            return product_percent_discount;
        }

        public void setProduct_percent_discount(double product_percent_discount) {
            this.product_percent_discount = product_percent_discount;
        }

    public double getProduct_discount_price() {
        return product_discount_price;
    }

    public void setProduct_discount_price(double product_discount_price) {
        this.product_discount_price = product_discount_price;
    }
        
        public double calculate_discount_price(double percentDiscount){
            double dis, price;
            price = getproduct_price();
            dis = ((price/100)* percentDiscount);
            price = price-dis;
            setproduct_price(price);
            return price;
        }

	public double calculate_sale_price(double purchase_price, double percent_profit){
		sale_price =  purchase_price / ( 1 - (percent_profit / 100));
		return sale_price;
	}
        
        

        @Override
	public String toString(){
            
		return "Product Class { "+
		"\n\tproduct_name :"+product_name+
		"\n\tproduct_price :"+product_price+
                "\n\tproduct_discount_price :"+calculate_discount_price(getProduct_discount_price())+
		"\n\tproduct_purchased_on :"+product_purchased_on+
		"\n\tproduct_percent_profit :"+product_percent_profit+
		"\n\tproduct_sale_price :"+calculate_sale_price(getproduct_price(),getproduct_percent_profit())+
		"\n}";
	}
}