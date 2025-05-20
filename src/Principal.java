import br.com.streaming.calculator.CalculatorOfTime;
import br.com.streaming.model.Film;
import br.com.streaming.model.Serie;

public class Principal {
    public static void main(String[] args) {
       // Filme 
       Film myFilm = new Film();
       myFilm.setName("Star Wars");
       myFilm.setDuration(200);
       myFilm.setYear(1977);

       myFilm.displayTechnicalSheet();
       myFilm.rating(8);
       myFilm.rating(9);
       myFilm.rating(9.5);

       System.out.println("Total de avaliações: " + myFilm.getTotalAssessment());
       System.out.println("Média das avaliações: " + myFilm.avarageRating());

       // Serie
       Serie supernatural = new Serie();
       supernatural.setName("Supernatural");
       supernatural.setYear(2005);
       System.out.println("/////////////////////");
       supernatural.displayTechnicalSheet();
       supernatural.setSeasons(15);
       supernatural.setEpisodesPerSeason(22);
       supernatural.setMinutesPerEpisode(42);

       System.out.println("Duração toral: " + supernatural.getDurationInMinutes() + " minutos");


       // Outro filme
       Film film2 = new Film();
       film2.setName("Monster Inc.");
       film2.setDuration(180);
       film2.setYear(2001);
       System.out.println("/////////////////////");
       film2.displayTechnicalSheet();
       film2.rating(10);
       film2.rating(9);
       film2.rating(9);

       System.out.println("Total de avaliações: " + film2.getTotalAssessment());
       System.out.println("Média das avaliações: " + film2.avarageRating());

       // Calculadora de tempo
       CalculatorOfTime calculator = new CalculatorOfTime();
       calculator.include(myFilm);
       calculator.include(film2);
       calculator.include(supernatural);
       System.out.println(calculator.getTimeTotal() + " minutos");
    }
}
