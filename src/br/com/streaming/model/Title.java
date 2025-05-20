package br.com.streaming.model;

public class Title {

    private String name;
    private int year;
    private boolean isAvailableOnAcount;
    private double sumRating;
    private int totalAssessment;
    private double duration;

    public void displayTechnicalSheet(){
       System.out.println("Titulo: " + name);
       System.out.println("Ano de Lançamento: " + year);
    }

    public void rating(double ratingUser){
        sumRating += ratingUser;
        totalAssessment++;
    }

    public double avarageRating(){
        return sumRating / totalAssessment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getSumRating() {
        return sumRating;
    }

    public int getTotalAssessment() {
        return totalAssessment;
    }
    
    public int getDurationInMinutes() {
        return (int) (duration);
    }

}