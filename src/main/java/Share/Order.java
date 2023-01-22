package Share;

public class Order {
private  String ordename;
private int price;
private int cooktime;

public Order(){};

    public Order(String ordename, int price, int cooktime) {
        this.ordename = ordename;
        this.price = price;
        this.cooktime = cooktime;
    }

    public String getOrdename() {
        return ordename;
    }

    public void setOrdename(String ordename) {
        this.ordename = ordename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCooktime() {
        return cooktime;
    }

    public void setCooktime(int cooktime) {
        this.cooktime = cooktime;
    }
}
