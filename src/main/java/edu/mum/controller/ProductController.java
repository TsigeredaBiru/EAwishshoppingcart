package edu.mum.controller;

import edu.mum.entity.Product;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/postProduct")
    public String saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "Success!";
    }

    @DeleteMapping(value= "/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId){
        productService.deleteProduct(productId);
        return  "Success delete!";
    }

    @PutMapping(value="/updateProduct/{productId}")
    public String updateProduct(@RequestBody Product product, @PathVariable int productId){
        product.setProductId(productId);
        productService.updateProduct(productId, product);
        return "Success update";
    }
}