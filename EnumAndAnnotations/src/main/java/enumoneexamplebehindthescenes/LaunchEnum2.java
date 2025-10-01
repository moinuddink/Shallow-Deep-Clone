package enumoneexamplebehindthescenes;

public class LaunchEnum2 {
    public static void main(String[] args) {
        Result res = Result.PASS;
        //res is type of

        Result.PASS.setMarks(45);
    int marks = Result.PASS.getMarks();
    System.out.println(res);

     int mark=  Result.FAIL.getMarks();
     System.out.println(mark);
    }
}
