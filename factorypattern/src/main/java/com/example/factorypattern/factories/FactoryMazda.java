package com.example.factorypattern.factories;

import org.springframework.stereotype.Component;

@Component
public class FactoryMazda implements IAbstractFactory{

    @Override
    public String crearChasis() {
        return "Chasis -> Mazda";
    }

    @Override
    public String crearMotor() {
        return "Motor -> Mazda";
    }

    @Override
    public String crearCojineria() {
        return "Cojineria -> Mazda";
    }
}
