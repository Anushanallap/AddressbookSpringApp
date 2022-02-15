package com.bridgelabz.addressspringapp.model;

import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Persondata")
public @Data class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PersonId;

    private String FirstName;
    private String LastName;
    private String Gender;
    private String PhoneNum;
    private String City;
    private String State;
    private String ZipCode;

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);

    }
    public AddressBookData() {

    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {

        this.FirstName = addressBookDTO.FirstName;
        this.LastName = addressBookDTO.LastName;
        this.Gender = addressBookDTO.Gender;
        this.PhoneNum = addressBookDTO.PhoneNum;
        this.City = addressBookDTO.City;
        this.State = addressBookDTO.State;
        this.ZipCode = addressBookDTO.ZipCode;

    }
}