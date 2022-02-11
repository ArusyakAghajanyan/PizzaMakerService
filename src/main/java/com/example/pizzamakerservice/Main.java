package com.example.pizzamakerservice;

import com.example.pizzamakerservice.repository.OrderRepository;
import com.example.pizzamakerservice.repository.ProductRepository;
import com.example.pizzamakerservice.repository.ProductTypeRepository;
import com.example.pizzamakerservice.repository.TableRepository;
import com.example.pizzamakerservice.service.OrderService;
import com.example.pizzamakerservice.service.ProductService;
import com.example.pizzamakerservice.service.impl.OrderServiceImpl;
import com.example.pizzamakerservice.service.impl.ProductServiceImpl;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();

//        System.out.println(new Gson().toJson(orderService.read(1)));
        System.out.println(new Gson().toJson(orderService.readAll()));

//
//        OrderRepository orderRepository = new OrderRepository();
//        ProductService productService = new ProductServiceImpl();

    }
}
