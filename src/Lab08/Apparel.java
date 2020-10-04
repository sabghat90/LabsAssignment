package Lab08;
public class Apparel extends Product{
    private String season;
    private double seasonalPrice;
    private double profitPercentage=0.1;

    public Apparel(String season, double seasonalPrice, String nameOfProduct, double purchasePrice, Date date) {
        super(nameOfProduct, purchasePrice, date);
        this.season = season;
        this.seasonalPrice = seasonalPrice;
    }
    @Override
    double getSalePrice()
    {
        return (profitPercentage*purchasePrice)+purchasePrice;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getSeasonalPrice() {
        return seasonalPrice;
    }

    public void setSeasonalPrice(double seasonalPrice) {
        this.seasonalPrice = seasonalPrice;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(double profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    @Override
    public String toString() {
        return super.toString()+ "Apparel{" + "season=" + season + ", seasonalPrice=" + seasonalPrice + ", profitPercentage=" + profitPercentage + ", salesPrice "+getSalePrice()+'}';
    }
    
}
