package modules_espanha;

import java.time.LocalDate;

/**
 * @author Bruno Ferrari Vincensi
 */
public class Player extends Person {

    private Long number;
    private String nickname;
    private Double height;
    private Double weight;
    private LocalDate birthDate;
    private String position;
    private String currentClub;

    public Player(String name, Long number, String nickname, Double height, Double weight, LocalDate birthDate, String position, String currentClub) {
        super(name);
        this.number = number;
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.position = position;
        this.currentClub = currentClub;
    }

    public Player() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }
}
