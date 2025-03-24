package sport;

public class Match {

    private String title;
    private ScheduledDate scheduledDate;
    private Athlete[] athletesList = new Athlete[10];
    private boolean cancelled;
    

    public Match(String title, ScheduledDate scheduledDate) {
        this.title = title;
        this.scheduledDate = scheduledDate;
    }

    public void addAthleteToMatch(Athlete athlete) {
        for (int i = 0; i < athletesList.length; i++) {
            if (athletesList[i] == null) {
                athletesList[i] = athlete;
                break;
            }
        }
    }

    public void removeAthleteFromMatch(Athlete athlete) {
        for (int i = 0; i < athletesList.length; i++) {
            if (athletesList[i] == athlete) {
                athletesList[i] = null;
                break;
            }
        }
    }

    public boolean removeAthleteFromMatch(int athleteNumber) {
        for (int i = 0; i < athletesList.length; i++) {
            if (athletesList[i].getAthleteNumber() == athleteNumber) {
                athletesList[i] = null;
                return true;
            }
        }
        return false;
    }

    public int getNumberOfAthletesInMatch() {
        int count = 0;
        for (int i = 0; i < athletesList.length; i++) {
            if (athletesList[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean athleteExists(String surtitle) {
        for (int i = 0; i < athletesList.length; i++) {
            if (athletesList[i] != null && athletesList[i].getSurname().equals(surtitle)) {
                return true;
            }
        }
        return false;
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

    public Athlete[] getAthletesList() {
        return athletesList;
    }

    public void setAthletesList(Athlete[] athletesList) {
        this.athletesList = athletesList;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String toString() {
        return "Match:" + title + "," + "ScheduledDate:" + scheduledDate.toString() + "," + cancelled;
    }
}
