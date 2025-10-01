package practice1;

import java.util.HashMap;

public class LaunchMap1 {

    public static void main(String[] args) {
        /*in map the data will be in key, value pair
        Key must be unique and value need not to be unique
        key can be null
        value can be null
        */

        /*HashMap hm = new HashMap();
        hm.put(1, "Java");
        hm.put(2, "C#");
        hm.put(3, "Python");
        hm.put(4, "C++");
        hm.put(5, "JavaScript");
        hm.put(6, "Microservices");

        System.out.println(hm);

        Telusko t1 = new Telusko(1, "Java");

        HashMap hm1 = new HashMap();

        hm1.put(Sohail, "Moinuddin Khan");
        hm1.put("Moin","Khan");*/
        System.out.println("************");

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(1, "C#");//Overriding
        hm.put(3, "Python");
        System.out.println(hm);

      /*  Telusko telusko = new Telusko(1,"Java");
        Telusko telusko1 = new Telusko(1,"Java");
        HashMap hm4 = new HashMap();
        hm4.put(telusko, "Python");
        hm4.put(telusko1, "C#");
        hm4.put(3, "Python");
        System.out.println(hm4);//{3=Python, Telusko{id=1, courseName='Java'}=C#, Telusko{id=1, courseName='Java'}=Python}*/

        Telusko telusko = new Telusko(1,"Java");
        Telusko telusko1 = new Telusko(1,"Java");
        HashMap hm4 = new HashMap();
        hm4.put(telusko.id, "Python");
        hm4.put(telusko1.courseName, "C#");
        hm4.put(3, "Python");
        System.out.println(hm4);//{1=Python, Java=C#, 3=Python}


    }
}
