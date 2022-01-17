package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.Ingredient;

import java.util.List;

public interface IngredientService {

    Ingredient read (int id);

    List<Ingredient> readAll();

    void create();

    Ingredient update(int id,Ingredient ingredient);

    void delete (int id);

}
