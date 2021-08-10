package project.swa.ProductService.service;

import project.swa.ProductService.domain.Stock;

public class StockAdapter {
    public static Stock getCustomer(StockDTO stockDTO) {
        return new Stock(
                stockDTO.getNumberInStock());
    }

    public static StockDTO getCustomerDTO(Stock address) {
        return new StockDTO(
                address.getNumberInStock());
    }
}
