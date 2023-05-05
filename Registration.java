
import java.io.*;
import java.util.*;

public class Registration {

    private ArrayList<Flight> flights;

    public Registration() {
        flights = new ArrayList<Flight>();

    }

    public void addFlight(Flight flight) {
        boolean flag = true;

        for (Flight f : flights) {
            if (f.equals(flight)) {
                System.err.println("Flight " + flight.getFlightNumber() + " duplicated and can't be added twice!");
                flag = false;
                break;
            }
        }

        if (flag == true) {
            flights.add(flight);
            System.out.println("Flight " + flight.getFlightNumber() + " added successfully");
        }

    }

    public String avgPassengers(Date specificDate) {
        int numberOfPassengers = 0;
        int count = 0;
        for (Flight sc : flights) {
            if (sc.getFlightDate().equals(specificDate)) {
                numberOfPassengers = numberOfPassengers + sc.getPassengers().size();
                count++;
            }
        }
        double avg = (double) numberOfPassengers / count;
        return "Average number of passengers in date " + specificDate + " is " + avg;
    }


    public void displayingFlights() {
        ArrayList<Date> uniqueDate = new ArrayList<Date>();
        for (Flight sc : flights) {
            if (!uniqueDate.contains(sc.getFlightDate())) {
                uniqueDate.add(sc.getFlightDate());
            }
        }
        Collections.sort(uniqueDate);

        for (Date date : uniqueDate) {
            System.out.print(date + ": ");
            ArrayList<Flight> flightsInEachDate = new ArrayList<Flight>();
            for (Flight uniqueFlight : flights) {
                if (date.equals(uniqueFlight.getFlightDate())) {
                    if (!flightsInEachDate.contains(uniqueFlight)) {
                        flightsInEachDate.add(uniqueFlight);
                    }
                }
            }
            Collections.sort(flightsInEachDate);
            for (Flight s : flightsInEachDate) {
                System.out.print(s.getFlightNumber() + ", ");
            }
            System.out.println("");
        }
    }

    public void saveInToFile(String filePath) {
        try {
            String s = "";
            File file = new File(filePath);
            PrintWriter pr = new PrintWriter(file);
            for (Flight f: flights) {
                s += f.toString() + "\n";
            }
            pr.println(s);
            pr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");

        }
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "flights=" + flights;
    }

}
