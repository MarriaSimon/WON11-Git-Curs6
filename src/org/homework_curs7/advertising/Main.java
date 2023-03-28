package org.homework_curs7.advertising;

public class Main {
    public static void main(String[] args) {
        Advertising advertising = new Advertising();
        advertising.setAdvertisingProvider(new Print());
        advertising.seeNoOfPromotedAds();
        advertising.makePayment();
    }
}
