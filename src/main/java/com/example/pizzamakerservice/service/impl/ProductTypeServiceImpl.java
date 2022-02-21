package com.example.pizzamakerservice.service.impl;
import com.example.pizzamakerservice.model.ProductType;
import com.example.pizzamakerservice.repository.ProductTypeRepository;
import com.example.pizzamakerservice.service.ProductTypeService;
import java.util.List;

public class ProductTypeServiceImpl implements ProductTypeService {
    private final ProductTypeRepository productTypeRepository = new ProductTypeRepository();

    @Override
    public ProductType read(int id) {
        return productTypeRepository.read(id);
    }

    @Override
    public List<ProductType> readAll() {
        return productTypeRepository.readAll();
    }

    @Override
    public void create(ProductType productType) {
    }

    @Override
    public ProductType update(int id, ProductType productType) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    @Override
    public ProductType read(String name) {
        return productTypeRepository.read(name);
    }
}
