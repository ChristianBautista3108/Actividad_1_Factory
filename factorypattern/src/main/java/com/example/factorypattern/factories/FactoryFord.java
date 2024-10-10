package com.example.factorypattern.factories;

import org.springframework.stereotype.Component;

@Component
public class FactoryFord implements IAbstractFactory{

    @Override
    public String crearChasis() {
        return "Chasis -> Ford";
    }

    @Override
    public String crearMotor() {
        return "Motor -> Ford";
    }

    @Override
    public String crearCojineria() {
        return "Cojineria -> Ford";
    }
}
