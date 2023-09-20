public class PetrolStation implements FuelSource{

    @Override
    public void start() {
        System.out.println("to in");
    }

    @Override
    public void pool() {
        System.out.println("to pool");
    }

    @Override
    public void stop() {
        System.out.println("to out");
        System.out.println("to pay");

    }
}
