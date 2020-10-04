
package Lab08;

public class SummerApparel extends Apparel{
    private double seasonalProfit;

    public SummerApparel(double seasonalProfit, String season, double seasonalPrice, String nameOfProduct, double purchasePrice, Date date) {
        super(season, seasonalPrice, nameOfProduct, purchasePrice, date);
        this.seasonalProfit = seasonalProfit;
    }
    public double calculateSeasonalPrice()
    {
        return seasonalProfit + getSalePrice();
    }

    @Override
    public String toString() {
        return super.toString()+ "SummerApparel{" + "seasonalProfit=" + seasonalProfit +",seasonalPrice "+calculateSeasonalPrice()+ '}';
    }
    
}
