package br.com.streaming.calculator;

// import br.com.streaming.model.Film;
// import br.com.streaming.model.Serie;
import br.com.streaming.model.Title;

public class CalculatorOfTime {
    private int durarionTotal;

    public int getTimeTotal() {
        return this.durarionTotal;
    }

    // public void include(Film film) {
    //     this.durarionTotal += film.getDurationInMinutes();
    // }

    // public void include(Serie serie) {
    //     this.durarionTotal += serie.getDurationInMinutes();
    // }

    public void include(Title tile) {
        this.durarionTotal += tile.getDurationInMinutes();
    }
}