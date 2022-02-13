package com.bridgelabz.addressspringapp.dto;

import lombok.Data;

public @Data class AddressBookDTO {


    public String FirstName;

    public String LastName;

    public String Gender;

    public String PhoneNum;

    public String City;

    public String State;

    public String ZipCode;

    @Override
    public String toString() {
        return "AddressBookDTO [FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
                + ", PhoneNum=" + PhoneNum + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + "]";
    }
}
