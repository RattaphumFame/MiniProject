package Lib;
import java.util.ArrayList;

public class ShoppingCart {


    private final ArrayList<Cartitem> items;
    private final PrintService pricingService;
    private final ProductCatalog productCatalog;


/**
 * 
 * @param pricingService ราคาสินค้า
 * @param productCatalog สต็อกสินค้า
 */
    public ShoppingCart(PrintService  pricingService,ProductCatalog productCatalog){
      this.items = new ArrayList<>();
      this.pricingService = pricingService;
      this.productCatalog = productCatalog;
      checkRep();
    }
    public void addItem(String productID,int quantity){
         if (quantity <= 0) return;
        Product product = productCatalog.findByld(productID);

        
        if (product == null) {
            return ;
        }

        for (Cartitem item : items) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity(quantity);
                checkRep();
                return;
            }
        }

        items.add(new Cartitem(product, quantity));
        checkRep();
    }
    public void removeItem(String productId){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().productId().equals(productId)) {
                items.remove(i);
                checkRep();
                break;
            }
       }
    }
    /**
     * 
     * @return checkRep()
     */
    public double getTotalPrice(){

        double tatol = 0;
        for (Cartitem item : items) {
            tatol += pricingService.calculateItemPrice(item);
        }
        return tatol;
    }
    /**
    * 
    * @return
    */

    public int getItemCount(){
        return items.size();
    }

    public void clearCart(){
        items.clear();
        checkRep();
    }
    private void checkRep(){
        if (items == null) {
            throw new RuntimeException("item is null ");
        }
        ArrayList<Product> seen = new ArrayList<>();

        for (Cartitem item : items) {
            if (item == null) {
                throw new RuntimeException("item is null ");
   
            }

            Product product = item.getProduct();
            if (seen.contains(product)) {
                throw new RuntimeException(" duplicate product in cart");
            
            }
            seen.add(product);
        }
    }
}