package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sushan on 8/13/2017.
 */
@Controller
@RequestMapping("/cart")
public class CartItemController {


    @GetMapping("/")
    public String getSession(HttpServletRequest request){
        return "redirect:/cart/"+request.getSession(true).getId();
    }

    @GetMapping("/{cartId}")
    public String getCart(@PathVariable(value = "cartId") int cartId, Model model){
        model.addAttribute("cartId", cartId);
        return "cart";
    }

}
