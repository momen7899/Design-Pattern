package creational_patterns.prototype;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Momen", "3720809161");
        System.out.println(user);
        User user2 = user.clone();
        System.out.println(user2);
        System.out.println(user.equals(user2));
    }
}
