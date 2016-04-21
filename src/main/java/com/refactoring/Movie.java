package com.refactoring;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    int getFrequentRenterPoints(int daysRented) {
       return price.getFrequentRenterPoints(daysRented);
    }

    public int getPriceCode() {
        return this.price.getPriceCode();
    }

    public void setPriceCode(int price) {
        switch (price) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

}
