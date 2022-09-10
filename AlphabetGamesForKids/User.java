package Alpha3;
public class User {
    private static String name="";
    private static int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }
    public static void setName(String n) {
        name = n;
    }
    public static int getAge() {
        return age;
    }
    public static void setAge(int a) {
        age = a;
    }
}