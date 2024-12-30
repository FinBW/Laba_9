package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        GoldAntilopa gold = new GoldAntilopa("Losad", 12.05, 200, GoldAntilopa.givedmoney.HIGH);
        GoldAntilopa gold2 = new GoldAntilopa("Conb", 11.12, 234, GoldAntilopa.givedmoney.LOW);
        GoldAntilopa gold3 = new GoldAntilopa("Gorbunok", 3.37, 443, GoldAntilopa.givedmoney.MEDIUM);
        AnnotationProcessor.createTable(gold);
        AnnotationProcessor.insertIntoTable(gold);
        AnnotationProcessor.insertIntoTable(gold2);
        AnnotationProcessor.insertIntoTable(gold3);
    }
}
