package br.com.streaming.model;
import br.com.streaming.calculator.Classification;

public class Film extends Title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
    this.director = director;
    }

    @Override
    public int getClassification() {
        int average = (int) (averageRating() / 2);
        return average;
    }
}