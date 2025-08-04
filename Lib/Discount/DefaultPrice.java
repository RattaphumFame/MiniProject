package Lib.Discount;
import Lib.Cartitem;
public class DefaultPrice implements DiscountStrategy {

    @Override
    public double calculatePrice(Cartitem item) {
        // TODO Auto-generated method stub
            return item.getProduct().price()*item.getQuantity();
       
    }
    
}
