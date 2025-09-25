public class Abc {

    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static class MainMethod {

        public static void main(String[] args) {
           Abc abc = new Abc();
           abc.i=10;
           abc.j=20;
           Abc abc1 = abc;

            System.out.println(abc);
           abc1.j=40;
           System.out.println(abc1);

        }
    }
}
