package practice1;

public class Example1 {
    public static void main(String[] args) {
       /*
       * Heap -->
       * String pool -->similar
       * immutability -->for Security reasons
       *
       * */
        String a = "Kunal";//here a and b are pointing to the same object "Kunal"
        String b = "Kunal";
        a  = "KunalKushwaha";//before a it was Kunal it was cleared by garabage collector

        System.out.println(a);
        System.out.println(b);
        System.out.println(a);
    }
}
