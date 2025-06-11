package org.lessons.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iphone 12", "apple", new BigDecimal(799.99), 0.22f, 64);

        iphone.getProductCode();

        Flatscreen samsung = new Flatscreen("odyssey something", "samsung", new BigDecimal(599.99), 0.22f, 27, false);

        samsung.getFlatscreenscreenSize();
        samsung.getIsFlatscreenSmart();

        Headphone oppo = new Headphone("veryCoolHeadphones", "oppo", new BigDecimal(19.99), 0.22f, "white", true);

        oppo.getIsHeadphoneWireless();
        oppo.getProductBrand();
        oppo.getHeadphoneColor();
    }
}
