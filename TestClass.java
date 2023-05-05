
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TestClass {

    public static void main(String[] args) throws ParseException {
        
        Passenger pas01 = new Passenger("pas01", "Sahar", "KSA",15, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1988"));
        Passenger pas02 = new Passenger("pas02", "Shahd", "KSA", 45, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1985"));
        Passenger pas03 = new Passenger("pas03", "Ruba", "KWT",25, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1962"));
        Passenger pas04 = new Passenger("pas04", "Salma", "BHR", 45,new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1960"));
        Passenger pas05 = new Passenger("pas05", "Khuloud", "EGY",33, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1955"));
        Passenger pas06 = new Passenger("pas06", "Soma", "KSA", 37, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1970"));
        Passenger pas07 = new Passenger("pas07", "dahab", "KSA",34, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1980"));
        Passenger pas08 = new Passenger("pas08", "rabab", "KWT",45,  new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1990"));
        Passenger pas09 = new Passenger("pas09", "sami", "KSA", 55,new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2000"));
        Passenger pas010 = new Passenger("pas010", "Ahmed", "EGY",44, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1995"));

        Pilot plt01 = new Pilot("plt01345", "ahmed ali", "KSA", 44,"sivelization", 12000, "A");
        Pilot plt02 = new Pilot("plt02234", "sara ali", "KSA", 35,"sivelization", 9000, "B");
        Pilot plt03 = new Pilot("plt03234", "khalid ali", "EGY",44, "sivelization assistant", 9000, "B");

        
         Flight flt104 = new Flight("flt104", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("29/01/2021"), "KSA", "LBN", "");
        flt104.addPassenger(pas01);
        flt104.addPassenger(pas02);
        flt104.addPassenger(pas03);
        
        Flight flt103 = new Flight("flt103", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2021"), "KSA", "LBN", "");
        flt103.addPassenger(pas04);
        flt103.addPassenger(pas05);
        flt103.addPassenger(pas06);
        
        Flight fltviolate = new Flight("flt103", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2021"), "KSA", "LBN", "");
        fltviolate.addPassenger(pas04);
        fltviolate.addPassenger(pas05);
        fltviolate.addPassenger(pas06);

       

        Flight flt101 = new Flight("flt101", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2021"), "KSA", "LBN", "");
        flt101.addPassenger(pas01);

        flt101.addPassenger(pas01);
        flt101.addPassenger(pas02);
        flt101.addPassenger(pas02);
        flt101.removePassenger(pas02);

        flt101.removePassenger(pas03);

        flt101.addPassenger(pas07);
        flt101.addPassenger(pas08);
        flt101.addPassenger(pas09);
        flt101.addPassenger(pas010);

        Flight flt102 = new Flight("flt102", plt02, new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2021"), "KSA", "LBN", "");
        flt102.addPassenger(pas01);
        flt102.addPassenger(pas02);
        flt102.addPassenger(pas03);
        flt102.addPassenger(pas04);

        Flight flt105 = new Flight("flt105", plt02, new SimpleDateFormat("dd/MM/yyyy").parse("29/01/2021"), "KSA", "LBN", "");
        flt105.addPassenger(pas01);
        flt105.addPassenger(pas02);
        flt105.addPassenger(pas03);
        flt105.addPassenger(pas04);

        Flight flt106 = new Flight("flt106", plt03, new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021"), "KSA", "LBN", "");
        flt106.addPassenger(pas01);
        flt106.addPassenger(pas02);
        flt106.addPassenger(pas03);

        Flight flt107 = new Flight("flt107", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2021"), "KSA", "LBN", "");
        flt107.addPassenger(pas01);
        flt107.addPassenger(pas02);
        flt107.addPassenger(pas03);

        Flight flt108 = new Flight("flt108", plt01, new SimpleDateFormat("dd/MM/yyyy").parse("03/02/2021"), "KSA", "LBN", "");
        flt108.addPassenger(pas01);
        flt108.addPassenger(pas02);
        flt108.addPassenger(pas03);
        flt108.addPassenger(pas04);

        Registration reg = new Registration();

        reg.addFlight(flt107);
        reg.addFlight(flt102);
        reg.addFlight(flt102);
        reg.addFlight(flt101);
        reg.addFlight(flt103);
        reg.addFlight(flt104);
        reg.addFlight(flt105);
        reg.addFlight(flt106);
        reg.addFlight(flt108);
        reg.addFlight(fltviolate);

        System.out.println("=====================================================================");
        System.out.println("Displaying flights in ascending order");

        reg.displayingFlights();

        System.out.println("=====================================================================");

        System.out.println(reg.avgPassengers(new SimpleDateFormat("dd/MM/yyyy").parse("26/01/2021")));
        System.out.println(reg.avgPassengers(new SimpleDateFormat("dd/MM/yyyy").parse("29/01/2021")));
        System.out.println(reg.avgPassengers(new SimpleDateFormat("dd/MM/yyyy").parse("26/03/2021")));

       
        System.out.println("=====================================================================");

        reg.saveInToFile("src/registrationData.txt");

    }
}
