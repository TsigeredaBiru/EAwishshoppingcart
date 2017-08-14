package edu.mum.controller;

import edu.mum.entity.Cart;
import edu.mum.entity.CartItem;
import edu.mum.entity.Product;
import edu.mum.service.CartService;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/cart")
    public List<Cart> getCart(){
        return cartService.getAllCart();
    }

    @PostMapping("/cart")
    public String saveCart(@RequestBody Cart Cart){
        cartService.saveCart(Cart);
        return "Success!";
    }

    @DeleteMapping(value= "/cart/{cartId}")
    public String deleteCart(@PathVariable int cartId){
        cartService.deleteCart(cartId);
        return  "Success delete!";
    }

    @PutMapping(value="/cart/{cartId}")
    public String updateCart(@RequestBody Cart cart, @PathVariable int cartId){
        cart.setCartId(cartId);
        cartService.updateCart(cartId, cart);
        return "Success update";
    }

    @GetMapping("/cart/{cartId}")
    public Cart getOneCart(@PathVariable int cartId){
        return cartService.getCart(cartId);
    }

    @PutMapping("/cart/add/{productId}")
    public void addCartItem(@PathVariable int productId, HttpServletRequest request){
        String sessionId = request.getSession(true).getId();
        int sId = Integer.valueOf(sessionId);
        Cart cart = cartService.getCart(sId);

        if(cart == null){
            cart= cartService.saveCart(new Cart(sId));
        }

        Product product = productService.getProduct(productId);
        if(product == null){
            throw new IllegalArgumentException(new Exception());
        }

        cart.addCartItem(new CartItem(product));
        cartService.updateCart(sId,cart);
    }

    @PutMapping("/cart/remove/{productId}")
    public void removeCartItem(@PathVariable int productId, HttpServletRequest request){
        String sessionId = request.getSession(true).getId();
        int sId = Integer.valueOf(sessionId);
        Cart cart = cartService.getCart(sId);

        if(cart == null){
            cart= cartService.saveCart(new Cart(sId));
        }

        Product product = productService.getProduct(productId);
        if(product == null){
            throw new IllegalArgumentException(new Exception());
        }

        cart.removeCartItem(new CartItem(product));
        cartService.updateCart(sId,cart);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "please, verify you payload")
    public void handleClientError(Exception e){
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error" )
    public void handleServerError(Exception e){
    }
}
