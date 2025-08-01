package Lib;
public class Cartitem {
    
    private final Product product;
    private int quantily;
    public Cartitem(Product product,int quantily ){
         this.product = product;
         this.quantily = quantily;
         checkrep();
    }
    /**
     * สร้างรายการสินค้าในตะกร้า
     * @param product ไม่เท่ากับnull
     * @param quantity จำนวนสินค้าที่ต้องการ มากกว่า0
     */
    public void checkrep(){
        if (product == null) {
            throw new RuntimeException("RI violated : product is null ");
        }
        if (quantily <= 0) {
            throw new RuntimeException("RI violated : quamtity < 0 ");
        }
    }
    public void increaseQuantity(int amount){
        if (amount > 0) {
            this.quantily += amount;
        }
        checkrep();
    }

}
