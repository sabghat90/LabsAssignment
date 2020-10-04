package Lab08;

public abstract class Product{
    private String nameOfProduct;
    protected double purchasePrice;
    private Date date;

    public Product(String nameOfProduct, double purchasePrice, Date date) {
        if(purchasePrice<0.0)
            throw new IllegalArgumentException("price can't be negative");
        this.nameOfProduct = nameOfProduct;
        this.purchasePrice = purchasePrice;
        this.date = date;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
         if(purchasePrice<0.0)
            throw new IllegalArgumentException("price can't be negative");
        this.purchasePrice = purchasePrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract double getSalePrice();

    @Override
    public String toString() {
        return "Product{" + "nameOfProduct=" + nameOfProduct + ", purchasePrice=" + purchasePrice + ", date=" + date + '}';
    }
    
    
}
