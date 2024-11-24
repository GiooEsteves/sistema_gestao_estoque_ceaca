package br.com.core.inventory;

public class Product {
    public String name;
    public int quantity;
    private float unitPrice;
    public int id;

    public Product(int id, String name, int quantity, float unitPrice){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Float getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }
}
