package com.bridgelabz.addressspringapp.controller;


import com.bridgelabz.addressspringapp.dto.AddressBookDTO;
import com.bridgelabz.addressspringapp.dto.ResponseDTO;
import com.bridgelabz.addressspringapp.model.AddressBookData;
import com.bridgelabz.addressspringapp.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbookspring")
public class AddressBookController {
    
    
    @Autowired
    IAddressBookService addressBookService;
    
    //http://localhost:8082/addressbookspring/get
    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData()
    {
        List addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/get/1
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId)
    {
        AddressBookData addressBookData = addressBookService.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call By Id Success", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/create
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO)
    {
        AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Address book data created", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/update/1
    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                             @RequestBody AddressBookDTO addressBookDTO)
    {
        AddressBookData addressBookData = addressBookService.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated addressBook data", addressBookDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/delete/1
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId)
    {
        addressBookService.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("Deleted addressBook data with personId :", personId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }
}
