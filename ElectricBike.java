package inheranceandpolymophismpractice;

public class ElectricBike extends MotorBike { // child class 2


    @Override
    public void colourOfBike() {
        super.colourOfBike();

        System.out.println("Colour---- Red");

    }

    @Override
    public void modesOfBike() {
        super.modesOfBike();

        System.out.println("Electric Bike");

    }

    public void lessPollutionInEnvironment(){
        System.out.println("Electric Bike----less pollution in environment");
    }
}

