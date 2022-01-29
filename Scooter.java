package inheranceandpolymophismpractice;

public class Scooter extends MotorBike{ // child class 3


    @Override
    public void sizeOfEngine() {
        super.sizeOfEngine();

        System.out.println("scooter ----50cc");
    }

    @Override
    public void priceOfBikes() {
        super.priceOfBikes();

        System.out.println("price-------£700");

    }

    @Override
    public void colourOfBike() {
        super.colourOfBike();

        System.out.println("colour------red");
    }
}
