package com.ds.backend.cartapp.backendcartapp.services;

import com.ds.backend.cartapp.backendcartapp.models.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
