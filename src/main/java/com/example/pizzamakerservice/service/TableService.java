package com.example.pizzamakerservice.service;

import javax.persistence.Table;
import java.util.List;

public interface TableService {

    Table read (int id);

    List <Table> readAll();

    void create ();

    Table update (int id, Table table);

    void delete (int id);
}
