package Lib.Discount;
import Lib.*;
    public interface DiscountStrategy {
    /**
     * คำนวณราคาสินค้า  1 
     * @param item รายการสินค้าในตะกร้า
     * @return ราคาสุทธิหลังใช้โปรโมชัน
     */
    public double calculatePrice(Cartitem item);
}
