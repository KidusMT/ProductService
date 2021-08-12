package project.swa.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.OrderAdapter;
import org.springframework.stereotype.Service;
import project.swa.ProductService.data.ProductRepository;
import project.swa.ProductService.domain.Product;
import project.swa.ProductService.exception.ProductNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> getAll() {
        return productRepository.findAll().stream().map(ProductAdapter::getProductDTO).toList();
    }

    public List<ProductDTO> getById(String id) {
        return productRepository.findById(id).stream().map(ProductAdapter::getProductDTO).toList();
    }

    public ProductDTO add(ProductDTO productDTO) {
        Product customer = productRepository.save(ProductAdapter.getProduct(productDTO));
        return ProductAdapter.getProductDTO(customer);
    }

    public ProductDTO update(String id, ProductDTO productDTO) {
        Optional<Product> customerDTO1 = productRepository.findById(id);
        if (customerDTO1.isPresent()) {
            productDTO.setProductNumber(id);
            Product customer = productRepository.save(ProductAdapter.getProduct(productDTO));
            return ProductAdapter.getProductDTO(customer);
        }
//        throw new CustomerNotFoundException();
        return null;
    }

    public ProductDTO delete(String customerId) throws ProductNotFoundException {
        Optional<Product> customerOptional = productRepository.findById(customerId);
        if (customerOptional.isPresent()) {
            Product customer = customerOptional.get();
            productRepository.delete(customer);
            return ProductAdapter.getProductDTO(customer);
        }
//        throw new CustomerNotFoundException();
        return null;
    }
}
