package org.lessons.shop;

import java.math.BigDecimal;

// Creare la classe Prodotto che gestisce i prodotti dello shop.

// Un prodotto è caratterizzato da:-codice(numero intero)-nome-marca-prezzo-iva

// Usate opportunamente i livelli di accesso(public,private),i costruttori,i metodi getter e setter ed eventuali altri metodi di“utilità”per fare in modo che:-il codice prodotto sia accessibile solo in lettura-gli altri attributi siano accessibili sia in lettura che in scrittura

// Lo shop gestisce diversi tipi di prodotto:-Smarphone,caratterizzati anche dal codice IMEI e dalla quantità di memoria-Televisori,caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no-Cuffie,caratterizzate dal colore e se sono wireless o cablate

// Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

public class Product {
    protected int code;
    protected String name = "";
    protected String brand = "";
    protected BigDecimal price = new BigDecimal("0");
    protected Float iva = 0f;

    public Product(String name, String brand, BigDecimal price, Float iva) {
        this.code = (int) (Math.random() * 99999) + 1;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    public int getProductCode() {
        System.out.println(this.name + "'s product code is: " + this.code);
        return this.code;
    }

    public String getProductName() {
        System.out.println("this product's name is: " + this.name);
        return this.name;
    }

    public void setProductName(String newProductName) {
        if (newProductName != null && !newProductName.isEmpty()) { // use isEmpty to avoid empty strings, and different
                                                                   // than null to avoid null pointer exception if an
                                                                   // uninitialized variable is passed
            this.name = newProductName;
        }
    }

    public String getProductBrand() {
        System.out.println(this.name + "'s brand is:" + this.brand);
        return this.brand;
    }

    public void setProductBrand(String newProductBrand) {
        if (newProductBrand != null && !newProductBrand.isEmpty()) {
            this.brand = newProductBrand;
        }
    }

    public BigDecimal getProductPrice() {

        System.out.println(this.name + "'s price is:" + this.price);
        return this.price;
    }

    public void setProductPrice(BigDecimal newProductprice) {
        if (newProductprice.compareTo(BigDecimal.ZERO) > 0) {
            this.price = newProductprice;
        }
    }

    public Float getProductIva() {

        System.out.println(this.name + "'s iva is:" + this.iva);
        return this.iva;
    }

    public void setProductIva(Float newProductIva) {
        if (newProductIva != null && newProductIva >= 0f) {
            this.iva = newProductIva;
        }
    }

    @Override
    public String toString() {
        return " Product name: " + this.name + "\n Product brand: " + this.brand + "\n Product price: " + this.price
                + "\n Product Iva: " + this.iva + "\n Product code: " + this.code;
    }

}
