package edu.mum.service;

import edu.mum.entity.Product;
import edu.mum.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ProductService  {

    @Autowired
    private IProductRepository productRepository;

    public String saveProduct(Product product){

        productRepository.save(product);


        return "saved!";
    }

    public String deleteProduct(Product product){

        productRepository.delete(product);

        return " item is deleted";
    }

    public List<Product> searchAllProduct(){

        List<Product>products = productRepository.findAll();

        return products;

    }

    public Product getProduct(Integer productId) {
        return  productRepository.findOne(productId);
    }


}
