package com.example.pizzamakerservice.service.impl;

import com.example.pizzamakerservice.model.Ingredient;
import com.example.pizzamakerservice.model.Product;
import com.example.pizzamakerservice.model.dto.ProductDto;
import com.example.pizzamakerservice.repository.ProductRepository;
import com.example.pizzamakerservice.service.ProductService;


import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product readByProductType(int productTypeId) {
        return null;
    }

    @Override
    public ProductDto read(int id) {
        ProductDto productDto = new ProductDto();
        List<ProductDto> fromDb = productRepository.read(id);

        productDto.setId(fromDb.get(0).getId());
        productDto.setProductTypeId(fromDb.get(0).getProductTypeId());
        productDto.setPrice(fromDb.get(0).getPrice());
        productDto.setName(fromDb.get(0).getName());
        productDto.setImagePath(fromDb.get(0).getImagePath());
        productDto.setCurrency(fromDb.get(0).getCurrency());
        productDto.setIngredients(new LinkedList<>());

        fromDb.forEach(item -> {
            Ingredient ingredient = new Ingredient(item.getIngredientId(), item.getIngredientName());
            productDto.getIngredients().add(ingredient);
        });

        return productDto;
    }


    @Override
    public List<ProductDto> readAll() {
//        ProductDto productDto=new ProductDto();
//        List<ProductDto> fromData=productRepository.readAll();
      return null;

    }

    @Override
    public void create(Product product) {

    }

    @Override
    public List<ProductDto> readAllByProductType(int productTypeId) {
        return null;
    }



    @Override
    public Product update(int id, Product product) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product read(String name) {
        return null;
    }

    @Override
    public Product read(float price) {
        return null;
    }
}
