package com.refactoring;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double getCharge() {
        return movie.getCharge(daysRented);
    }

    /**
     * @param frequentRenterPoints
     * @return
     */
    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);

    }
}
