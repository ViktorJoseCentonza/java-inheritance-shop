package org.lessons.shop;

import java.math.BigDecimal;

public class Headphones extends Product {
    protected String headphonesColor = "";
    protected boolean isWireless = false;

    public Headphones(String name, String brand, BigDecimal price, BigDecimal iva, String headphonesColor,
            boolean isWireless) {
        super(name, brand, price, iva);
        this.headphonesColor = headphonesColor;
        this.isWireless = isWireless;
    }

    public String getHeadphonesColor() {
        System.out.println(this.name + "'s color is: " + this.headphonesColor);
        return this.headphonesColor;
    }

    public void setHeadphonesColor(String newHeadphonesColor) {
        if (newHeadphonesColor != null && newHeadphonesColor != "") {
            this.headphonesColor = newHeadphonesColor;
        }
    }

    public boolean getIsHeadphonesWireless() {
        System.out.println("");
        System.out.print(this.name);
        if (this.isWireless) {
            System.out.println(" is Wireless");
        } else {
            System.out.println(" is not Wireless");
        }
        return this.isWireless;
    }

    public void setIsHeadphonesWireless(boolean newisWireless) {
        this.isWireless = newisWireless;
    }

    @Override
    public void setProductFinalPrice(boolean hasFideltyCard) {

        if (hasFideltyCard) {
            if (this.isWireless == false) {
                this.finalPrice = this.finalPrice.subtract(this.finalPrice.multiply(Cart.discount7));
            }
            this.finalPrice = this.finalPrice.subtract(this.finalPrice.multiply(Cart.discount2));
        }
    }

    @Override
    public String toString() {
        return " Headphones name: " + this.name + "\n Headphones brand: " + this.brand + "\n Headphones price: "
                + this.price
                + "\n Headphones Iva: " + this.iva + "\n final price is: "
                + this.finalPrice + "\n Headphones code: " + this.code + "\n Headphones color: "
                + this.headphonesColor + "\n Headphones is wireless: " + this.isWireless;
    }

}
