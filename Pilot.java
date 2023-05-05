
public class Pilot extends traveler {

    private String uniqueID;
    private String Specialization;
    private double salary;
    private String pilotClass;
    

    public Pilot() {
    }

    public Pilot(String uniqueID, String name, String nationality,int age, String Specialization, double salary, String pilotClass) {
        super(name, nationality, age);
        this.uniqueID = uniqueID;
        this.Specialization = Specialization;
        this.salary = salary;
        this.pilotClass = pilotClass;

    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public double getSalary() {
        return salary;
    }

    public String getPilotClass() {
        return pilotClass;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPilotClass(String pilotClass) {
        this.pilotClass = pilotClass;
    }

    @Override
    public String toString() {
        return "Pilot uniqueID= " + uniqueID + super.toString() + ", Specialization=" + Specialization
                + ", salary=" + salary + ", pilotClass=" + pilotClass;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pilot)) {
            return false;
        }
        Pilot pilot = (Pilot) obj;
        return getUniqueID().equals(pilot.getUniqueID());
    }

}
