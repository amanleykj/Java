public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
        headCountMammals++;
    }
    
    public void throwSomething() {
        int energyLevel = displayEnergy(energyLevel - 5);
        displayEnergy();
        System.out.println(String.format("Thing thrown. Now energy is %d", super.displayEnergy()));
    }

    public void eatBananas() {
        Integer currentEnergy = super.displayEnergy();
        System.out.println(String.format("Energy regained. Nice bananer. New energy level is %d", currentEnergy));
        setEnergy(currentEnergy + 10);
    }

    public void climb() {
        Integer currentEnergy = super.displayEnergy();
        setEnergy(currentEnergy - 10);
        System.out.println(String.format("Climbed that tree. Energy is now %d", currentEnergy));
    }
}
