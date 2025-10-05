package springcoreclass2;

public class TeluskoMalumKarlo {

    private ISubject subject;

    public TeluskoMalumKarlo(ISubject subject) {
        super();
        this.subject = subject;
    }

    public TeluskoMalumKarlo() {
        super();
        System.out.println("TeluskoMalumKarlo bean created");
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    public boolean purchaseTheCourse(double amount) {
        return subject.getTheCourse(amount);
    }
}
