
import java.util.ArrayList;
import java.util.Date;

public class Flight implements Comparable {

    private String flightNumber;
    private Pilot pilot;
    private Date flightDate;
    private String flightDeparture;
    private String flightArrival;
    private String flightDescription;
    private ArrayList<Passenger> passengers;
    private static final int LIMIT = 20;

    public Flight() {
        this.passengers = new ArrayList<Passenger>();
    }

    public Flight(String flightNumber, Pilot pilot, Date flightDate, String flightDeparture, String flightArrival, String flightDescription) {
        this.flightNumber = flightNumber;
        this.pilot = pilot;
        this.flightDate = flightDate;
        this.flightDeparture = flightDeparture;
        this.flightArrival = flightArrival;
        this.flightDescription = flightDescription;
        this.passengers = new ArrayList<Passenger>();
    }

    public void addPassenger(Passenger pa) {
        boolean flag = true;
       
         for(Passenger passenger:passengers){
             if(passenger.equals(pa)){
                System.err.println("Passenger " + pa.getUniquePassportNumber() + " duplicated and can't be added twice!");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            if (passengers.size() < LIMIT) {
                passengers.add(pa);
                System.out.println("Employee " + pa.getUniquePassportNumber() + " added successfully to flight " + flightNumber);
            } else {
                System.err.println("passengers should not exceed the limit of " + LIMIT);
            }
        }

    }

    public void removePassenger(Passenger pa) {
        boolean flag = true;
      
          for(Passenger passenger:passengers){
             if(passenger.equals(pa)){
                passengers.remove(passenger);
                System.out.println("Passenger " + pa.getUniquePassportNumber() + " Removed");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.err.println("Passenger " + pa.getUniquePassportNumber() + " can't be removed because it was not found in the list");
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public String getFlightArrival() {
        return flightArrival;
    }

    public String getFlightDescription() {
        return flightDescription;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public static int getLIMIT() {
        return LIMIT;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public void setFlightDeparture(String flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public void setFlightArrival(String flightArrival) {
        this.flightArrival = flightArrival;
    }

    public void setFlightDescription(String flightDescription) {
        this.flightDescription = flightDescription;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        String str = "Flight: " + flightNumber + ", flightDate: " + flightDate + ", flightDeparture: " + flightDeparture
                + ", flightArrival: " + flightArrival + ", flightDescription: " + flightDescription
                + "\npilot:" + pilot + "\npassengers:\n";
        for (Passenger st : passengers) {
            str = str + st.toString() + "\n";
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        Flight other = (Flight) obj;
        return flightNumber.equals(other.flightNumber) && flightDate.equals(other.flightDate);
        }

    @Override
    public int compareTo(Object flight) {
        Flight tr = (Flight) flight;
        return this.flightNumber.compareTo(tr.flightNumber);
    }

}
