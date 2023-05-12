public class Driver extends Car {
    

    public void driveCar() {
        
        Integer currentGas = super.getGas();
        setGas(currentGas - 1);

        System.out.println(String.format("Your tank now has %d gallons of gas.", super.getGas()));
    }

    public void useBoosters() {
        Integer currentGas = super.getGas();
        setGas(currentGas - 3);
        System.out.println(String.format("Your tank now has %d gallons of gas.", super.getGas()));
        if(getGas() <= 0) {
            System.out.println("You are now utilizing foot power.");
        }
    }

    public void refuelCar() {
        Integer currentGas = super.getGas();
        setGas(currentGas + 2);

        System.out.println(String.format("Your tank now has %d gallons of gas.", super.getGas()));
        if(getGas() >= 10) {
            System.out.println("Dude, gas is overflowing from your car. Pull over.");
        }
    }
}
