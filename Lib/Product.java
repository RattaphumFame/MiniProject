package Lib;
public final class Product {
    private final String productId;
    private final String productName;
    private final double price;
    // Rep Invariant (Ri)
    // - productid and productname are not null or blank
    // - price > 0
    public void checkrep(){
        if (productId == null || productId.isBlank()) {
            throw new RuntimeException("Ri violate : productId");
        }
        if (productName == null || productName.isBlank()) {
            throw new RuntimeException("RI violated :  productName");
        }
        if (price < 0) {
            throw new RuntimeException("RI violated : price");
        }
    }
    public Product(String productId,String productName,double price ){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        checkrep();
    }
    public String productId(){
        return productId;
    }
    public String productName(){
        return productName;
    }
    public double price(){
        return price();
    }
    /** 
     * เปรียบเทียบ product สองชิ้นโดยใช้product
     * @param obj อ็อบเจกต้องการเปรียบเทียบ
     * @return true หาก productid เหมือนกัน
     * 
    */
    public boolean equals(Object obj){
        if (this == obj) 
        { 
           return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return product.equals(obj);
        
    }

}