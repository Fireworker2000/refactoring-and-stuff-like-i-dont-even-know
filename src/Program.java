import java.lang.*;

/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */
    
    public static void main(String[] args)
    {
        String result;
        System.out.println("Welcome to the worst Movie Store ever made. Go and use Netflix or something.");

        Movie m1 = Movie.generate("movie1", 1);
        Movie m2 = Movie.generate("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);

        Customer c1 = new Customer("Razorblade Jannes der Lokomotivführer von England");
        c1.addRental(r1);
        c1.addRental(r2);

        System.out.println("Anyways, let's get that gorgeous data.");
        result = c1.statement();
        System.out.println(result);
    }
}


