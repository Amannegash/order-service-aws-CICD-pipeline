package com.example.orderservice;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(
                new Order(101,"Mobile",1,3000),
                new Order(102,"TV",1,5000),
                new Order(103,"Laptop",1,8000))
                .collect(Collectors.toList());

    }
}
