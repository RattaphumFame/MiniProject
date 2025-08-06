package Lib;
import java.util.ArrayList;
/**
 * คลาสทำหน้าที่เป็นสต็อกสินค้า (Repository)
 */

public class ProductCatalog {
    ArrayList<Product> products = new ArrayList<>();
    // RI: products list is not null, contains no null elements, and no duplicate products.
    // AF : AF(products) = A catalog od all available products.
    private void checkrep(){
        if (products == null  ) {
            throw new RuntimeException("RI violated: products");
        }
        for (int i = 0; i < products.size(); i++) {
            for (int j = i; j < products.size(); j++) {
                if (products.get(i).equals(products.get(j))) {
                    throw new RuntimeException("RI violed : finByld");
                }
            }
        }
    }
    public ProductCatalog(){
        checkrep();
    }
    /**
     * เพิ่มสินค้าใหม่เข้าสู่ตลาดสินค้า
     * @param product
     */
    public void addProduct(Product product){
        if (products != null && !products.contains(product) ) {
            products.add(product);
        }
        checkrep();
    }
    /**
     * ค้นหาสินค้าจากรหัสสินค้า
     * @param productID
     * @return อ็อบเจกต์ product หากพบ,หรือ null 
     */
    public Product findByld(String productID){
        for( Product p : products){
            if (p.productId().equals(productID)) {
                return  p;
            }
        }
        return null;
    }
}
