package org.lessons.shop;

import java.math.BigDecimal;

public class Headphone extends Prodotto {
    protected String headphoneColor = "";
    protected boolean isWireless = false;

    public Headphone(String name, String brand, BigDecimal price, Float iva, String headphoneColor,
            boolean isWireless) {
        super(name, brand, price, iva);
        this.headphoneColor = headphoneColor;
        this.isWireless = isWireless;
    }

    public String getHeadphoneColor() {
        System.out.println(this.name + "'s color is: " + this.headphoneColor);
        return this.headphoneColor;
    }

    public void setHeadphoneColor(String newHeadphoneColor) {
        if (newHeadphoneColor != null && newHeadphoneColor != "") {
            this.headphoneColor = newHeadphoneColor;
        }
    }

    public boolean getIsHeadphoneWireless() {
        System.out.println("");
        System.out.print(this.name);
        if (this.isWireless) {
            System.out.println(" is Wireless");
        } else {
            System.out.println(" is not Wireless");
        }
        return this.isWireless;
    }

    public void setIsHeadphoneWireless(boolean newisWireless) {
        this.isWireless = newisWireless;
    }

}
