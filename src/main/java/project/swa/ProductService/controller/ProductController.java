package project.swa.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.swa.ProductService.exception.ProductNotFoundException;
import project.swa.ProductService.service.ProductDTO;
import project.swa.ProductService.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getCustomers() {
        List<ProductDTO> customerDTO1 = productService.getAll();
        try {
            if (customerDTO1 != null) {
                return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
            } else {
                throw new ProductNotFoundException("Product not found");
            }
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> addCustomer(@RequestBody ProductDTO customerDTO) {
        ProductDTO customerDTO1 = productService.add(customerDTO);
        try {
            if (customerDTO1 != null) {
                return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
            } else {
                throw new ProductNotFoundException("Product not found");
            }
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateCustomer(@PathVariable String id, @RequestBody ProductDTO customerDTO) {
        ProductDTO customerDTO1 = productService.update(id, customerDTO);
        if (customerDTO1 != null) {
            return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDTO> deleteCustomer(@PathVariable String id) {
        ProductDTO customerDTO1 = productService.delete(id);
        if (customerDTO1 != null) {
            return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }
}
