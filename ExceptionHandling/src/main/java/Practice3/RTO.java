package Practice3;

public class RTO {

   /* public void initiate()

   //This is one way to create Exception
    {
        try{
            Applicant applicant = new Applicant();
            applicant.input();
            applicant.verify();
        }catch (UnderAgeException un) {

        }catch (OverAgeException ov) {

        }
    }*/

    public void initiate()
    {
        try{
            Applicant applicant = new Applicant();
            applicant.input();
            applicant.verify();
        }catch (UnderAgeException |OverAgeException e){
            try{
                Applicant applicant = new Applicant();
                applicant.input();
                applicant.verify();
            }catch (UnderAgeException |OverAgeException q){
                System.out.println("Please reach out to RTO Office for further Information");
            }
        }
    }
}
