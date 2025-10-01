package annotations1;

import java.lang.annotation.Annotation;

public class LuanchAnnotation2 {
    public static void main(String[] args) {
        ViratKohli virat = new ViratKohli();
     Class<? extends ViratKohli>  c = virat.getClass();
     Annotation an =c.getAnnotation(CricketPlayer.class);
     CricketPlayer cp = (CricketPlayer) an;

     System.out.println(cp.age());
     /*
     * Annotation is the parent of all annotations
     * */
    }
}
