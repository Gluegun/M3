package lessons;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import java.util.List;

public class Lesson8 {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();

        List<Aircraft> allAircraft = airport.getAllAircrafts();

        // check amount of aircraft in airport
        System.out.println(allAircraft.size());
    }
}
