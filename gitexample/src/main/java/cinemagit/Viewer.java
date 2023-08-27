package cinemagit;

public class Viewer {
    private String nickname;
    private int age;
    private int countOfFilms;

    public Viewer(int age){
        this.setAge(age);
    }

    public Viewer(String nickname, int age, int countOfFilms){
        this.setNickname(nickname);
        this.setAge(age);
        this.setCountOfFilms(countOfFilms);
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

    private void setCountOfFilms(int countOfFilms) {
        this.countOfFilms = (countOfFilms < 0) ? 0 : countOfFilms;
    }
}
