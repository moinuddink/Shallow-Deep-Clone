package annotations;

public class Tiger extends Animal {

    //itisoverriden method from Animal
    @Override //Its the meta data about the code
    public void animalHuntsAndEats() {
        System.out.println("Tiger animal Hunts and Eats");
    }
}
