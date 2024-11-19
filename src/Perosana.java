public class Perosana {
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;

    public Perosana() {}

    public Perosana(String name, int age, Gender gender, String email, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() { return this.email = email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Perosana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';

    }
}
