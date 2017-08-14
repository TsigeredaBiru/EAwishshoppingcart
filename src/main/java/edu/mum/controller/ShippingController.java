package edu.mum.controller;

import edu.mum.entity.Shipping;
import edu.mum.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sushan on 8/13/2017.
 */
@RestController
public class ShippingController {
    
    @Autowired
    ShippingService shippingService;

    @GetMapping("/shipping")
    public List<Shipping> getShipping(){
        return shippingService.getAllShipping();
    }

    @PostMapping("/shipping")
    public String saveShipping(@RequestBody Shipping Shipping){
        shippingService.saveShipping(Shipping);
        return "Success!";
    }

    @DeleteMapping(value= "/shipping/{shippingId}")
    public String deleteShipping(@PathVariable int shippingId){
        shippingService.deleteShipping(shippingId);
        return  "Success delete!";
    }

    @PutMapping(value="/Shipping/{shippingId}")
    public String updateShipping(@RequestBody Shipping Shipping, @PathVariable int shippingId){
        Shipping.setShipId(shippingId);
        shippingService.updateShipping(shippingId, Shipping);
        return "Success update";
    }

    @GetMapping("/Shipping/{ShippingId}")
    public Shipping getOneShipping(@PathVariable int shippingId){
        return shippingService.getShipping(shippingId);
    }
}
