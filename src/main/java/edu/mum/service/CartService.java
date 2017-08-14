package edu.mum.service;

import edu.mum.entity.Cart;
import edu.mum.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    
    @Autowired
    CartRepository cartRepository;

    //create
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    //delete
    public void deleteCart(int cartId) {
        cartRepository.delete(cartId);
    }

    //read
    public List<Cart> getAllCart() {
        List<Cart> carts = cartRepository.findAll();
        return carts;
    }

    public Cart getCart(int cartId) {
        return cartRepository.findOne(cartId);
    }

    //update
    public void updateCart(int cartId, Cart Cart) {
        cartRepository.save(Cart);
    }
}
