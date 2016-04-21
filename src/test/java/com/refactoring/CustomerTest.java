package com.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void test() {
        Customer customer1 = new Customer("customer1");
        customer1.addRental(new Rental(new Movie("movie1", 0), 7));
        customer1.addRental(new Rental(new Movie("movie2", 1), 7));
        customer1.addRental(new Rental(new Movie("movie3", 2), 7));

        String expected = "Rental Record for customer1\n" +
                "\tmovie1\t9.5\n" +
                "\tmovie2\t21.0\n" +
                "\tmovie3\t7.5\n" +
                "Amount owed is 38.0\n" +
                "You earned 4 frequent renter points";
        assertEquals(expected, customer1.statement());
    }

}
