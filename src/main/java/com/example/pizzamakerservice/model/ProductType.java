package com.example.pizzamakerservice.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


public class ProductType {
    private int id;
    private String name;

}
