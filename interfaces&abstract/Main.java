import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Interface                      instantiate a new class
        CarInterface carInterface = new ElectricCar("Canon");

        carInterface.start();
        carInterface.move(100);

        //Example of Interface
        List<String> names = new ArrayList<>();
    }
}