package com.abstractexample1;

import sampleExample1.AbstractA;


public  abstract class Huntsville extends AbstractA {
    @Override
    public void exampleOfAbs() {
        System.out.println("Here the base class is Huntsville and Super clas is AbstractA");
    }


    /*
    * you can't declare instrace variables, private, local, class variables as abstract
    *
    * in the super class constructor can't be private becuase in the base/sub class of the contructor there is a super
    * keyword present by default it during the process of inheritance it will call the constructor
    * of the parent class
    *
    * there can't be abstract static methods methods
    *
    * you can't declare the class as final because the implemenenting  or base class needs to
    * implements the methods of abstract class
    *
    * */
    // when using the extends keywords and you don't want to implments methods present in the abstract
    //make the class as abstract

    /*
    * */

    public static void teachingOfAbstractionJava(){

    }

    public int marksOfClassASection(){
        return 100;
    }

    public double weightOfEachStudentinKgs(){
        return 22.5;
    }

    byte ageOfClassASection(){
        return 23;
    }

   short nofYearsAStudentCanLive(){
        return 42;
    }

    Long noOfSecondsAStudentCanTalkOverTheLifeOfYear(){
        return 232342L;
    }

    float studentsEatKgOfMeatOnanAverage(){
        return 3.5f;
    }

    abstract byte checkingTheType();
    abstract short checkingTheTypeS();
    abstract int checkingTheTypeI();
    abstract long checkingTheTypeL();
    abstract float checkingTheTypeF();
    abstract double checkingTheTypeD();
    abstract boolean checkingTheTypeB();
    abstract char checkingTheTypeC();


}
