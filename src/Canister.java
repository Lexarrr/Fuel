public class Canister implements FuelSource{
    @Override
    public void start() {
        System.out.println("open the lid");
        System.out.println("to raise a canister");
        System.out.println("to in");
    }

    @Override
    public void pool() {
        System.out.println("to pool");
    }

    @Override
    public void stop() {
        System.out.println("to put a canister");
        System.out.println("close the lid");
        System.out.println("to pay");
    }




}
