package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {

                if (o1%10 > o2%10) {
                    return 1;

                }else{
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(nums, com);
        System.out.println(nums);

        //Sort the digits 43,31,72,29 based on the last digit



    }
}
