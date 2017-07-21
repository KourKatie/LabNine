/**
 * Created by Katie on 7/20/2017.
 */
public class Cars {

    private String make;
    private String model;
    private int year;
    private double price;

    public Cars() {

        make = "";
        model = "";
        year = 0;
        price = 0.0;

    }

    public Cars(String m, String mm, int y, double p) {

        make = m;
        model = mm;
        year = y;
        price = p;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
