package Lab09;
public class Book extends ProductClass{

    private String book_author;

    public Book() {
    }
    
    public Book(String book_author, String product_name, double product_price, Date product_purchased_on, double product_percent_profit, double product_percent_discount) {
        super(product_name, product_price, product_purchased_on, product_percent_profit, product_percent_discount);
        this.book_author = book_author;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public double getProduct_percent_profit() {
        return product_percent_profit;
    }

    public void setProduct_percent_profit(double product_percent_profit) {
        this.product_percent_profit = product_percent_profit;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
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

    public Date getProduct_purchased_on() {
        return product_purchased_on;
    }

    public void setProduct_purchased_on(Date product_purchased_on) {
        this.product_purchased_on = product_purchased_on;
    }

    
        
    @Override
    public double getPaymentAmount() {
        return super.product_price;
    }

	public String toString(){
		System.out.println(super.toString());
		return "Book Class {"+
			"\n\tAuthor Name :"+book_author+
			"\n}";
	}

   
}