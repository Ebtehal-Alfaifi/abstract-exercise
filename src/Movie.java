public class Movie extends Prodect {
    private String director;

    public Movie() {

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }


    @Override
    public double getdiscoent() {

        return getPrice()-(getPrice()*0.15) ;
    }

    }

