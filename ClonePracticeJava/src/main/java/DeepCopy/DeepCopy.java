package DeepCopy;

public class DeepCopy {

    public static void main(String[] args) {
        Person person = new Person();
        person.age=23;
        person.score=100;

        System.out.println(person);

        Person person1 = new Person();
        person1.age= person.age;
        person1.score= person.score;

        person1.age= 45;
        System.out.println(person1);
    }
}
