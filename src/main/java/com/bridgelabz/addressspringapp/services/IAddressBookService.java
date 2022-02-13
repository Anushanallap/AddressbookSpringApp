package com.bridgelabz.addressspringapp.services;

import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import com.bridgelabz.addressspringapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(AddressBookDTO AddressBookDTO);

    AddressBookData updateAddressBookData(int personId, AddressBookDTO AddressBookDTO);

    void deleteAddressBookData(int personId);
}
