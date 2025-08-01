import Lib.*;

public class Test1 {
    public static void main(String[] args) {
        Product a = new Product("P001", "Appple", 10.0);
        Product b = new Product("P001", "Soda", 5.0);
        Product c = new Product("P001", "Bread", 20.0);
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(a);
        catalog.addProduct(b);
        catalog.addProduct(c);
        Cartitem item1 = new Cartitem(catalog.findByld("P001"), 2);
        Cartitem item2 = new Cartitem(b, 3);
    }
}
