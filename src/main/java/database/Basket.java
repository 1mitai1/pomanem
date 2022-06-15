package database;

public class Basket {
    private int basket_id;
    private int booking_id;
    private int product_id;
    private int number;
    private int services_id;
    private int date;
    private int place_id;

    public int getBasket_id() {
        return basket_id;
    }

    public void setBasket_id(int basket_id) {
        this.basket_id = basket_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getServices_id() {
        return services_id;
    }

    public void setServices_id(int services_id) {
        this.services_id = services_id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }
}
