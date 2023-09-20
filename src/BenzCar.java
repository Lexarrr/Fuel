public class BenzCar {

    public void refuel(FuelSource source){
        System.out.println("to pool");
        source.start();
        source.pool();
        source.stop();
        System.out.println("to road");
    }

    public Canister can;

    public void setCanister(Canister can){
        this.can = can;
    }

}
