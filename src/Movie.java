public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private final int priceCode;

    public Movie(String newtitle, int newPriceCode) {
        title = newtitle;
        priceCode = newPriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }
    public String getTitle (){
        return title;
    }

    public static Movie generate(String pTitle, int pPriceCode){
        return new Movie(pTitle, pPriceCode);
    }
}