package com.example.factorypattern.controllers;

import com.example.factorypattern.factories.FactoryFord;
import com.example.factorypattern.factories.FactoryMazda;
import com.example.factorypattern.factories.FactoryToyota;
import com.example.factorypattern.services.VehiculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculoController {
    private final VehiculoService vehiculoService;
    private final FactoryToyota factoryToyota;
    private final FactoryFord factoryFord;
    private final FactoryMazda factoryMazda;

    public VehiculoController(VehiculoService vehiculoService, FactoryToyota factoryToyota, FactoryFord factoryFord, FactoryMazda factoryMazda) {
        this.vehiculoService = vehiculoService;
        this.factoryToyota = factoryToyota;
        this.factoryFord = factoryFord;
        this.factoryMazda = factoryMazda;
    }

    @GetMapping("/vehiculo")
    public String crearVehiculo(@RequestParam String marca){
        switch(marca.toLowerCase()){
            case "toyota":
                vehiculoService.crearVehiculo(factoryToyota);
                break;
            case  "ford":
                vehiculoService.crearVehiculo(factoryFord);
                break;
            case "mazda":
                vehiculoService.crearVehiculo(factoryMazda);
                break;
            default:
                return "Marca no disponible";
        }
        return vehiculoService.mostrarInfo();
    }
}