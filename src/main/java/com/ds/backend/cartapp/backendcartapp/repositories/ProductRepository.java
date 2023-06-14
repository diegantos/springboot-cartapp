package com.ds.backend.cartapp.backendcartapp.repositories;

import com.ds.backend.cartapp.backendcartapp.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {



}
