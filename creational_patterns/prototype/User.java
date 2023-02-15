package creational_patterns.prototype;

public class User {
    public final String name;
    private final String nationalCode;

    public User(String name, String nationalCode) {
        this.name = name;
        this.nationalCode = nationalCode;
    }

    public User(User user) {
        this.name = user.name;
        this.nationalCode = user.nationalCode;
    }

    public User clone() {
        return new User(this);
    }

    @Override
    public boolean equals(Object obj) {
        return ((User) obj).name.equals(name) && ((User) obj).nationalCode.equals(nationalCode);
    }

    @Override
    public String toString() {
        return "User { name: " + name + "" +
                " , national code: " + nationalCode +
                " }";
    }
}
