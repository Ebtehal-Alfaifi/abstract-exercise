public class Book extends Prodect{

private  String auther;


  Book(){

  }

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }
//السعر بعد الخصم = السعر قبل الخصم – (السعر قبل الخصم × نسبة الخصم).
    public double getdiscoent() {

        return getPrice()-(getPrice()*0.10) ;
    }
}

