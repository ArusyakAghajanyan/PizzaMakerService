package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.Product;
import com.example.pizzamakerservice.model.dto.ProductDto;


import java.util.Collection;
import java.util.List;

public interface ProductService {

    Product readByProductType(int productTypeId);
     ProductDto read(int id);

    List<ProductDto> readAll();

    void create (Product product);

   Product update (int id, Product product);

    void delete (int id);

    Product read(String name);

    Product read(float price);

    List<ProductDto> readAllByProductType(int productTypeId);


}
