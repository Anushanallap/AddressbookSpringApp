package com.bridgelabz.addressspringapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookspring")
public class AddressBookController {
    //http://localhost:8082/addressbookspring/details
    @GetMapping(value = {"", "/", "/details"})
    public ResponseEntity<String> getAddressBookData()
    {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/details/1
    @GetMapping("/details/{personId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Get Call Success for id: "+personId, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/create
    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData()
    {
        return new ResponseEntity<String> ("Created address book Data for: ", HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/update/1
    @PutMapping("/update/{personId}")
    public ResponseEntity<String> updateAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Updated address book Data for: "+personId, HttpStatus.OK);
    }

    //http://localhost:8082/addressbookspring/delete/1
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Delete Call Success for Id for: "+personId, HttpStatus.OK);
    }
}
