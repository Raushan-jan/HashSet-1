import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> hashSet= new HashSet<>();
        hashSet.add(new Person("Katya"));
        hashSet.add(new Person("Lera"));
        hashSet.add(new Person("Katya"));
        hashSet.add(new Person("Lera"));
        System.out.println(hashSet);

    }
}
