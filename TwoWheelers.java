package inheranceandpolymophismpractice;

public class TwoWheelers extends ModeOfTransport{ // grandparents class


    @Override
    public void speedOfTransportation() {
        super.speedOfTransportation();


        System.out.println("20 mile per hours");
    }

    @Override
    public void transport() {
        super.transport();

        System.out.println("2 wheelers");
    }

    public void raceBike(){

        System.out.println("186 mph");
    }
}
