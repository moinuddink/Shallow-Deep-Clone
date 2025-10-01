package treesetExample1;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class TreeSetExampleByHyderTelusko {

    public static void main(String[] args) {

        /*
        * ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
        * */
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(175);
       // ts.add("175");//duplicate are not allowed
      //  ts.add(null);//-->null data is now allowed
        System.out.println(ts);
        /*gives value higher than 50 when use higher method*/
        System.out.println(ts.higher(50));
        /*ceiling will look for the value 50 is there or not if not as mentioned then it will give the nearest value
         (here in this case we have value 50 so will give 50)*/
        System.out.println(ts.ceiling(50));
        /*
        * in this case 60 is not their then it will give the nearest highest value which is 75
        * */
        System.out.println(ts.ceiling(60));
        /*
        * lower will search lower than the value mentioned which in case here the value is 50 and the nearest lower value to 50 is 25*/
        System.out.println(ts.lower(50));
        /*
        * here in the case of floor it will first look for the value mentioned if yes it will give that values(here we have 50 so it will give 50)
        * if not there then it will return the nearest lowest value*/
        System.out.println(ts.floor(50));
        /*
        * 40 is not there then will go to the nearest value which is 25
        * */
        System.out.println(ts.floor(40));

        /*
        *75,100,125,150,175
        *  */

        System.out.println(ts.tailSet(75));
        /*
        * 25,50
        * */
        System.out.println(ts.headSet(75));




    }
}
