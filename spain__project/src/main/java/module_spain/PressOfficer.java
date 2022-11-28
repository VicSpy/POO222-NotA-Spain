package module_spain;

/**
 * @author Bruno Ferrari Vincensi
 */
public class PressOfficer extends Person {

    private String tel1;
    private String tel2;
    private String emailAccount;

    public PressOfficer(String name, String tel1, String tel2, String emailAccount) {
        super(name);
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.emailAccount = emailAccount;
    }

    public PressOfficer() {
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }
}
