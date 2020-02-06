package com.example.REST_API.APP.model;

public class Greeting {

    private final long id;
    private final String firstname;
    private final String lastname;

    public Greeting(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() { return lastname; }
}