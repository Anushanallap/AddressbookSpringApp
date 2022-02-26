package com.bridgelabz.addressspringapp.services;


import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import com.bridgelabz.addressspringapp.exception.AddressBookException;
import com.bridgelabz.addressspringapp.model.AddressBookData;
import com.bridgelabz.addressspringapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    List<AddressBookData> addressBookDataList= new ArrayList();
    @Autowired
    private AddressBookRepository addressBookRepo;



    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepo.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookRepo
                .findById(personId)
                .orElseThrow(() -> new AddressBookException("person not exist!!"));
    }

    @Override
    public List<AddressBookData> getAddressBooksDataByState(String state) {
        return addressBookRepo.findAddressBookDataByState(state);
    }
    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        return addressBookRepo.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepo.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int personId) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookRepo.delete(addressBookData);
    }
}