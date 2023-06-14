package com.ds.backend.cartapp.backendcartapp.controlers;

import com.ds.backend.cartapp.backendcartapp.models.entities.Product;
import com.ds.backend.cartapp.backendcartapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public List<Product> list() {
        return service.findAll();
    }
}
