package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.javalibrary.JokeSupplier;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokeSupplier jokeSupplier;
    private String myData;

    public MyBean() {
        jokeSupplier = new JokeSupplier();
    }

    public String getData() {
        myData = jokeSupplier.getJoke();
        return myData;
    }
}