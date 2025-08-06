package Lib.Discount;
import Lib.Cartitem;
/**
 *  ซื้อเยอะ Bogo ได้แถม 1
 */
public class Bogo implements DiscountStrategy {

    @Override
    public double calculatePrice(Cartitem item) {
        // TODO Auto-generated method stub
        int quantity = item.getQuantity();
        double price = item.getProduct().price();
        int quantitytopay = (quantity/2)+(quantity %2);
        return price* quantitytopay;
        
    }
    
}
