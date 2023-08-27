package cinemagit;

public class Cinema {
    private String title;
    private String genre;
    private double duration;

    public Cinema(String title, String genre, double duration){
        this.setTitle(title);
        this.setGenre(genre);
        this.setDuration(duration);
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    private double getDuration() {
        return duration;
    }

    private void setDuration(double duration) {
        this.duration = duration;
    }
}
