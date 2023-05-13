public class Mammal {
    
    private Integer energyLevel = 100;
    public static int headCountMammals;


    public Integer displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }

    public void setEnergy(Integer energy) {
        this.energyLevel = energy;
    }
}