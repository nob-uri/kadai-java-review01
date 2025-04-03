
public class Review01 {
    
    public static void main(String[] args) {
        int price = 1500;
        int taxAmount = (int) tax(price);
        int totalPrice = price + taxAmount;
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。" );
    }

    // 税額を計算
    public static final double tax(double price) {
        double taxRate = 0.1;
        double taxAmount = price * taxRate;
        return taxAmount;
    }
}
