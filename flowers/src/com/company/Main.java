package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pion pion2 = new Pion(13);
        System.out.print("pion\n" + pion2.getPrice());

        Rose rose2 = new Rose(20);
        System.out.print("\nrose\n" + rose2.getPrice());
        Dandelion dandelion2 = new Dandelion(5);
        System.out.print("\ndandelion\n" + dandelion2.getPrice());
        Bouquet bouquet1 = new Bouquet();
        bouquet1.addFlower(pion2).addFlower(rose2).addFlower(dandelion2);
        System.out.println("\nbouquet\n"+bouquet1.getPrice());
    }
}


class Pion extends Flower {
    Pion(double price) {
        super(price, "pink", "pion");
    }
}

class Rose extends Flower {
    Rose(double price) {
        super(price, "red", "rose");
    }
}

class Dandelion extends Flower {
    Dandelion(double price) {
        super(price, "yellow", "dandelione");
    }
}

class Bouquet {
    private double price;
    private List<Flower> flowers = new ArrayList<>();

    double getPrice() {
        return price;
    }

    Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }

}




