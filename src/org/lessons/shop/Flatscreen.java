package org.lessons.shop;

import java.math.BigDecimal;

public class Flatscreen extends Prodotto {
    protected int screenSize = 0;
    protected boolean isSmart = false;

    public Flatscreen(String name, String brand, BigDecimal price, Float iva, int screenSize, boolean isSmart) {
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

}
