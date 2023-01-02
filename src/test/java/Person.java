public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person vitya = new Person("Vitya", 35);
        Person vova = new Person("Vova", 66);
        Person dima = new Person("Dima");
    }
}
