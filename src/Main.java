public class Main {
    public static void main(String[] args) {
        BenzCar car1 = new BenzCar();
        BenzCar car2 = new BenzCar();
        BenzCar car3 = new BenzCar();
        BenzCar car4 = new BenzCar();

        PetrolStation ps = new PetrolStation();
        Canister canister = new Canister();
        Canister canister2 = new Canister();



        car1.refuel(ps);

        car2.refuel(canister);

        car3.refuel(ps);

        car4.setCanister(canister2);
        car4.refuel(car4.can);

        class Spritz implements FuelSource{

            @Override
            public void start() {

            }

            @Override
            public void pool() {

            }

            @Override
            public void stop() {

            }
        }

        Spritz s = new Spritz();
        car1.refuel(s);


        // anonymous class(anyone things what can to fuels)
        FuelSource fs = new FuelSource() {
            @Override
            public void start() {
                System.out.println("sssss");
            }

            @Override
            public void pool() {
                System.out.println("kkkk");
            }

            @Override
            public void stop() {
                System.out.println("fffff");
            }
        };
    }
}