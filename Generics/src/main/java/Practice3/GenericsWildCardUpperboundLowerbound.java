package Practice3;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCardUpperboundLowerbound {

    public static void main(String[] args) {

        //wild card
        //upperbound
        //lowerbound

       /* Object obj = new Object()
                String s = new String("Java");

        obj = s;
        s=obj;//error or downcast*/

        Human h = new Human();

        Student s = new Student();

        h=s;
       // s=h;//ic//downcasting

    /* ArrayList<Human>   humanList1=new ArrayList<>();
     ArrayList<Student> studList1=new ArrayList<>();*/
     //humanList1=studList1;//ce

       /* ArrayList<?>   humanList1=new ArrayList<>();//unknown --> ? --> wild card
        ArrayList<Student> studList1=new ArrayList<>();*/

//        humanList1=studList1;

        ArrayList<? extends Human>   humanList1=new ArrayList<>();// upperbound
        ArrayList<Student> stuList1 = new ArrayList<>();
        ArrayList<Employee> emplList1 = new ArrayList<>();

        humanList1=stuList1;
        /*humanList1=emplList1;//ce*/

        ArrayList<? super Human> humanList2=new ArrayList<>(); //lowerbound
        ArrayList<Student> stuList2 = new ArrayList<>();
        ArrayList<Employee> emplList2=new ArrayList<>();
        ArrayList<Object> objList2 = new ArrayList<>();

        /*humanLis21=stuList2;//ce
        humanList2=emplList2;//ce*/

        humanList2=objList2;





        ArrayList<Student> studentAlien = new ArrayList<>();
        studentAlien.add(new Student());
        studentAlien.add(new Student());
        studentAlien.add(new Student());

        alien(studentAlien);


        ArrayList<Human> humanList3=new ArrayList<>();
        humanList3.add(new Human());
        humanList3.add(new Human());

        alien(humanList3);




    }

    public static void alienOne(List<?> list){//-->List<?> which means people can pass any data(ArrayList or LinkedList)

    }

    public static void alienTwo(List<Human> list){//-->List<Human> which means people can pass only Human data

    }


    public static void alien(List<? extends Human> list){//-->List<Human> which means people can pass only Human data
        //

        for(Human h:list){
            System.out.println(h);
        }
    }

}
