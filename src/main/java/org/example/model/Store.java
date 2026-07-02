package org.example.model;

import org.example.rpg.Monster;
import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Tatlı",49.99,"Sütlü Çikolata","Milka");
        products[1] = new Coke("İçecek",34.99,"Soğuk içiniz","Pepsi");
        products[2] = new Bread("Gıda", 15.00,"Tam Buğaday","Somun");

        listProducts(products);
    Monster troll = new Troll("Dağ Trolü",100,15);
        System.out.println("Troll Attack : " + troll.attack());
    }



    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product : products){
        if (product != null ){
            product.showDetails();
            System.out.println("-------------------");
        }
    }
    }
}