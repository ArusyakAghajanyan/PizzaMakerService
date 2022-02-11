package com.example.pizzamakerservice.model.dto;
import com.example.pizzamakerservice.model.Product;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private int tableId;

    private boolean inProcess;

    private int quantity;

    private float amount;

    private List<Product> products;
}