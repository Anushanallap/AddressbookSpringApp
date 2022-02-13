package com.bridgelabz.addressspringapp.services;


import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import com.bridgelabz.addressspringapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBookData> getAddressBookData() {
        return null;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return null;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO AddressBookDTO) {
        return null;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO AddressBookDTO) {
        return null;
    }

    @Override
    public void deleteAddressBookData(int personId) {

    }
}
