package Practice1;

public class Bank {

    public void initiate()
    {
        ATM atm = new ATM();

        try
        {
            atm.input();
            atm.verify();
        } catch (InvalidCustomerException ice)
        {
            try
            {
                atm.input();
                atm.verify();
            } catch (InvalidCustomerException ie) {

                try
                {
                    atm.input();
                    atm.verify();
                } catch (InvalidCustomerException ic) {
                    System.out.println("Invalid Cutomer Details...your pakka legend");
                }
            }
        }

    }
}
