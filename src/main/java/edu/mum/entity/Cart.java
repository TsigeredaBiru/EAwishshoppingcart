package edu.mum.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sushan on 8/13/2017.
 */
public class Cart {

    private int cartId;
    private Map<Integer, CartItem> cartItemMap;
    private double grandTotal;

    private Cart() {
        cartItemMap = new HashMap<>();
        grandTotal = 0;
    }

    public Cart(int cartId){
        this();
        this.cartId = cartId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Map<Integer, CartItem> getCartItemMap() {
        return cartItemMap;
    }

    public void setCartItemMap(Map<Integer, CartItem> cartItemMap) {
        this.cartItemMap = cartItemMap;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    //adding the cart and updating the grandtotal
    public void addCartItem(CartItem cartItem){
        int productId = cartItem.getProduct().getProductId();

        if(cartItemMap.containsKey(productId)){
            CartItem cartItemExist = cartItemMap.get(productId);
            cartItemExist.setQuantity(cartItemExist.getQuantity()+cartItem.getQuantity());
            cartItemMap.put(productId,cartItemExist);
        }else {
            cartItemMap.put(productId,cartItem);
        }

        updateGrandTotal();
    }

    //remove the cart
    public void removeCartItem(CartItem cartItem){
        int productId = cartItem.getProduct().getProductId();
        cartItemMap.remove(productId);
        updateGrandTotal();
    }

    //update total price
    private void updateGrandTotal() {
        grandTotal = 0;
        for(CartItem cartItem : cartItemMap.values()){
            grandTotal = cartItem.getTotalPrice()+grandTotal;
        }
    }
}
