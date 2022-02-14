package com.bridgelabz.addressspringapp.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public @Data class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "FirstName name Invalid")
    public String FirstName;

    @Pattern(regexp = "^[A-Z]{1}$", message = "LAstName name Invalid")
    public String LastName;

    @Pattern(regexp = "Male|Female", message = "Gender should be Male or Female")
    public String Gender;

    @Pattern(regexp = "[1-9]{1}[0-9]{9}", message = "Mobile number is invalid")
    public String PhoneNum;

    @NotNull(message = "city can not be null")
    public String City;

    @NotEmpty(message = "state can't be Empty")
    public String State;

    @NotBlank(message = "zipcode should not be Empty")
    public String ZipCode;

    @Override
    public String toString() {
        return "AddressBookDTO [FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
                + ", PhoneNum=" + PhoneNum + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + "]";
    }
}
