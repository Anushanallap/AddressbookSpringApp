package com.bridgelabz.addressspringapp.model;

import lombok.Data;

public @Data class AddressBookData {

    private int PersonId;

    private String FirstName;
    private String LastName;
    private String Gender;
    private long PhoneNum;
    private String City;
    private String State;
    private String ZipCode;
}
