class Renntal {
    private final Movie movie;
    private final int daysRennted;

    public Renntal(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRennted = newdaysRented;
    }

    public int getDaysRennted() {
        return daysRennted;
    }
    public Movie getMovie() {
        return movie;
    }
}