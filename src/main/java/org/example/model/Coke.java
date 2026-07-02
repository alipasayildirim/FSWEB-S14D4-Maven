package org.example.model;

public class Coke extends ProductForSale{

    private String name;

    public Coke(String type,double price,String description,String name){
        super(type, price, description);
        this.name = name;
    }
    public Coke(String type, double price, String description) {
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
