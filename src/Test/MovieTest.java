import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void movieTest1() {
        Movie childMovie = new Movie("childMovie", Movie.CHILDREN);

        assertEquals("childMovie", childMovie.getTitle());
    }
}