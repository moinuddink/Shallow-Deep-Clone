package CloneObjectsJavaExample1;

import DeepCopy1.Aa;

public class Abc implements Cloneable {

    int age;
    int score;

    @Override
    public String toString() {
        return "Abc{" +
                "age=" + age +
                ", score=" + score +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
