
import java.lang.*;
import java.util.*;

class Customer {
    private final String name;
    private final Vector renntals;

    public Customer (String newname){
        name = newname;
        renntals = new Vector();
    }

    public void addRental(Renntal arg) { renntals.addElement(arg); }

    public String getName (){
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = renntals.elements();

        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        while (enum_rentals.hasMoreElements()) {
            Renntal renntal = (Renntal) enum_rentals.nextElement();

            double thisAmount = amountFor(renntal); // determine amounts for each line
            frequentRenterPoints ++;      // add frequent renter points

            // add bonus for a two day new release rental
            if ((renntal.getMovie().getPriceCode() == Movie.NEW_RELEASE) && renntal.getDaysRennted() > 1)
                frequentRenterPoints ++;

            //show figures for this rental
            result.append("\t").append(renntal.getMovie().getTitle()).append("\t").append("\t").append(renntal.getDaysRennted()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append(".\n");
        result.append("You earned ").append(frequentRenterPoints).append(" totally worthless loyalty points.");
        return result.toString();
    }

    private double amountFor(Renntal renntal) {
        double thisAmount = 0;
        switch (renntal.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (renntal.getDaysRennted() > 2)
                    thisAmount += (renntal.getDaysRennted() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += renntal.getDaysRennted() * 3;
                break;
            case Movie.CHILDREN:
                thisAmount += 1.5;
                if (renntal.getDaysRennted() > 3)
                    thisAmount += (renntal.getDaysRennted() - 3) * 1.5;
                break;
            default:
                break;
        }
        return thisAmount;
    }

}
    