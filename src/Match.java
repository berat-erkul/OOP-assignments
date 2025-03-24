import java.time.LocalDate;

public class Match {

    private String title;
    private ScheduledDate scheduledDate;
    private boolean cancelled;

    public Match(String title, ScheduledDate scheduledDate) {
        this.title = title;
        this.scheduledDate = scheduledDate;
    }

    boolean canCompete(Athlete athlete) {
        int currentYear = LocalDate.now().getYear();
        int birthYear = athlete.getBirthDate().getYear();
        int age = currentYear - birthYear;

        return age >= 14 && age <= 18;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ScheduledDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(ScheduledDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
