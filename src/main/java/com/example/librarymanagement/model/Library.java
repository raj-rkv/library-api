package com.example.librarymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Library {
    private String name;
    private String address;
    private int libraryNumber;
    private List<String> facilities;
}
