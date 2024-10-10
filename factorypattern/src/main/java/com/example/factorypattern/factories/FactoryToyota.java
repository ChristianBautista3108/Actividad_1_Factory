package com.example.factorypattern.factories;

import org.springframework.stereotype.Component;

@Component
public class FactoryToyota implements IAbstractFactory {
    @Override
    public String crearChasis(){
        return "Chasis ->Toyota";
    }

    @Override
    public String crearMotor() {
        return "Motor -> Toyota";
    }

    @Override
    public String crearCojineria() {
        return "Cojineria -> Toyota";
    }
}
