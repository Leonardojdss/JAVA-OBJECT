package br.com.streaming.calculator;

public class FilterRecomendation {
    private String recomendation;

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Recomendado");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Não recomendado");
        } else if (classification.getClassification() < 2) {
            System.out.println("Não muito recomendado");
        }
    }
}
