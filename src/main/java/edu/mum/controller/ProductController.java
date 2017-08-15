package edu.mum.controller;

import edu.mum.entity.Product;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    ProductService productService;

    //landing page
    @RequestMapping(value="/products")
    public String selectAll(Model model) {
        model.addAttribute("products", productService.searchAllProduct() );
        return "productList";
    }
    //working
    @RequestMapping(value="/products/details")
    public String selectone(Model model,@RequestParam("id") int id) {
        model.addAttribute("product", productService.getProduct(id));
        return "productDetails";
    }
    @RequestMapping(value="/products/update")
    public String updateByID(Model model,@RequestParam("productId") int productId){
        model.addAttribute("product",productService.getProduct(productId));
        return "productCreate";

    }

    @RequestMapping(value="/products/update", method = RequestMethod.POST)
    public String updateProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/productTable";
    }
    @RequestMapping(value="/products/delete",method = RequestMethod.POST)
    public String deleteit(int productId){
        productService.deleteProduct(productId);
        return "redirect:/productTable";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String searchByName(Model model, String productName){
        List<Product> products = productService.findByProductName(productName);
        for(Product product : products){
            System.out.println(product.getProductName());
            System.out.println(product.getDescription());
            System.out.println(product.getPrice());
        }
        model.addAttribute("products",productService.findByProductName(productName));
        return "searchResult";
    }


    @RequestMapping("/createProduct")
    public String createProduct(){
        return "productCreate";
    }

    @RequestMapping(value="/saveNewProducts", method = RequestMethod.POST)
    public String addNewProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/createProduct";
    }

    @RequestMapping("/productTable")
    public String adminProductTable(Model model){
        List<Product> productList = productService.searchAllProduct();
        model.addAttribute("products", productList);
        return "productTableList";
    }

}












