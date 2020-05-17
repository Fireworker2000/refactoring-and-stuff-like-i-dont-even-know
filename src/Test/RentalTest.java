import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    @Test
    void rentalTest() {
        Movie regularMovie = new Movie("regular", Movie.REGULAR);
        Rental rental = new Rental(regularMovie, 12);

        assertEquals(12, rental.getDaysRented());
        assertEquals("regular", rental.getMovie().getTitle());
    }
}