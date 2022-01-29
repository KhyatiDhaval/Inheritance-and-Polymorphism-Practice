package inheranceandpolymophismpractice;

public class RunTest {

    static int myPlusMethodInt(int a, int b) { //same method name with different parameters
        return a + b;
    }
    static int myPlusMethodInt1(int c, int d){

        return c + d;
    }

    public static void main(String[] args) {


        Bike bike = new Bike();
        bike.colourOfBike();
        bike.raceBike();
        bike.modesOfBike();
        bike.speedOfBike();


        Scooter scooter = new Scooter();
        scooter.colourOfBike();
        scooter.priceOfBikes();
        scooter.sizeOfEngine();
        scooter.colourOfBike();


        ElectricBike electricBike = new ElectricBike();
        electricBike.lessPollutionInEnvironment();
        electricBike.bikeBatteryCharge();
        electricBike.colourOfBike();
        electricBike.speedOfBike();

        TwoWheelers twowheelers = new TwoWheelers();
        twowheelers.transport();
        twowheelers.raceBike();
        twowheelers.speedOfTransportation();

        ModeOfTransport modeoftransport = new ModeOfTransport();
        modeoftransport.speedOfTransportation();
        modeoftransport.transport();
        modeoftransport.getClass();



        // Method overloading parameters
        int myNum1 = myPlusMethodInt(800, 1299);// price of bike
        int myNum2 = myPlusMethodInt1(50, 125);// engine of bike


        System.out.println("int: " + myNum1);
        System.out.println("int: " + myNum2);

    }

}
