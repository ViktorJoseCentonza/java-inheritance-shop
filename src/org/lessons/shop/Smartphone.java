package org.lessons.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    protected long imei = 0l;
    protected int deviceMemory = 0;

    public Smartphone(String name, String brand, BigDecimal price, Float iva, int deviceMemory) {
        super(name, brand, price, iva);
        this.imei = (long) (Math.random() * 9_000_000_000_000_000L) + 1_000_000_000_000_000L; // _ used as a comma, not
                                                                                              // read by the compiler
        this.deviceMemory = deviceMemory;
    }

    public long getSmartphoneImei() {
        System.out.println(this.name + "'s IMEI code is: " + this.imei);
        return this.imei;
    }

    public int getSmartphoneDeviceMemory() {
        System.out.println(this.name + "'s memory size is: " + this.deviceMemory + "GB");
        return this.deviceMemory;
    }

    public void setSmartphoneDeviceMemory(int newDeviceMemory) {
        if (newDeviceMemory > 0) { // we do not check for null since newDeviceMemory is a primitive and it cannot
                                   // be assigned as null
            this.deviceMemory = newDeviceMemory;
        }
    }

    @Override
    public String toString() {
        return " Smartphone name: " + this.name + "\n Smartphone brand: " + this.brand + "\n Smartphone price: "
                + this.price
                + "\n Smartphone Iva: " + this.iva + "\n Smartphone code: " + this.code + "\n Smartphone memory: "
                + this.deviceMemory + "\n Smartphone IMEI: " + this.imei;
    }

}
