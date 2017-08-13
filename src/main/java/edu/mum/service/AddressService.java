package edu.mum.service;

import edu.mum.entity.Address;
import edu.mum.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    //create
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    //delete
    public void deleteAddress(int addressId) {
        addressRepository.delete(addressId);
    }

    //read
    public List<Address> getAllAddress() {
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }

    public Address getAddress(Integer addressId) {
        return addressRepository.findOne(addressId);
    }

    //update
    public void updateAddress(int AddressId, Address Address) {
        addressRepository.save(Address);
    }
}
