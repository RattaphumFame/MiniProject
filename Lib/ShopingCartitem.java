package Lib;

import java.util.ArrayList;
import Lib.*;
public class ShopingCartitem<PricingService> {
    private final ArrayList<Cartitem> item = new ArrayList<Cartitem>();
    private final PricingService pricingService;
    private final ProductCatalog productCatalog;
     public ShopingCartitem(PricingService  pricingService,ProductCatalog productCatalog){
      this.pricingService = pricingService;
      this.productCatalog = productCatalog;
      checkRep();
    }
    public void removeItem(String productId){
       for (int i = 0; i < item.size(); i++) {
            if (item.get(i).getProduct().productId().equals(productId)) {
                item.remove(i);
                checkRep();
                break;
            }
       }
    }

    public double getTotalPrice(){

        double tatol = 0;
        for (Cartitem item : item) {
            tatol += PricingService.calculatePrice(item);
        }
        return tatol;
    }


    public int getItemCount(){
        return item.size();
    }

    public void clearCart(){
        item.clear();
        checkRep();
    }
    private void checkRep(){
        if (item == null) {
            throw new RuntimeException("item is null ");
        }
        ArrayList<Product> seen = new ArrayList<>();

        for (Cartitem item : item) {
            if (item == null) {
                throw new RuntimeException("item is null ");
   
            }
        checkRep();

            Product product = item.getProduct();
            if (seen.contains(product)) {
                throw new RuntimeException(" duplicate product in cart");
            
            }
            seen.add(product);
        }
    }
}
