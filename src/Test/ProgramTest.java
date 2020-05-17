import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    void movTest1() {
        Customer customer = new Customer("Charlie Eppes");
        Movie regularMovie = Movie.generate("Iron Man", Movie.REGULAR);
        Movie kidsmovie = Movie.generate("Frozen", Movie.CHILDREN);
        Movie newMovie = Movie.generate("Avatar 2", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(regularMovie, 2);
        Rental rental2 = new Rental(kidsmovie, 13);
        Rental rental3 = new Rental(newMovie, 6);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String expected = "Rental Record for " + "Charlie Eppes" + ":\n" + "\t" + "Title" + "\t" +
                "\t" + "Days" + "\t" + "Amount" + "\n" + "\t" + "Iron Man" + "\t" + "\t" +
                2 + "\t" + "\t" + 2.0 + "\n" + "\t" + "Frozen" + "\t" + "\t" + 13 + "\t" + "\t" + 16.5 + "\n" +
                "\t" + "Avatar 2" + "\t" + "\t" + 6 + "\t" + "\t" + 18.0 + "\n" + "Amount owed is " +
                36.5 + ", pay or you'll regret it.\n" + "Congrats, you earned " + 4 + " totally worthless loyalty points.";

        String statement = customer.statement();
        assertEquals(expected, statement);
    }
}