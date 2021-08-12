package project.swa.ProductService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.swa.ProductService.exception.ProductNotFoundException;
import project.swa.ProductService.service.ProductDTO;
import project.swa.ProductService.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class.getName());

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getCustomers() {
        logger.info("Calling GET /product");
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

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getCustomer(@PathVariable String id) {
        logger.info("Calling GET /order");
        Optional<ProductDTO> customerDTO1 = productService.getById(id).stream().findAny();
        try {
            if (customerDTO1.isPresent()) {
                return new ResponseEntity<>(customerDTO1.get(), HttpStatus.CREATED);
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
        logger.info("Calling POST /product");
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
        logger.info("Calling PUT /product");
        ProductDTO customerDTO1 = productService.update(id, customerDTO);
        if (customerDTO1 != null) {
            return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDTO> deleteCustomer(@PathVariable String id) {
        logger.info("Calling DELETE /product");
        ProductDTO customerDTO1 = productService.delete(id);
        if (customerDTO1 != null) {
            return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }
}
