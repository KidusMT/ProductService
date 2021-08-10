package project.swa.ProductService.service;

import project.swa.ProductService.domain.Stock;

public class StockAdapter {
    public static Stock getStock(StockDTO stockDTO) {
        return new Stock(
                stockDTO.getNumberInStock(),
                stockDTO.getLocationCode());
    }

    public static StockDTO getStockDTO(Stock stock) {
        return new StockDTO(
                stock.getNumberInStock(),
                stock.getLocationCode());
    }
}
