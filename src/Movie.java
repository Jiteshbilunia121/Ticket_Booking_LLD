import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    private final LocalDate releaseDate;
    private final String genre;
    private final List<Theater> theaters; // Theaters where the movie is playing

    public Movie(String title, LocalDate releaseDate, String genre, List<Theater> theaters) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.theaters = new ArrayList<>(theaters); // Defensive copy for immutability
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public List<Theater> getTheaters() {
        return new ArrayList<>(theaters); // Return a copy to maintain immutability
    }
}
