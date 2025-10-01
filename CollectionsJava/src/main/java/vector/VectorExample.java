package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(200);
        v.addElement(300);
        v.addElement(400);
     Iterator itr = v.iterator();

     while(itr.hasNext()){//while-->as long as
         System.out.println(itr.next());
     }

        System.out.println("************************");

  Enumeration el = v.elements();

  while(el.hasMoreElements()){
      System.out.println(el.nextElement());
  }
    }
}
