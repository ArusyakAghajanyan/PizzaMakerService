package com.example.pizzamakerservice.model.dto;

import com.example.pizzamakerservice.model.Ingredient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int id;


    private int productTypeId;

    private float price;

    private String name;

    private transient int ingredientId;

    private transient String ingredientName;

    private String imagePath;

    private String currency;

    private List<Ingredient> ingredients;


}
