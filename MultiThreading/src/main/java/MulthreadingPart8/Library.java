package MulthreadingPart8;

public class Library implements Runnable {

    String java = new String("Java");
    String devOps = new String("DevOps");
    String aws = new String("Cloud AWS");
    @Override
    public void run() {

      String name =  Thread.currentThread().getName();
      if (name.equals("Rohan")) {
          //equals method in java reference
          try{
              System.out.println("Rohan got into library");
              Thread.sleep(5000);
              synchronized (java){
                  System.out.println("Rohan has acquired java book");
                  Thread.sleep(5000);
                  synchronized (devOps){
                      System.out.println("Rohan has acquired devOps");
                      Thread.sleep(5000);
                      synchronized (aws){
                          System.out.println("Rohan has acquired aws");
                      }
                  }
              }
          }catch (Exception e){
              System.out.println("Some Problem with Rohan");
          }
      }else{
          try
          {
              System.out.println("Bishnu got into library");
              Thread.sleep(5000);
              synchronized (java){
                  System.out.println("Bishnu has acquired java book");
                  synchronized (devOps){
                      System.out.println("Bishnu has acquired devOps");
                      Thread.sleep(5000);
                      synchronized (aws){
                          System.out.println("Bishnu has acquired aws");
                          Thread.sleep(5000);
                      }
                  }
              }
          }catch (Exception e){
              System.out.println("Some Problem with Bishnu");
          }
      }
    }
}
