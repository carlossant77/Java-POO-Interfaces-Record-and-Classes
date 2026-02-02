public class Ingresso {

    private double value;

    private String movieName;

    private String type;

    public Ingresso(double value, String movieName, String type) {
        this.value = value;
        this.movieName = movieName;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}