package com.example.ecommercebackend.service;

import com.example.ecommercebackend.model.Product;
import com.example.ecommercebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
