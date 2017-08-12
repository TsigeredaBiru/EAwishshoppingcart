package edu.mum.repository;

import edu.mum.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product,Integer> {



}
