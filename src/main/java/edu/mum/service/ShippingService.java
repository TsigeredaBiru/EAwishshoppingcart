package edu.mum.service;

import edu.mum.entity.Shipping;
import edu.mum.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ShippingService {

    @Autowired
    ShippingRepository shippingRepository;

    //create
    public void saveShipping(Shipping shipping) {
        shippingRepository.save(shipping);
    }

    //delete
    public void deleteShipping(int shippingId) {
        shippingRepository.delete(shippingId);
    }

    //read
    public List<Shipping> getAllShipping() {
        List<Shipping> Shippinges = shippingRepository.findAll();
        return Shippinges;
    }

    public Shipping getShipping(Integer shippingId) {
        return shippingRepository.findOne(shippingId);
    }

    //update
    public void updateShipping(int shippingId, Shipping shipping) {
        shippingRepository.save(shipping);
    }
}
