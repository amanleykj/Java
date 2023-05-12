public class Car {

    private Integer gas = 10;

    // getters
    public Integer getGas() {
        System.out.println(String.format("You have %d gallons of gas remaining.", gas));
        return gas;
    }

    // setters
    public void setGas(Integer gas) {
        this.gas = gas;
    }

    

}