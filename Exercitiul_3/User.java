public class User {

    private String name;
    private String phone;
    private String location;
    private String mail;
    private String facebookAccount;

    public User (){

    }

    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public String getLocation() {
        return location;
    }
}