package com.bridgelabz.addressspringapp.dto;

import lombok.Data;

public @Data class AddressBookDTO {


    public String FirstName;

    public String LastName;

    public String Gender;

    public String PhoneNum;

    private String City;

    private String State;

    private String ZipCode;

    @Override
    public String toString() {
        return "AddressBookDTO [FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
                + ", PhoneNum=" + PhoneNum + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + "]";
    }
}
