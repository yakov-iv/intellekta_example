package cinemagit;

import java.util.ArrayList;

public class Viewer {
    private String nickname;
    private int age;
    private int countOfFilms;
    private ArrayList<Cinema> cinemas;

    public Viewer(int age){
        this.setAge(age);
    }

    public Viewer(String nickname, int age, ArrayList<Cinema> cinemas){
        this.setNickname(nickname);
        this.setAge(age);
        this.setCountOfFilms();
        this.setCinemas(cinemas);
    }

    private String getNickname() {
        return nickname;
    }

    private void setNickname(String nickname) {
        this.nickname = (nickname == null || nickname.isBlank()) ? "" : nickname;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = (age < 0) ? 0 : age;
    }

    private int getCountOfFilms() {
        return countOfFilms;
    }

    private void setCountOfFilms() {
        this.countOfFilms = getCinemas().size();
    }

    private ArrayList<Cinema> getCinemas() {
        return cinemas;
    }

    private void setCinemas(ArrayList<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}
