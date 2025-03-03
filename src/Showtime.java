import java.time.LocalTime;

public class Showtime {
    private final LocalTime time;
    private final int screenNumber;

    public Showtime(LocalTime time, int screenNumber) {
        this.time = time;
        this.screenNumber = screenNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getScreenNumber() {
        return screenNumber;
    }
}
