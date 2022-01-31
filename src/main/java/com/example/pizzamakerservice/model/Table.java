package com.example.pizzamakerservice.model;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


public class Table {
    private int id;
    private int number;
    private int seats;
    private boolean busy;

}

