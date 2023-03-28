package org.homework_curs7.advertising;

public class Advertising {
    private AdvertisingProvider advertisingProvider;
    private int noOfPromotedAds = 100;

    public void setAdvertisingProvider(AdvertisingProvider advertisingProvider) {
        this.advertisingProvider = advertisingProvider;
    }

    public void seeNoOfPromotedAds() {
        for (int i = 0; i < noOfPromotedAds; i++) {
            advertisingProvider.adMessage();
        }
    }

    public void makePayment() {
        advertisingProvider.pay(2354.85);
    }
}
