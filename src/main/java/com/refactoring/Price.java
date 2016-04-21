package com.refactoring;

public abstract class Price {
    abstract int getPriceCode();

    /**
     * @param rental TODO
     * @param movie TODO
     * @param daysRented TODO
     * @return
     */
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
