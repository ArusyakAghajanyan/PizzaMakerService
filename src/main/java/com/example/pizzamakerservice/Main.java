package com.example.pizzamakerservice;

import com.example.pizzamakerservice.repository.ProductTypeRepository;
import com.example.pizzamakerservice.repository.TableRepository;

public class Main {
    public static void main(String[] args) {
//        TableRepository tableRepository = new TableRepository();
//
//        System.out.println(tableRepository.readAll());

       ProductTypeRepository productTypeRepository = new ProductTypeRepository();

        System.out.println(productTypeRepository.readAll());
    }

}
