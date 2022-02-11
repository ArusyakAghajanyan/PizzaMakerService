package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.Product;
import com.example.pizzamakerservice.model.dto.ProductDto;


import java.util.Collection;
import java.util.List;

public interface ProductService {


    Product readProduct(int id);

    ProductDto read(int id);

    List<ProductDto> readAll();

    List<ProductDto> readAllByProductType(int productTypeId);


    void create(ProductDto productDto);

    ProductDto update(int id, ProductDto productDto);

    void delete(int id);


}
