package com.company;

public class Testing {
    public static void main(String[] args) {
        Integer number;
        Testing testing = new Testing();
        System.out.println(testing.isOdd(20));
    }

    public boolean isOdd(Integer number)
    {
        return number % 2 != 0;
    }
}
