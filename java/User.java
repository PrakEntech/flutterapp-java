package java;
public class User {
    private String name;
    private String emailid;
    private int age;

    public User() {} // Required for Firebase

    public User(String name, String emailid, int age) {
        this.name = name;
        this.emailid = emailid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public int getAge() {
        return age;
    }
}