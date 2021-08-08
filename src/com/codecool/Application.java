package com.codecool;

public class Application {
    public static void main(String[] args) {
        var kopernikArticle = new Article(
                "O ruchach ciał niebieskich",
                "Kopernik",
               10
        );

        // method overloading - przeciążanie metod
        System.out.println(kopernikArticle.createDescription());
        System.out.println(kopernikArticle.createDescription("PREFIX"));

        // getters & setters
        kopernikArticle.setQuotations(20);
        var quotations = kopernikArticle.getQuotations();
        System.out.println("Updated quotations: " + quotations);

        // unchecked exception thrown!
        kopernikArticle.publish();
    }
}
