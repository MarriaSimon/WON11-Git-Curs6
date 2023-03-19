package homework_curs7.advertising;

public class Facebook implements AdvertisingProvider {
    private static double pricePerAd = 35.49;
    private int adQuantity = 3;
    private double amountToPay = 0;

    @Override
    public String adMessage() {
        adQuantity++;
        amountToPay += adQuantity;
        return " laptops ";
    }

    @Override
    public int adQuantity() {
        return adQuantity;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("Facebook was paid: " + amount);
            System.out.println("Product promoted: " + adMessage());
            System.out.print("number of commercials: " + adQuantity());
            return true;
        }
        return false;
    }
}

