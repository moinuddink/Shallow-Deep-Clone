package Practice4;

public class CricketerOne implements Comparable<CricketerOne> {

    int age;
    String name;
    double average;

    public CricketerOne(int age, String name, double average) {
        this.age = age;
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "CricketerOne{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(CricketerOne o) {
        if(this.age > o.age){
            return 1;
        }else {
            return 0;
        }
    }
}
