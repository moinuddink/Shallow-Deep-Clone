package Pratice3;

import Pratice2.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String usePower() {
         return "Iron Man";
    }

    @Override
    public String stopVillan() {
        return "";
    }
}
