package com.pfe.pfeproj.Services;

import com.pfe.pfeproj.Entities.Product;
import com.pfe.pfeproj.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Add product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Get product by id
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Delete product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // Update product
    public Product updateProduct(Long id, Product updatedProduct) {

        Product existingProduct = productRepository.findById(id).orElse(null);

        if (existingProduct != null) {

            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setImage(updatedProduct.getImage());
            existingProduct.setCategory(updatedProduct.getCategory());

            return productRepository.save(existingProduct);
        }

        return null;
    }
}
