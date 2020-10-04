
package Lab08;

public class Book extends Product{
    private String author;
private double profitPercentage=0.1;
    public Book(String author, String nameOfProduct, double purchasePrice, Date date) {
        super(nameOfProduct, purchasePrice, date);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
 @Override
    double getSalePrice()
    {
        return (profitPercentage*purchasePrice)+purchasePrice;
    }

    @Override
    public String toString() {
        return super.toString()+ " Book{" + "author=" + author +", salesPrice "+getSalePrice()+ '}';
    }
    
}
