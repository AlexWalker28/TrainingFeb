package kg.kloop.android.examplesnew;

/**
 * Created by alexwalker on 19.02.2018.
 */

class Flat {
    String address;
    String price;
    String area;

    public Flat() {
    }

    public Flat(String address, String price, String area) {
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
