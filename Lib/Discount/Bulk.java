package Lib.Discount;
import Lib.Cartitem;
/**
 *  Bulk ซื้อเยอะลดราคา 
 */
public class Bulk implements DiscountStrategy{
    private final int minquatity ;
    private final double Discountpercentage;
    public Bulk (int minquatity, double Discountpercentage){
        this.minquatity = minquatity;
        this.Discountpercentage = Discountpercentage;
    }
    @Override
    public double calculatePrice(Cartitem item) {
        // TODO Auto-generated method stub
        double nomalprice = item.getProduct().price()* item.getQuantity();
        if (item.getQuantity() > minquatity) {
            return nomalprice * (1 - Discountpercentage);
        }
        return nomalprice;
    }
    
}
