public class GiantBat extends Mammal {
    

    public GiantBat() {
        super(300);
        headCountMammals++;
        
    }

    public void fly() {
        Integer energy = displayEnergy();
        setEnergy(energy - 50);
        System.out.println(String.format("Just flew (lost %d energy). Sppppwoooshshhh", energy));
    }

    public void eatHumans() {
        Integer energy = displayEnergy();
        System.out.println(String.format("Chomp chomp (energy increased by %d)", energy));
        setEnergy(energy + 25);
    }

    public void attackTown() {
        Integer energy = displayEnergy();
        System.out.println(String.format("The people are screaming! (lost %d energy)", displayEnergy()));
        setEnergy(energy - 100);
    }
}
