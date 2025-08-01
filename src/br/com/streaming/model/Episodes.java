package br.com.streaming.model;
import br.com.streaming.calculator.Classification;

public class Episodes implements Classification {
    private int number;
    private String title;
    private Serie serie;
    private int totalViews;

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }
    public int getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }
    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}