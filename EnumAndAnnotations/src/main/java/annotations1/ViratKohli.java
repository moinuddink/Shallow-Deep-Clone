package annotations1;
//Cricketer
//Annotations works based on the mechanism of interfaces
public class ViratKohli {
    @CricketPlayer(country = "india", age = 18)
    private int innings;

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}
