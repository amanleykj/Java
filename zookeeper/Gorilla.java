public class Gorilla extends Mammal {
    
    public void throwThings() {
        Integer currentEnergy = super.displayEnergy();
        setEnergy(currentEnergy - 5);
        System.out.println(String.format("Thing thrown."));
    }

    public void eatBananas() {
        Integer currentEnergy = super.displayEnergy();
        setEnergy(currentEnergy + 10);
        System.out.println(String.format("Energy regained. Nice bananer"));
    }

    public void climb() {
        Integer currentEnergy = super.displayEnergy();
        setEnergy(currentEnergy - 10);
        System.out.println(String.format("Climbed that thing."));
    }
}
