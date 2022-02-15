package com.bridgelabz.addressspringapp.repository;

import com.bridgelabz.addressspringapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {


    @Query(value = "SELECT * FROM addressbook_application_db WHERE State = :state ", nativeQuery = true)
    List<AddressBookData> findAddressBookDataByState(String state);


}
