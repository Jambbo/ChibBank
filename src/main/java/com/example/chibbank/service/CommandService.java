package com.example.chibbank.service;

public interface CommandService<T> {

    void create(T object);

}
