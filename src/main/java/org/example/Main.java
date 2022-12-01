package org.example;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://aaaaaaaaaaaaoop/Screenshot 2022-12-01 at 12.35.24.png");
//        document = TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }
}
