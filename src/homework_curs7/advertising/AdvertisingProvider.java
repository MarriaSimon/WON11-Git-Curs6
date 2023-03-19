package homework_curs7.advertising;

public interface AdvertisingProvider {
    String adMessage();
    int adQuantity();
    boolean pay(double amount);
}
