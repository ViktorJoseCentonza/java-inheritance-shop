package org.lessons.shop;

import java.math.BigDecimal;

public class Flatscreen extends Product {
    protected int screenSize = 0;
    protected boolean isSmart = false;

    public Flatscreen(String name, String brand, BigDecimal price, BigDecimal iva, int screenSize, boolean isSmart) {
        super(name, brand, price, iva);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    public int getFlatscreenscreenSize() {
        System.out.println(this.name + "'s screen size is: " + this.screenSize);
        return this.screenSize;
    }

    public void setFlatscreenscreenSize(int newScreenSize) {
        if (newScreenSize > 0) {
            this.screenSize = newScreenSize;
        }
    }

    public boolean getIsFlatscreenSmart() {
        System.out.print(this.name);
        if (this.isSmart) {
            System.out.print(" is smart");
        } else {
            System.out.print(" is not smart");
        }
        return this.isSmart;
    }

    public void setIsFlatscreenSmart(boolean newIsSmart) {
        this.isSmart = newIsSmart;
    }

    @Override
    public void setProductFinalPrice(boolean hasFideltyCard) {
        if (hasFideltyCard) {
            if (this.isSmart == false) {
                this.finalPrice = this.finalPrice.subtract(this.finalPrice.multiply(Cart.discount10));
            }
            this.finalPrice = this.finalPrice.subtract(this.finalPrice.multiply(Cart.discount2));
        }
    }

    @Override
    public String toString() {
        return " Flatscreen name: " + this.name + "\n Flatscreen brand: " + this.brand + "\n Flatscreen price: "
                + this.price
                + "\n Flatscreen Iva: " + this.iva + "\n final price is: "
                + this.finalPrice + "\n Flatscreen code: " + this.code + "\n Flatscreen screen size: "
                + this.screenSize + "\n Flatscreen is smart: " + this.isSmart;
    }

}
