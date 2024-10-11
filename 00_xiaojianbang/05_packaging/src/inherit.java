import person_package.Person;

public class inherit extends Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        System.out.println(person.getAge());
    }
}
