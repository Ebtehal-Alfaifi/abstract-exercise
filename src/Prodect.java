public abstract class Prodect {
private String name;
private double price;



Prodect(){

}
    public Prodect(String name,double price) {
        this.name = name;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getdiscoent();





}
