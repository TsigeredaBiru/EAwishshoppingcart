package edu.mum.controller;

import edu.mum.entity.Product;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {


    @Autowired
    ProductService productService;

    @RequestMapping(value="/products")
    public String selectAll(Model model) {
        model.addAttribute("products", productService.searchAllProduct() );
        return "productpage4";
    }

   @RequestMapping(value="/products/savedproducts", method = RequestMethod.POST)
    public String addNewProduct(Product product){
        productService.saveProduct(product);
       return "redirect:/products";

    }

    @RequestMapping(value="/products/delete",method = RequestMethod.POST)
    public String deleteit(int productId){
       // int id = Integer.parseInt(input);
        //Product p = productService.getProduct(product.getProductId());
        productService.deleteProduct(productId);
        return "redirect:/products";
    }
    }












