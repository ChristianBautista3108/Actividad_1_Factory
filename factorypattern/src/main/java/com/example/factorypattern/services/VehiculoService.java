package com.example.factorypattern.services;

import com.example.factorypattern.factories.IAbstractFactory;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    private String chasis;
    private String motor;
    private String cojineria;

    public void crearVehiculo(IAbstractFactory factory){
        chasis = factory.crearChasis();
        motor = factory.crearMotor();
        cojineria = factory.crearCojineria();
    }

    public String mostrarInfo(){
        return "Vehiculo con: " + chasis + ", motor: " + motor + ", cojineria: " + cojineria;
    }
}
