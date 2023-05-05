
import java.util.Date;

public class Passenger extends traveler {

    private String uniquePassportNumber;
    private Date dateOfBirth;

    public Passenger() {
    }

    public Passenger(String uniquePassportNumber, String name, String nationality,int age, Date dateOfBirth) {
        super(name, nationality, age);
        this.uniquePassportNumber = uniquePassportNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUniquePassportNumber() {
        return uniquePassportNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setUniquePassportNumber(String uniquePassportNumber) {
        this.uniquePassportNumber = uniquePassportNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passenger " + "uniquePassportNumber=" + uniquePassportNumber + " " + super.toString() + ", dateOfBirth=" + dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Passenger)) {
            return false;
        }
        Passenger passenger = (Passenger) obj;
        return getUniquePassportNumber().equals(passenger.getUniquePassportNumber());
    }

}
