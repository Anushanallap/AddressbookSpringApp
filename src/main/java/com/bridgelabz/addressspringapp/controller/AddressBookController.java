package com.bridgelabz.addressspringapp.controller;


import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import com.bridgelabz.addressspringapp.dto.ResponseDTO;
import com.bridgelabz.addressspringapp.model.AddressBookData;
import com.bridgelabz.addressspringapp.services.AddressBookService;
import com.bridgelabz.addressspringapp.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookspring")
public class AddressBookController {
    
    
    @Autowired
    IAddressBookService addressBookService;
    
    //http://localhost:8082/addressbookspring/details
    @GetMapping(value = {"", "/", "/details"})
    public ResponseEntity<ResponseDTO> getAddressBookData()
    {
        AddressBookService addressBookServices = null;
        List addressBookDataList = addressBookServices.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/details/1
    @GetMapping("/details/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId)
    {
        AddressBookService addressBookServices = null;
        AddressBookData addressBookData = addressBookServices.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call By Id Success", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/create
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
    {
        AddressBookService addressBookServices = null;
        AddressBookData addressBookData = addressBookServices.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Address book data created", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/update/1
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                             @RequestBody AddressBookDTO addressBookDTO)
    {
        AddressBookService addressBookServices = null;
        AddressBookData addressBookData = addressBookServices.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("updated adressBook data", addressBookDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }


    //http://localhost:8082/addressbookspring/delete/1
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId)
    {
        AddressBookService addressBookServices = null;
        addressBookServices.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("deleted adressBook data with personId :", personId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }
}
