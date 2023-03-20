package homework_curs7.advertising;

public class Mail implements AdvertisingProvider {
    private static double pricePerAd = 10.99;
    private int adQuantity = 5;
    private double amountToPay = 0;

    @Override
    public String adMessage() {
        adQuantity++;
        amountToPay += adQuantity;
        return "smartphones ";
    }

    @Override
    public int adQuantity() {
        return adQuantity;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("Mail was paid: " + amount);
            System.out.println("Product promoted: " + adMessage());
            System.out.print("Number of commercials: " + adQuantity());
            return true;
        }
        return false;
    }
}

