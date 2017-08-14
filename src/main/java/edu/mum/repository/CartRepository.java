package edu.mum.repository;

import edu.mum.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sushan on 8/13/2017.
 */
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
