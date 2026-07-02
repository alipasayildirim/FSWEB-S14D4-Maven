package org.example.model;

public class Bread extends ProductForSale{
    private String name;

    public Bread (String type, double price, String description,String name){
        super(type,price,description);
        this.name = name;
    }
    public Bread(String type, double price, String description) {
        super(type, price, description);

    }
    public String getName() {
        return name;
    }
    @Override
    public void showDetails() {
        System.out.println("İsim: " + this.name);
        System.out.println("Tür: " + getType());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Fiyat: " + getPrice() +" TL");
    }
}
