public class Mammal {
    
    private Integer energyLevel = 100;
    public static int headCountMammals;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer displayEnergy() {
        System.out.println(String.format("The current energy level is %d", energyLevel));
        return energyLevel;
    }

    public void setEnergy(Integer energy) {
        this.energyLevel = energy;
    }
}