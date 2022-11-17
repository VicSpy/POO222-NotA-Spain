package modules_espanha;

/**
 * @author Bruno Ferrari Vincensi
 */
public class TechnicalCommittee extends Person {

    private String nickname;
    private String role;
    private Integer age;

    public TechnicalCommittee(String name, String nickname, String role, Integer age) {
        super(name);
        this.nickname = nickname;
        this.role = role;
        this.age = age;
    }

    public TechnicalCommittee() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
