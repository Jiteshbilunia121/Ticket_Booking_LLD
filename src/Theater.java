import java.time.LocalTime;
import java.util.*;

public class Theater {
    private final String name;
    private final String city;
    private final Map<Movie, List<Showtime>> showtimes; // Each movie has multiple showtimes

    public Theater(String name, String city) {
        this.name = name;
        this.city = city;
        this.showtimes = new HashMap<>();
    }

    // Method to add a movie with its showtimes
    public void addMovieShowtimes(Movie movie, List<Showtime> times) {
        showtimes.put(movie, new ArrayList<>(times)); // Defensive copy
    }

    // Get showtimes for a specific movie
    public List<Showtime> getShowtimes(Movie movie) {
        return showtimes.getOrDefault(movie, Collections.emptyList());
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
