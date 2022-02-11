package com.example.pizzamakerservice.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;

    private int tableId;

    private boolean inProcess;

    private int productId;

    private int quantity;

    private float amount;
}
