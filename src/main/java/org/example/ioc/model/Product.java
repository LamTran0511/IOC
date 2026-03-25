package org.example.ioc.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private int id;
    private String name;
    private double price;
}
